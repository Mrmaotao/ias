
package cn.tit.ias.util.equipmentfactory;

import org.xvolks.jnative.exceptions.NativeException;
import org.xvolks.jnative.pointers.Pointer;
import org.xvolks.jnative.pointers.memory.MemoryBlockFactory;

import cn.tit.ias.util.readtool.ToolLibrary;

/**
 * 
 *  
 * @Description:读写器的抽象工厂  
 * @author: maotao 
 * @date:   2019年5月28日 下午9:06:57       
 *
 */
public abstract class ScanFactory {
	short CardType;
	byte CardMem;
	byte LengthUID;
	byte UID[];
	byte Mode = 1;
	protected ToolLibrary readerTool;
	protected int readerID;
	protected boolean Connected;
	protected byte Data[];
    protected String strData;
    
    /**
     * 
     * @Title: setConnect   
     * @Description: 与读写器建立连接  
     * @param: @throws NativeException      
     * @return: void      
     * @throws
     */
    public void setConnect() throws NativeException {
		if (!ConnectYOWOreaderTool())
			return;
		if (readerTool.YW_SearchCardModeEx(readerID, readerTool.SEARCHMODE_14443A, 0) < 0)
			return;
		Pointer pCardType = new Pointer(MemoryBlockFactory.createMemoryBlock(2));
		if (readerTool.YW_RequestCard(readerID, readerTool.REQUESTMODE_ALL, pCardType) < 0)
			return;
		CardType = pCardType.getAsShort(0);
		Pointer pCardMem = new Pointer(MemoryBlockFactory.createMemoryBlock(1));
		Pointer pLengthUID = new Pointer(MemoryBlockFactory.createMemoryBlock(1));
		Pointer pUID = new Pointer(MemoryBlockFactory.createMemoryBlock(20));

		if (readerTool.YW_AntiCollideAndSelect(readerID, Mode, pCardMem, pLengthUID, pUID) < 0)
			return;
		CardMem = pCardMem.getAsByte(0);
		LengthUID = pLengthUID.getAsByte(0);
		UID = pUID.getMemory();
		HexToStr(UID, LengthUID);
		System.out.println(HexToStr(UID, LengthUID));

	}
    
    /**
     * 
     * @Title: disConnect   
     * @Description: 断开设备的连接   
     * @param:       
     * @return: void      
     * @throws
     */
	public void disConnect() {
		if (Connected)
			DisConnectYOWOreaderTool();
		Connected = false;
	}
	
	/**
	 * 
	 * @Title: ConnectYOWOreaderTool   
	 * @Description: 判断并连接usb驱动 
	 * @param: @return      
	 * @return: boolean      
	 * @throws
	 */
    protected boolean ConnectYOWOreaderTool() {

		if (Connected) {
			System.out.println("已连接！");
			return true;
		}

		if (readerTool.YW_USBHIDInitial() > 0) {
			readerID = readerTool.YW_GetReaderID(0);
			System.out.println("连接成功！");
			Connected = true;
		} else {
			System.out.println("请重新连接读卡器");
			Connected = false;
		}
		return Connected;
	}
    /** */
    
    /**
     * 
     * @Title: DisConnectYOWOreaderTool   
     * @Description: 断开usb驱动的连接   
     * @param:       
     * @return: void      
     * @throws
     */
 	protected void DisConnectYOWOreaderTool() {
 		readerTool.YW_USBHIDFree();
 	}

 	/**
 	 * 
 	 * @Title: StrToHex   
 	 * @Description: 字符串转16进制   
 	 * @param: @param hexStr 字符串
 	 * @param: @param HexArr 存放十六进制数的数组
 	 * @param: @return     十六进制数的长度  
 	 * @return: int     
 	 * @throws
 	 */
 	protected int StrToHex(String hexStr, byte HexArr[]) {
 		int i;
 		int L;
 		byte b;
 		String s;

 		L = hexStr.length() / 2;

 		for (i = 0; i < L; i++) {
 			s = hexStr.substring(i * 2, i * 2 + 2);
 			b = (Long.valueOf(s, 16)).byteValue();
 			HexArr[i] = b;
 		}
 		return L;
 	}

 	/**
 	 * 
 	 * @Title: HexToStr   
 	 * @Description: 十六进制转字符串  
 	 * @param: @param HexArr存放十六进制数的数组
 	 * @param: @param ArrLen数据长度
 	 * @param: @return  十六进制数转换后的字符串    
 	 * @return: String      
 	 * @throws
 	 */
 	protected String HexToStr(byte HexArr[], int ArrLen) {
 		String Result = "";
 		String s;
 		for (int i = 0; i < ArrLen; i++) {
 			s = "00" + Long.toHexString(HexArr[i]);
 			Result = Result + s.substring(s.length() - 2);
 		}

 		return Result.toUpperCase();
 	}
}
