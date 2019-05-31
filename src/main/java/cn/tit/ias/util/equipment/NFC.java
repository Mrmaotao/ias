package cn.tit.ias.util.equipment;


import org.xvolks.jnative.exceptions.NativeException;
import org.xvolks.jnative.pointers.Pointer;
import org.xvolks.jnative.pointers.memory.MemoryBlockFactory;

import cn.tit.ias.util.equipmentfactory.ScanFactory;
import cn.tit.ias.util.readtool.ToolLibrary;
/**
 * 
 *  
 * @Description:NFC读写器   
 * @author: maotao 
 * @date:   2019年5月28日 下午9:13:19       
 *
 */
public class NFC extends ScanFactory {
	Byte KeyMode;
	int BlockAddr;
	byte Key[] = new byte[6];

	public NFC() {
		init();
	}

	public void init() {
		Connected = false;
		readerTool = new ToolLibrary();
		ConnectYOWOreaderTool();
		try {
			setConnect();
		} catch (NativeException e) {
			e.printStackTrace();
		}
	}
    /**
     * 
     * @Title: readData   
     * @Description: NFC读数据   
     * @param: @throws NativeException      
     * @return: void      
     * @throws
     */
	public void readData() throws NativeException {
		if (!ConnectYOWOreaderTool())
			return;
		KeyMode = readerTool.PASSWORD_A;
		BlockAddr = 1;
		StrToHex("FFFFFFFFFFFF", Key);
		Pointer pKey = new Pointer(MemoryBlockFactory.createMemoryBlock(6));
		pKey.setMemory(Key);
		if (readerTool.YW_KeyAuthorization(readerID, KeyMode, BlockAddr, pKey) < 0) {
			// ShowMsg("密钥认证失败");
			System.out.println("密钥认证失败");
			return;
		}

		Pointer pData = new Pointer(MemoryBlockFactory.createMemoryBlock(20));
		if (readerTool.YW_ReadaBlock(readerID, BlockAddr, 16, pData) < 0)
			return;
		Data = pData.getMemory();
		HexToStr(Data, 16);
		System.out.println(HexToStr(Data, 16));
	}
    /**
     * 
     * @Title: writeData   
     * @Description: NFC写数据   
     * @param:       
     * @return: void      
     * @throws
     */
	public void writeData() {
		try {
			if (!ConnectYOWOreaderTool())
				return;
			KeyMode = readerTool.PASSWORD_A;
			BlockAddr = 1;
			StrToHex("FFFFFFFFFFFF", Key);
			StrToHex(strData, Data);
			Pointer pKey = new Pointer(MemoryBlockFactory.createMemoryBlock(6));
			pKey.setMemory(Key);
			if (readerTool.YW_KeyAuthorization(readerID, KeyMode, BlockAddr, pKey) < 0) {
				System.out.println("密钥验证失败");
				return;
			}

			Pointer pData = new Pointer(MemoryBlockFactory.createMemoryBlock(20));
			pData.setMemory(Data);
			if (readerTool.YW_WriteaBlock(readerID, BlockAddr, 16, pData) < 0) {
				System.out.println("写入失败！");
			} else {
				System.out.println("写入成功！");
			}
		} catch (NativeException ef) {

		}

	}
}
