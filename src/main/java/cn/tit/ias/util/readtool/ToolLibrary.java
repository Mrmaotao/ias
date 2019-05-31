package cn.tit.ias.util.readtool;
import org.xvolks.jnative.JNative;
import org.xvolks.jnative.Type;
import org.xvolks.jnative.exceptions.NativeException;
import org.xvolks.jnative.pointers.Pointer;
/**
 * 
 *  
 * @Description:设备连接所需的方法工具   
 * @author: maotao 
 * @date:   2019年5月28日 下午9:14:39       
 *
 */
public class ToolLibrary {
	public final byte SEARCHMODE_14443A = 65;
	public final byte SEARCHMODE_14443B = 66;
	public final byte SEARCHMODE_15693 = 49;
	public final byte SEARCHMODE_ST = 83;
	public final byte SEARCHMODE_AT88RF020 = 82;
	public final byte SEARCHMODE_TOPAZ = 84;
	public final byte SEARCHMODE_FELICA = 70;

	public final byte  REQUESTMODE_ALL = 82;
	public final byte  REQUESTMODE_ACTIVE = 38;

	public final int SAM_BOUND_9600 = 0;
	public final int SAM_BOUND_38400 = 1;

	public final byte PASSWORD_A = 96;
	public final byte PASSWORD_B = 97;

	public final int ENCRYPT = 0;
	public final int DECRYPT = 1;

	public final int LED_ALIGNMENT_LEFT = 1;
	public final int LED_ALIGNMENT_CENTER = 2;
	public final int LED_ALIGNMENT_RIGHT = 3;

	public final int FELICA_SYSTEMCODE_WILDCARD = 65535;

	public final byte FELICA_REQUESTCODE_NOREQUEST = 0;
	public final byte FELICA_REQUESTCODE_SYSTEMCODEREQUEST = 1;
	public final byte FELICA_REQUESTCODE_CPR = 2;

	public ToolLibrary(){}
	
	public int YW_GetDLLVersion()
	{
		int ret;
		try
        {
                JNative fuc = new JNative("YW60x.dll", "YW_GetDLLVersion");
                fuc.setRetVal(Type.INT);
                fuc.invoke();
                ret = fuc.getRetValAsInt();
        
        }
        catch(NativeException e)
        {
              ret = -1;
        }
        catch(IllegalAccessException e)
        {
                ret = -2;
        }

        return ret;			
		
	}
	/**
	 * 
	 * @Title: DES   
	 * @Description: TODO(这里用一句话描述这个方法的作用)   
	 * @param: @param cModel
	 * @param: @param pkey
	 * @param: @param in
	 * @param: @param out
	 * @param: @return      
	 * @return: int      
	 * @throws
	 */
	public int DES(byte cModel, Pointer pkey, Pointer in, Pointer out)
	{
		int ret;
		try
        {
                JNative fuc = new JNative("YW60x.dll", "DES");
                fuc.setRetVal(Type.INT);
                fuc.setParameter(0, cModel);
                fuc.setParameter(1,pkey);
                fuc.setParameter(2,in);
                fuc.setParameter(3,out); 
                fuc.invoke();
                ret = fuc.getRetValAsInt();
        
        }
        catch(NativeException e)
        {
              ret = -1;
        }
        catch(IllegalAccessException e)
        {
                ret = -2;
        }

        return ret;		
		
		
	}
	/**
	 * 
	 * @Title: DES3   
	 * @Description: TODO(这里用一句话描述这个方法的作用)   
	 * @param: @param cModel
	 * @param: @param pKey
	 * @param: @param pInData
	 * @param: @param pOutData
	 * @param: @return      
	 * @return: int      
	 * @throws
	 */
	public int DES3(byte cModel, Pointer pKey, Pointer pInData, Pointer pOutData)
	{
		int ret;
		try
        {
                JNative fuc = new JNative("YW60x.dll", "DES3");
                fuc.setRetVal(Type.INT);
                fuc.setParameter(0, cModel);
                fuc.setParameter(1,pKey);
                fuc.setParameter(2,pInData);
                fuc.setParameter(3,pOutData);
                fuc.invoke();
                ret = fuc.getRetValAsInt();
        
        }
        catch(NativeException e)
        {
              ret = -1;
        }
        catch(IllegalAccessException e)
        {
                ret = -2;
        }

        return ret;		
		
			
		
	}
	/**
	 * 
	 * @Title: DES3_CBC   
	 * @Description: TODO(这里用一句话描述这个方法的作用)   
	 * @param: @param cModel
	 * @param: @param pKey
	 * @param: @param pInData
	 * @param: @param pOutData
	 * @param: @param pIV
	 * @param: @return      
	 * @return: int      
	 * @throws
	 */
	public int DES3_CBC(byte cModel,  Pointer pKey,Pointer pInData, Pointer pOutData, Pointer pIV)
	{
		int ret;
		try
        {
                JNative fuc = new JNative("YW60x.dll", "DES3_CBC");
                fuc.setRetVal(Type.INT);
                fuc.setParameter(0, cModel);
                fuc.setParameter(1,pKey);
                fuc.setParameter(2,pInData);
                fuc.setParameter(3,pOutData);
                fuc.setParameter(4,pIV);
                fuc.invoke();
                ret = fuc.getRetValAsInt();
        
        }
        catch(NativeException e)
        {
              ret = -1;
        }
        catch(IllegalAccessException e)
        {
                ret = -2;
        }

        return ret;		
			
		
	}
	
	public int YW_ComInitial(int PortIndex, int Baud)
	{
		int ret;
		try
        {
                JNative fuc = new JNative("YW60x.dll", "YW_ComInitial");
                fuc.setRetVal(Type.INT);
                fuc.setParameter(0, PortIndex);
                fuc.setParameter(1,Baud);
                fuc.invoke();
                ret = fuc.getRetValAsInt();
        
        }
        catch(NativeException e)
        {
              ret = -1;
        }
        catch(IllegalAccessException e)
        {
                ret = -2;
        }

        return ret;				
		
	}
	public int YW_ComFree()
	{
		int ret;
		try
        {
                JNative fuc = new JNative("YW60x.dll", "YW_ComFree");
                fuc.setRetVal(Type.INT);
                fuc.invoke();
                ret = fuc.getRetValAsInt();
        
        }
        catch(NativeException e)
        {
              ret = -1;
        }
        catch(IllegalAccessException e)
        {
                ret = -2;
        }

        return ret;		
		
	}

/**
 * 
 * @Title: YW_USBHIDInitial   
 * @Description: 连接usb   
 * @param: @return      
 * @return: int      
 * @throws
 */
	public int YW_USBHIDInitial()
	{
		int ret;
		try
		
        {
			    System.setProperty("jnative.debug", "true");
                JNative fuc = new JNative("YW60x.dll", "YW_USBHIDInitial");
                fuc.setRetVal(Type.INT);
                fuc.invoke();
                ret = fuc.getRetValAsInt();
        
        }
        catch(NativeException e)
        {
              ret = -1;
        }
        catch(IllegalAccessException e)
        {
                ret = -2;
        }

        return ret;		
		
	}

	/**
	 * 
	 * @Title: YW_USBHIDFree   
	 * @Description: 释放usb   
	 * @param: @return      
	 * @return: int      
	 * @throws
	 */
	public int YW_USBHIDFree()
	{
		int ret;
		try
        {
                JNative fuc = new JNative("YW60x.dll.dll", "YW_USBHIDFree");

                fuc.setRetVal(Type.INT);
                fuc.invoke();

                ret = fuc.getRetValAsInt();
        }
        catch(NativeException e)
        {
                ret = -1;
        }
        catch(IllegalAccessException e)
        {
                ret = -2;
        }

        return ret;		
		
	}
	
	public int YW_ComNewBound(int ReaderID, int NewBound)
	{
		int ret;
		try
        {
                JNative fuc = new JNative("YW60x.dll", "YW_ComNewBound");
                fuc.setRetVal(Type.INT);
                fuc.setParameter(0, ReaderID);
                fuc.setParameter(1,NewBound);
                fuc.invoke();
                ret = fuc.getRetValAsInt();
        
        }
        catch(NativeException e)
        {
              ret = -1;
        }
        catch(IllegalAccessException e)
        {
                ret = -2;
        }

        return ret;			
		
	}
    
	public int YW_SetReaderID(int OldID, int NewID)
	{
		int ret;
		try
        {
                JNative fuc = new JNative("YW60x.dll", "YW_SetReaderID");
                fuc.setRetVal(Type.INT);
                fuc.setParameter(0, OldID);
                fuc.setParameter(1,NewID);
                fuc.invoke();
                ret = fuc.getRetValAsInt();
        
        }
        catch(NativeException e)
        {
              ret = -1;
        }
        catch(IllegalAccessException e)
        {
                ret = -2;
        }

        return ret;			
		
	}
    
	public int YW_GetReaderID(int ReaderID)
	{
		int ret;
		try
        {
                JNative fuc = new JNative("YW60x.dll", "YW_GetReaderID");
                fuc.setRetVal(Type.INT);
                fuc.setParameter(0, ReaderID);
                fuc.invoke();
                ret = fuc.getRetValAsInt();
        
        }
        catch(NativeException e)
        {
              ret = -1;
        }
        catch(IllegalAccessException e)
        {
                ret = -2;
        }

        return ret;		
		
	}
    
	public int YW_GetReaderVersion(int ReaderID)
	{
		int ret;
		try
        {
                JNative fuc = new JNative("YW60x.dll", "YW_GetReaderVersion");
                fuc.setRetVal(Type.INT);
                fuc.setParameter(0, ReaderID);
                fuc.invoke();
                ret = fuc.getRetValAsInt();
        
        }
        catch(NativeException e)
        {
              ret = -1;
        }
        catch(IllegalAccessException e)
        {
                ret = -2;
        }

        return ret;		
		
	}
   
	public int YW_GetReaderSerial(int ReaderID, Pointer ReaderSerial)
	{
		int ret;
		try
        {
                JNative fuc = new JNative("YW60x.dll", "YW_GetReaderVersion");
                fuc.setRetVal(Type.INT);
                fuc.setParameter(0, ReaderID);
                fuc.setParameter(0, ReaderSerial);
                fuc.invoke();
                ret = fuc.getRetValAsInt();
        
        }
        catch(NativeException e)
        {
              ret = -1;
        }
        catch(IllegalAccessException e)
        {
                ret = -2;
        }

        return ret;	
		
	}

	public int YW_GetReaderNo(int ReaderID, Pointer ReadeNo)
	{
		int ret;
		try
        {
                JNative fuc = new JNative("YW60x.dll", "YW_GetReaderNo");
                fuc.setRetVal(Type.INT);
                fuc.setParameter(0, ReaderID);
                fuc.setParameter(0, ReadeNo);
                fuc.invoke();
                ret = fuc.getRetValAsInt();
        
        }
        catch(NativeException e)
        {
              ret = -1;
        }
        catch(IllegalAccessException e)
        {
                ret = -2;
        }

        return ret;		
		
	}
	
	/*	
	Pointer pTagNums = new Pointer(MemoryBlockFactory.createMemoryBlock(4));
    id = new byte[10000];
    Pointer pID = new Pointer(MemoryBlockFactory.createMemoryBlock(1000));
    ret = (byte)dll.YW_SearchTag(ReaderID,  pTagNums, pID);
    nTagNums = pTagNums.getAsInt(0);
    id = pID.getMemory();
 */   
    
	public int YW_Buzzer(int ReaderID,int Time_ON, int Time_OFF, int Cycle)
	{
        int ret;
		try
        {
                JNative fuc = new JNative("YW60x.dll", "YW_Buzzer");

                fuc.setRetVal(Type.INT);
                fuc.setParameter(0, ReaderID);
                fuc.setParameter(1, Time_ON);
                fuc.setParameter(2, Time_OFF);
                fuc.setParameter(3, Cycle);
                fuc.invoke();

                ret = fuc.getRetValAsInt();
        }
        catch(NativeException e)
        {
                 ret = -1;
        }
        catch(IllegalAccessException e)
        {
                ret = -2;
        }

        return ret;		
		
	}
	
	public int YW_Led(int ReaderID,int LEDIndex, int Time_ON, int Time_OFF, int Cycle, int LedIndexOn)
	{
        int ret;
		try
        {
                JNative fuc = new JNative("YW60x.dll", "YW_Led");

                fuc.setRetVal(Type.INT);
                fuc.setParameter(0, ReaderID);
                fuc.setParameter(1, LEDIndex);
                fuc.setParameter(2, Time_ON);
                fuc.setParameter(3, Time_OFF);
                fuc.setParameter(4, Cycle);
                fuc.setParameter(5, LedIndexOn);
                fuc.invoke();

                ret = fuc.getRetValAsInt();
        }
        catch(NativeException e)
        {
                 ret = -1;
        }
        catch(IllegalAccessException e)
        {
                ret = -2;
        }

        return ret;		
		
	}
	
	public int YW_LEDDisplay(int ReaderID,int Alignment,Pointer LEDText)
	{
        int ret;
		try
        {
                JNative fuc = new JNative("YW60x.dll", "YW_LEDDisplay");

                fuc.setRetVal(Type.INT);
                fuc.setParameter(0, ReaderID);
                fuc.setParameter(1, Alignment);
                fuc.setParameter(2, LEDText);
                fuc.invoke();

                ret = fuc.getRetValAsInt();
        }
        catch(NativeException e)
        {
                 ret = -1;
        }
        catch(IllegalAccessException e)
        {
                ret = -2;
        }

        return ret;		
		
	}
	
	public int YW_AntennaStatus(int ReaderID,boolean Status)
	{
        int ret;
        int bOpen;
		try
        {
                JNative fuc = new JNative("YW60x.dll", "YW_AntennaStatus");

                fuc.setRetVal(Type.INT);
                fuc.setParameter(0, ReaderID);
                bOpen=0;
                if(Status)bOpen=255;
                fuc.setParameter(1,bOpen);
                fuc.invoke();

                ret = fuc.getRetValAsInt();
        }
        catch(NativeException e)
        {
                 ret = -1;
        }
        catch(IllegalAccessException e)
        {
                ret = -2;
        }

        return ret;		
		
	}
	
	public int YW_SearchCardMode(int ReaderID,int SearchMode)
	{
        int ret;
		try
        {
                JNative fuc = new JNative("YW60x.dll", "YW_SearchCardMode");

                fuc.setRetVal(Type.INT);
                fuc.setParameter(0, ReaderID);
                fuc.setParameter(1,SearchMode);
                fuc.invoke();

                ret = fuc.getRetValAsInt();
        }
        catch(NativeException e)
        {
                 ret = -1;
        }
        catch(IllegalAccessException e)
        {
                ret = -2;
        }

        return ret;		
		
	}
	
	public int YW_SearchCardModeEx(int ReaderID,int Mode,int Param)
	{
        int ret;
		try
        {
                JNative fuc = new JNative("YW60x.dll", "YW_SearchCardModeEx");

                fuc.setRetVal(Type.INT);
                fuc.setParameter(0, ReaderID);
                fuc.setParameter(1,Mode);
                fuc.setParameter(2,Param);
                fuc.invoke();

                ret = fuc.getRetValAsInt();
        }
        catch(NativeException e)
        {
                 ret = -1;
        }
        catch(IllegalAccessException e)
        {
                ret = -2;
        }

        return ret;			
		
	}
	
	public int YW_RequestCard(int ReaderID,int RequestMode , Pointer CardType)
	{
        int ret;
		try
        {
                JNative fuc = new JNative("YW60x.dll", "YW_RequestCard");

                fuc.setRetVal(Type.INT);
                fuc.setParameter(0, ReaderID);
                fuc.setParameter(1,RequestMode);
                fuc.setParameter(2,CardType);
                fuc.invoke();
                ret = fuc.getRetValAsInt();
                
        }
        catch(NativeException e)
        {
                 ret = -1;
        }
        catch(IllegalAccessException e)
        {
                ret = -2;
        }

        return ret;		
		
	}
	
	public int YW_AntiCollide(int ReaderID,Pointer LenSNO, Pointer SNO)
	{
        int ret;
		try
        {
                JNative fuc = new JNative("YW60x.dll", "YW_AntiCollide");

                fuc.setRetVal(Type.INT);
                fuc.setParameter(0, ReaderID);
                fuc.setParameter(1,LenSNO);
                fuc.setParameter(2,SNO);
                fuc.invoke();

                ret = fuc.getRetValAsInt();
        }
        catch(NativeException e)
        {
                 ret = -1;
        }
        catch(IllegalAccessException e)
        {
                ret = -2;
        }

        return ret;		
		
	}
	
	public int YW_CardSelect(int ReaderID,byte LenSNO, Pointer SNO)
	{
        int ret;
		try
        {
                JNative fuc = new JNative("YW60x.dll", "YW_CardSelect");

                fuc.setRetVal(Type.INT);
                fuc.setParameter(0, ReaderID);
                fuc.setParameter(1,LenSNO);
                fuc.setParameter(2,SNO);
                fuc.invoke();

                ret = fuc.getRetValAsInt();
        }
        catch(NativeException e)
        {
                 ret = -1;
        }
        catch(IllegalAccessException e)
        {
                ret = -2;
        }

        return ret;		
		
	}
	
	public int YW_KeyAuthorization(int ReaderID,int KeyMode, int BlockAddr,  Pointer Key)
	{
        int ret;
		try
        {
                JNative fuc = new JNative("YW60x.dll", "YW_KeyAuthorization");

                fuc.setRetVal(Type.INT);
                fuc.setParameter(0, ReaderID);
                fuc.setParameter(1,KeyMode);
                fuc.setParameter(2,BlockAddr);
                fuc.setParameter(3,Key);
                fuc.invoke();

                ret = fuc.getRetValAsInt();
        }
        catch(NativeException e)
        {
                 ret = -1;
        }
        catch(IllegalAccessException e)
        {
                ret = -2;
        }

        return ret;		
		
	}
	
	public int YW_ReadaBlock(int ReaderID,int BlockAddr, int LenData,Pointer  pData)
	{
        int ret;
		try
        {
                JNative fuc = new JNative("YW60x.dll", "YW_ReadaBlock");

                fuc.setRetVal(Type.INT);
                fuc.setParameter(0, ReaderID);
                fuc.setParameter(1,BlockAddr);
                fuc.setParameter(2,LenData);
                fuc.setParameter(3,pData);
                fuc.invoke();

                ret = fuc.getRetValAsInt();
        }
        catch(NativeException e)
        {
                 ret = -1;
        }
        catch(IllegalAccessException e)
        {
                ret = -2;
        }

        return ret;		
		
	}
	
	public int YW_WriteaBlock(int ReaderID,int BlockAddr, int LenData,Pointer  pData)
	{
        int ret;
		try
        {
                JNative fuc = new JNative("YW60x.dll", "YW_WriteaBlock");

                fuc.setRetVal(Type.INT);
                fuc.setParameter(0, ReaderID);
                fuc.setParameter(1,BlockAddr);
                fuc.setParameter(2,LenData);
                fuc.setParameter(3,pData);
                fuc.invoke();

                ret = fuc.getRetValAsInt();
        }
        catch(NativeException e)
        {
                 ret = -1;
        }
        catch(IllegalAccessException e)
        {
                ret = -2;
        }

        return ret;		
		
	}
	
	public int YW_Purse_Initial(int ReaderID,int BlockAddr, int IniMoney)
	{
        int ret;
		try
        {
                JNative fuc = new JNative("YW60x.dll", "YW_Purse_Initial");

                fuc.setRetVal(Type.INT);
                fuc.setParameter(0, ReaderID);
                fuc.setParameter(1,BlockAddr);
                fuc.setParameter(2,IniMoney);
                fuc.invoke();

                ret = fuc.getRetValAsInt();
        }
        catch(NativeException e)
        {
                 ret = -1;
        }
        catch(IllegalAccessException e)
        {
                ret = -2;
        }

        return ret;		
		
	}	
	
	public int YW_Purse_Read(int ReaderID,int BlockAddr, Pointer Money)
	{
        int ret;
		try
        {
                JNative fuc = new JNative("YW60x.dll", "YW_Purse_Read");

                fuc.setRetVal(Type.INT);
                fuc.setParameter(0, ReaderID);
                fuc.setParameter(1,BlockAddr);
                fuc.setParameter(2,Money);
                fuc.invoke();

                ret = fuc.getRetValAsInt();
        }
        catch(NativeException e)
        {
                 ret = -1;
        }
        catch(IllegalAccessException e)
        {
                ret = -2;
        }

        return ret;		
		
	}
	
	public int YW_Purse_Decrease(int ReaderID,int BlockAddr, int Decrement)
	{
        int ret;
		try
        {
                JNative fuc = new JNative("YW60x.dll", "YW_Purse_Decrease");

                fuc.setRetVal(Type.INT);
                fuc.setParameter(0, ReaderID);
                fuc.setParameter(1,BlockAddr);
                fuc.setParameter(2,Decrement);
                fuc.invoke();

                ret = fuc.getRetValAsInt();
        }
        catch(NativeException e)
        {
                 ret = -1;
        }
        catch(IllegalAccessException e)
        {
                ret = -2;
        }

        return ret;		
		
	}
	
	public int YW_Purse_Charge(int ReaderID,int BlockAddr, int Charge)
	{
        int ret;
		try
        {
                JNative fuc = new JNative("YW60x.dll", "YW_Purse_Charge");

                fuc.setRetVal(Type.INT);
                fuc.setParameter(0, ReaderID);
                fuc.setParameter(1,BlockAddr);
                fuc.setParameter(2,Charge);
                fuc.invoke();

                ret = fuc.getRetValAsInt();
        }
        catch(NativeException e)
        {
                 ret = -1;
        }
        catch(IllegalAccessException e)
        {
                ret = -2;
        }

        return ret;		
		
	}

	
	public int YW_Restore(int ReaderID,int BlockAddr)
	{
        int ret;
		try
        {
                JNative fuc = new JNative("YW60x.dll", "YW_Restore");

                fuc.setRetVal(Type.INT);
                fuc.setParameter(0, ReaderID);
                fuc.setParameter(1,BlockAddr);
                fuc.invoke();

                ret = fuc.getRetValAsInt();
        }
        catch(NativeException e)
        {
                 ret = -1;
        }
        catch(IllegalAccessException e)
        {
                ret = -2;
        }

        return ret;				
		
	}

	public int YW_Transfer(int ReaderID,int BlockAddr)
	{
        int ret;
		try
        {
                JNative fuc = new JNative("YW60x.dll", "YW_Transfer");

                fuc.setRetVal(Type.INT);
                fuc.setParameter(0, ReaderID);
                fuc.setParameter(1,BlockAddr);
                fuc.invoke();

                ret = fuc.getRetValAsInt();
        }
        catch(NativeException e)
        {
                 ret = -1;
        }
        catch(IllegalAccessException e)
        {
                ret = -2;
        }

        return ret;				
		
	}


	public int YW_DownLoadKey(int ReaderID,int KeyIndex,  Pointer Key)
	{
        int ret;
		try
        {
                JNative fuc = new JNative("YW60x.dll", "YW_DownLoadKey");

                fuc.setRetVal(Type.INT);
                fuc.setParameter(0, ReaderID);
                fuc.setParameter(1,KeyIndex);
                fuc.setParameter(2,Key);
                fuc.invoke();

                ret = fuc.getRetValAsInt();
        }
        catch(NativeException e)
        {
                 ret = -1;
        }
        catch(IllegalAccessException e)
        {
                ret = -2;
        }

        return ret;		
		
	}


	public int YW_KeyDown_Authorization(int ReaderID,byte KeyMode, int BlockAddr, byte KeyIndex)
	{
        int ret;
		try
        {
                JNative fuc = new JNative("YW60x.dll", "YW_KeyDown_Authorization");

                fuc.setRetVal(Type.INT);
                fuc.setParameter(0, ReaderID);
                fuc.setParameter(1,KeyMode);
                fuc.setParameter(2,BlockAddr);
                fuc.setParameter(3,KeyIndex);
                fuc.invoke();

                ret = fuc.getRetValAsInt();
        }
        catch(NativeException e)
        {
                 ret = -1;
        }
        catch(IllegalAccessException e)
        {
                ret = -2;
        }

        return ret;			
		
	}


	public int YW_CardHalt(int ReaderID)
	{
        int ret;
		try
        {
                JNative fuc = new JNative("YW60x.dll", "YW_CardHalt");

                fuc.setRetVal(Type.INT);
                fuc.setParameter(0, ReaderID);
                fuc.invoke();

                ret = fuc.getRetValAsInt();
        }
        catch(NativeException e)
        {
                 ret = -1;
        }
        catch(IllegalAccessException e)
        {
                ret = -2;
        }

        return ret;			
		
	}


	public int YW_AntiCollide_Level(int ReaderID,int Leveln,Pointer LenSNO, Pointer SNO)
	{
        int ret;
		try
        {
                JNative fuc = new JNative("YW60x.dll", "YW_AntiCollide_Level");

                fuc.setRetVal(Type.INT);
                fuc.setParameter(0, ReaderID);
                fuc.setParameter(1, Leveln);
                fuc.setParameter(2, LenSNO);
                fuc.setParameter(3, SNO);
                fuc.invoke();

                ret = fuc.getRetValAsInt();
        }
        catch(NativeException e)
        {
                 ret = -1;
        }
        catch(IllegalAccessException e)
        {
                ret = -2;
        }

        return ret;			
		
	}

	public int YW_SelectCard_Level(int ReaderID,int Leveln,Pointer SAK)
	{
        int ret;
		try
        {
                JNative fuc = new JNative("YW60x.dll", "YW_SelectCard_Level");

                fuc.setRetVal(Type.INT);
                fuc.setParameter(0, ReaderID);
                fuc.setParameter(1, Leveln);
                fuc.setParameter(2, SAK);
                fuc.invoke();

                ret = fuc.getRetValAsInt();
        }
        catch(NativeException e)
        {
                 ret = -1;
        }
        catch(IllegalAccessException e)
        {
                ret = -2;
        }

        return ret;	
		
	}
    //����ײ����ѡ��һ�ſ�
	public int YW_AntiCollideAndSelect(int ReaderID,byte MultiCardMode, Pointer CardMem, Pointer SNLen, Pointer SN)
	{
        int ret;
		try
        {
                JNative fuc = new JNative("YW60x.dll", "YW_AntiCollideAndSelect");

                fuc.setRetVal(Type.INT);
                fuc.setParameter(0, ReaderID);
                fuc.setParameter(1, MultiCardMode);
                fuc.setParameter(2,CardMem);
                fuc.setParameter(3,SNLen);                
                fuc.setParameter(4,SN);                
                fuc.invoke();
               
                ret = fuc.getRetValAsInt();
        }
        catch(NativeException e)
        {
                 ret = -1;
        }
        catch(IllegalAccessException e)
        {
                ret = -2;
        }

        return ret;	
		
	}

	public int YW_RequestAntiandSelect(int ReaderID,int SearchMode,byte MultiCardMode,Pointer ATQA,Pointer SAK,Pointer LenSNO,Pointer SNO)
	{
        int ret;
		try
        {
                JNative fuc = new JNative("YW60x.dll", "YW_RequestAntiandSelect");

                fuc.setRetVal(Type.INT);
                fuc.setParameter(0, ReaderID);
                fuc.setParameter(1, SearchMode);
                fuc.setParameter(2, MultiCardMode);
                fuc.setParameter(3, ATQA);
                fuc.setParameter(4, SAK);
                fuc.setParameter(5, LenSNO);
                fuc.setParameter(6, SNO);
                fuc.invoke();

                ret = fuc.getRetValAsInt();
        }
        catch(NativeException e)
        {
                 ret = -1;
        }
        catch(IllegalAccessException e)
        {
                ret = -2;
        }

        return ret;			
		
	}

    //д�������
	public int YW_WriteM1MultiBlock(int ReaderID, int StartBlock, int BlockNums, int LenData, Pointer pData)
	{
        int ret;
		try
        {
                JNative fuc = new JNative("YW60x.dll", "YW_WriteM1MultiBlock");

                fuc.setRetVal(Type.INT);
                fuc.setParameter(0, ReaderID);
                fuc.setParameter(1, StartBlock);
                fuc.setParameter(2, BlockNums);
                fuc.setParameter(3, LenData);
                fuc.setParameter(4, pData);
                fuc.invoke();

                ret = fuc.getRetValAsInt();
        }
        catch(NativeException e)
        {
                 ret = -1;
        }
        catch(IllegalAccessException e)
        {
                ret = -2;
        }

        return ret;			
		
	}

    //���������
	public int YW_ReadM1MultiBlock(int ReaderID, int StartBlock, int BlockNums, Pointer LenData, Pointer pData)
	{
        int ret;
		try
        {
                JNative fuc = new JNative("YW60x.dll", "YW_ReadM1MultiBlock");

                fuc.setRetVal(Type.INT);
                fuc.setParameter(0, ReaderID);
                fuc.setParameter(1, StartBlock);
                fuc.setParameter(2, BlockNums);
                fuc.setParameter(3, LenData);
                fuc.setParameter(4, pData);
                fuc.invoke();

                ret = fuc.getRetValAsInt();
        }
        catch(NativeException e)
        {
                 ret = -1;
        }
        catch(IllegalAccessException e)
        {
                ret = -2;
        }

        return ret;			
		
	}

	public int YW_UltraLightRead(int ReaderID, int BlockID, Pointer pData)
	{
        int ret;
		try
        {
                JNative fuc = new JNative("YW60x.dll", "YW_UltraLightRead");

                fuc.setRetVal(Type.INT);
                fuc.setParameter(0, ReaderID);
                fuc.setParameter(1, BlockID);
                fuc.setParameter(2, pData);
                fuc.invoke();

                ret = fuc.getRetValAsInt();
        }
        catch(NativeException e)
        {
                 ret = -1;
        }
        catch(IllegalAccessException e)
        {
                ret = -2;
        }

        return ret;			
		
	}


	public int YW_UltraLightWrite(int ReaderID, int BlockID, Pointer pData)
	{
        int ret;
		try
        {
                JNative fuc = new JNative("YW60x.dll", "YW_UltraLightWrite");

                fuc.setRetVal(Type.INT);
                fuc.setParameter(0, ReaderID);
                fuc.setParameter(1, BlockID);
                fuc.setParameter(2, pData);
                fuc.invoke();

                ret = fuc.getRetValAsInt();
        }
        catch(NativeException e)
        {
                 ret = -1;
        }
        catch(IllegalAccessException e)
        {
                ret = -2;
        }

        return ret;			
		
	}


	public int YW_TypeA_Reset(int ReaderID, byte Mode, byte MultiMode, Pointer rtLen, Pointer pData)
	{
        int ret;
		try
        {
                JNative fuc = new JNative("YW60x.dll", "YW_TypeA_Reset");

                fuc.setRetVal(Type.INT);
                fuc.setParameter(0, ReaderID);
                fuc.setParameter(1, Mode);
                fuc.setParameter(2, MultiMode);
                fuc.setParameter(3, rtLen);
                fuc.setParameter(4, pData);
                fuc.invoke();

                ret = fuc.getRetValAsInt();
        }
        catch(NativeException e)
        {
                 ret = -1;
        }
        catch(IllegalAccessException e)
        {
                ret = -2;
        }

        return ret;			
		
	}


	public int YW_TypeA_COS(int ReaderID, int LenCOS, Pointer Com_COS, Pointer rtLen, Pointer pData)
	{
        int ret;
		try
        {
                JNative fuc = new JNative("YW60x.dll", "YW_TypeA_COS");

                fuc.setRetVal(Type.INT);
                fuc.setParameter(0, ReaderID);
                fuc.setParameter(1, LenCOS);
                fuc.setParameter(2, Com_COS);
                fuc.setParameter(3, rtLen);
                fuc.setParameter(4, pData);
                fuc.invoke();

                ret = fuc.getRetValAsInt();
        }
        catch(NativeException e)
        {
                 ret = -1;
        }
        catch(IllegalAccessException e)
        {
                ret = -2;
        }

        return ret;	
		
	}



	public int YW_MFP_L0_WritePerso(int ReaderID, int Address, Pointer pData)
	{
        int ret;
		try
        {
                JNative fuc = new JNative("YW60x.dll", "YW_MFP_L0_WritePerso");

                fuc.setRetVal(Type.INT);
                fuc.setParameter(0, ReaderID);
                fuc.setParameter(1, Address);
                fuc.setParameter(2, pData);
                fuc.invoke();

                ret = fuc.getRetValAsInt();
        }
        catch(NativeException e)
        {
                 ret = -1;
        }
        catch(IllegalAccessException e)
        {
                ret = -2;
        }

        return ret;			
		
	}


	public int YW_MFP_L0_CommitPerso(int ReaderID)
	{
        int ret;
		try
        {
                JNative fuc = new JNative("YW60x.dll", "YW_MFP_L0_CommitPerso");

                fuc.setRetVal(Type.INT);
                fuc.setParameter(0, ReaderID);
                fuc.invoke();

                ret = fuc.getRetValAsInt();
        }
        catch(NativeException e)
        {
                 ret = -1;
        }
        catch(IllegalAccessException e)
        {
                ret = -2;
        }

        return ret;			
		
	}


	public int YW_MFP_SwitchToLevel(int ReaderID, int DesLevel,Pointer SwitchKey)
	{
        int ret;
		try
        {
                JNative fuc = new JNative("YW60x.dll", "YW_MFP_SwitchToLevel");

                fuc.setRetVal(Type.INT);
                fuc.setParameter(0, ReaderID);
                fuc.setParameter(1, DesLevel);
                fuc.setParameter(2, SwitchKey);
                fuc.invoke();

                ret = fuc.getRetValAsInt();
        }
        catch(NativeException e)
        {
                 ret = -1;
        }
        catch(IllegalAccessException e)
        {
                ret = -2;
        }

        return ret;	
		
	}


	public int YW_MFP_L3_Authorization(int ReaderID, int KeyMode,int BlockID,Pointer Key)
	{
        int ret;
		try
        {
                JNative fuc = new JNative("YW60x.dll", "YW_MFP_L3_Authorization");

                fuc.setRetVal(Type.INT);
                fuc.setParameter(0, ReaderID);
                fuc.setParameter(1, KeyMode);
                fuc.setParameter(2, BlockID);
                fuc.setParameter(3, Key);
                fuc.invoke();

                ret = fuc.getRetValAsInt();
        }
        catch(NativeException e)
        {
                 ret = -1;
        }
        catch(IllegalAccessException e)
        {
                ret = -2;
        }

        return ret;			
		
	}

	public int YW_MFP_L3_Read(int ReaderID, int StartBlock,int BlockNums,Pointer DataLen, Pointer pData)
	{
        int ret;
		try
        {
                JNative fuc = new JNative("YW60x.dll", "YW_MFP_L3_Read");

                fuc.setRetVal(Type.INT);
                fuc.setParameter(0, ReaderID);
                fuc.setParameter(1, StartBlock);
                fuc.setParameter(2, BlockNums);
                fuc.setParameter(3, DataLen);
                fuc.setParameter(4, pData);
                fuc.invoke();

                ret = fuc.getRetValAsInt();
        }
        catch(NativeException e)
        {
                 ret = -1;
        }
        catch(IllegalAccessException e)
        {
                ret = -2;
        }

        return ret;			
		
	}


	public int YW_MFP_L3_Write(int ReaderID, int StartBlock,int BlockNums, Pointer pData)
	{
        int ret;
		try
        {
                JNative fuc = new JNative("YW60x.dll", "YW_MFP_L3_Write");

                fuc.setRetVal(Type.INT);
                fuc.setParameter(0, ReaderID);
                fuc.setParameter(1, StartBlock);
                fuc.setParameter(2, BlockNums);
                fuc.setParameter(3, pData);
                fuc.invoke();

                ret = fuc.getRetValAsInt();
        }
        catch(NativeException e)
        {
                 ret = -1;
        }
        catch(IllegalAccessException e)
        {
                ret = -2;
        }

        return ret;			
		
	}


	public int YW_MFP_L3_Purse_Initial(int ReaderID, int BlockID,int InitialValue)
	{
        int ret;
		try
        {
                JNative fuc = new JNative("YW60x.dll", "YW_MFP_L3_Purse_Initial");

                fuc.setRetVal(Type.INT);
                fuc.setParameter(0, ReaderID);
                fuc.setParameter(1, BlockID);
                fuc.setParameter(2, InitialValue);
                fuc.invoke();

                ret = fuc.getRetValAsInt();
        }
        catch(NativeException e)
        {
                 ret = -1;
        }
        catch(IllegalAccessException e)
        {
                ret = -2;
        }

        return ret;			
	}

	public int YW_MFP_L3_Purse_Read(int ReaderID, int BlockID,Pointer Value)
	{
        int ret;
		try
        {
                JNative fuc = new JNative("YW60x.dll", "YW_MFP_L3_Purse_Read");

                fuc.setRetVal(Type.INT);
                fuc.setParameter(0, ReaderID);
                fuc.setParameter(1, BlockID);
                fuc.setParameter(2, Value);
                fuc.invoke();

                ret = fuc.getRetValAsInt();
        }
        catch(NativeException e)
        {
                 ret = -1;
        }
        catch(IllegalAccessException e)
        {
                ret = -2;
        }

        return ret;		
		
	}


	public int YW_MFP_L3_Purse_Charge(int ReaderID, int BlockID,int Value)
	{
        int ret;
		try
        {
                JNative fuc = new JNative("YW60x.dll", "YW_MFP_L3_Purse_Charge");

                fuc.setRetVal(Type.INT);
                fuc.setParameter(0, ReaderID);
                fuc.setParameter(1, BlockID);
                fuc.setParameter(2, Value);
                fuc.invoke();

                ret = fuc.getRetValAsInt();
        }
        catch(NativeException e)
        {
                 ret = -1;
        }
        catch(IllegalAccessException e)
        {
                ret = -2;
        }

        return ret;			
		
	}

	public int YW_MFP_L3_Purse_Decrease(int ReaderID, int BlockID,int Value)
	{
        int ret;
		try
        {
                JNative fuc = new JNative("YW60x.dll", "YW_MFP_L3_Purse_Decrease");

                fuc.setRetVal(Type.INT);
                fuc.setParameter(0, ReaderID);
                fuc.setParameter(1, BlockID);
                fuc.setParameter(2, Value);
                fuc.invoke();

                ret = fuc.getRetValAsInt();
        }
        catch(NativeException e)
        {
                 ret = -1;
        }
        catch(IllegalAccessException e)
        {
                ret = -2;
        }

        return ret;			
		
	}


	public int YW_MFP_L3_Purse_Backup(int ReaderID, int BlockID,int DesBlockID)
	{
        int ret;
		try
        {
                JNative fuc = new JNative("YW60x.dll", "YW_MFP_L3_Purse_Backup");

                fuc.setRetVal(Type.INT);
                fuc.setParameter(0, ReaderID);
                fuc.setParameter(1, BlockID);
                fuc.setParameter(2, DesBlockID);
                fuc.invoke();

                ret = fuc.getRetValAsInt();
        }
        catch(NativeException e)
        {
                 ret = -1;
        }
        catch(IllegalAccessException e)
        {
                ret = -2;
        }

        return ret;			
		
	}

 
	public int YW_MFP_Authorization_First(int ReaderID,  int AESKeyAddr,Pointer AESKey)
	{
        int ret;
		try
        {
                JNative fuc = new JNative("YW60x.dll", "YW_MFP_Authorization_First");

                fuc.setRetVal(Type.INT);
                fuc.setParameter(0, ReaderID);
                fuc.setParameter(1, AESKeyAddr);
                fuc.setParameter(2, AESKey);
                fuc.invoke();

                ret = fuc.getRetValAsInt();
        }
        catch(NativeException e)
        {
                 ret = -1;
        }
        catch(IllegalAccessException e)
        {
                ret = -2;
        }

        return ret;			
		
	}


	public int YW_MFP_Authorization_Follow(int ReaderID, int AESKeyAddr,Pointer AESKey)
	{
        int ret;
		try
        {
                JNative fuc = new JNative("YW60x.dll", "YW_MFP_Authorization_Follow");

                fuc.setRetVal(Type.INT);
                fuc.setParameter(0, ReaderID);
                fuc.setParameter(1, AESKeyAddr);
                fuc.setParameter(2, AESKey);
                fuc.invoke();

                ret = fuc.getRetValAsInt();
        }
        catch(NativeException e)
        {
                 ret = -1;
        }
        catch(IllegalAccessException e)
        {
                ret = -2;
        }

        return ret;			
		
	}



	public int YW_MFP_CommonRead(int ReaderID, int BlockID, int BlockNums,Pointer DataLen,Pointer pData)
	{
        int ret;
		try
        {
                JNative fuc = new JNative("YW60x.dll", "YW_MFP_CommonRead");

                fuc.setRetVal(Type.INT);
                fuc.setParameter(0, ReaderID);
                fuc.setParameter(1, BlockID);
                fuc.setParameter(2, BlockNums);
                fuc.setParameter(3, DataLen);
                fuc.setParameter(4, pData);
                fuc.invoke();

                ret = fuc.getRetValAsInt();
        }
        catch(NativeException e)
        {
                 ret = -1;
        }
        catch(IllegalAccessException e)
        {
                ret = -2;
        }

        return ret;			
		
	}


	public int YW_MFP_CommonWrite(int ReaderID, int BlockID, int BlockNums, Pointer pData)
	{
        int ret;
		try
        {
                JNative fuc = new JNative("YW60x.dll", "YW_MFP_CommonWrite");

                fuc.setRetVal(Type.INT);
                fuc.setParameter(0, ReaderID);
                fuc.setParameter(1, BlockID);
                fuc.setParameter(2, BlockNums);
                fuc.setParameter(3, pData);
                fuc.invoke();

                ret = fuc.getRetValAsInt();
        }
        catch(NativeException e)
        {
                 ret = -1;
        }
        catch(IllegalAccessException e)
        {
                ret = -2;
        }

        return ret;		
		
	}


	public int YW_TypeB_Reset(int ReaderID, byte Mode, Pointer rtLen, Pointer pData)
	{
        int ret;
		try
        {
                JNative fuc = new JNative("YW60x.dll", "YW_TypeB_Reset");

                fuc.setRetVal(Type.INT);
                fuc.setParameter(0, ReaderID);
                fuc.setParameter(1, Mode);
                fuc.setParameter(2, rtLen);
                fuc.setParameter(3, pData);
                fuc.invoke();

                ret = fuc.getRetValAsInt();
        }
        catch(NativeException e)
        {
                 ret = -1;
        }
        catch(IllegalAccessException e)
        {
                ret = -2;
        }

        return ret;			
		
	}
	
	public int YW_TypeB_ResetEx(int ReaderID, byte Mode, Pointer Attrib, Pointer rtLen, Pointer pData)
	{
        int ret;
		try
        {
                JNative fuc = new JNative("YW60x.dll", "YW_TypeB_Reset");

                fuc.setRetVal(Type.INT);
                fuc.setParameter(0, ReaderID);
                fuc.setParameter(1, Mode);
                fuc.setParameter(2, Attrib);
                fuc.setParameter(3, rtLen);
                fuc.setParameter(4, pData);
                fuc.invoke();

                ret = fuc.getRetValAsInt();
        }
        catch(NativeException e)
        {
                 ret = -1;
        }
        catch(IllegalAccessException e)
        {
                ret = -2;
        }

        return ret;			
		
	}
	


	public int YW_TypeB_COS(int ReaderID, int LenCOS, Pointer Com_COS, Pointer DataLen, Pointer pData)
	{
        int ret;
		try
        {
                JNative fuc = new JNative("YW60x.dll", "YW_TypeB_COS");

                fuc.setRetVal(Type.INT);
                fuc.setParameter(0, ReaderID);
                fuc.setParameter(1, LenCOS);
                fuc.setParameter(2, Com_COS);
                fuc.setParameter(3, DataLen);
                fuc.setParameter(4, pData);
                fuc.invoke();

                ret = fuc.getRetValAsInt();
        }
        catch(NativeException e)
        {
                 ret = -1;
        }
        catch(IllegalAccessException e)
        {
                ret = -2;
        }

        return ret;			
		
	}

	public int YW_AT88RF020_Check(int ReaderID, Pointer Key)
	{
        int ret;
		try
        {
                JNative fuc = new JNative("YW60x.dll", "YW_AT88RF020_Check");

                fuc.setRetVal(Type.INT);
                fuc.setParameter(0, ReaderID);
                fuc.setParameter(1, Key);
                fuc.invoke();

                ret = fuc.getRetValAsInt();
        }
        catch(NativeException e)
        {
                 ret = -1;
        }
        catch(IllegalAccessException e)
        {
                ret = -2;
        }

        return ret;			
		
	}


	public int YW_AT88RF020_Read(int ReaderID, int BlockID,Pointer pData)
	{
        int ret;
		try
        {
                JNative fuc = new JNative("YW60x.dll", "YW_AT88RF020_Read");

                fuc.setRetVal(Type.INT);
                fuc.setParameter(0, ReaderID);
                fuc.setParameter(1, BlockID);
                fuc.setParameter(2, pData);
                fuc.invoke();

                ret = fuc.getRetValAsInt();
        }
        catch(NativeException e)
        {
                 ret = -1;
        }
        catch(IllegalAccessException e)
        {
                ret = -2;
        }

        return ret;			
		
	}

	public int YW_AT88RF020_Write(int ReaderID, int BlockID, Pointer pData)
	{
        int ret;
		try
        {
                JNative fuc = new JNative("YW60x.dll", "YW_AT88RF020_Write");

                fuc.setRetVal(Type.INT);
                fuc.setParameter(0, ReaderID);
                fuc.setParameter(1, BlockID);
                fuc.setParameter(2, pData);
                fuc.invoke();

                ret = fuc.getRetValAsInt();
        }
        catch(NativeException e)
        {
                 ret = -1;
        }
        catch(IllegalAccessException e)
        {
                ret = -2;
        }

        return ret;			
		
	}


	public int YW_AT88RF020_Lock(int ReaderID, Pointer LockByte)
	{
        int ret;
		try
        {
                JNative fuc = new JNative("YW60x.dll", "YW_AT88RF020_Lock");

                fuc.setRetVal(Type.INT);
                fuc.setParameter(0, ReaderID);
                fuc.setParameter(1, LockByte);
                fuc.invoke();

                ret = fuc.getRetValAsInt();
        }
        catch(NativeException e)
        {
                 ret = -1;
        }
        catch(IllegalAccessException e)
        {
                ret = -2;
        }

        return ret;			
	}

	public int YW_AT88RF020_Count(int ReaderID, Pointer Signature)
	{
        int ret;
		try
        {
                JNative fuc = new JNative("YW60x.dll", "YW_AT88RF020_Count");

                fuc.setRetVal(Type.INT);
                fuc.setParameter(0, ReaderID);
                fuc.setParameter(1, Signature);
                fuc.invoke();

                ret = fuc.getRetValAsInt();
        }
        catch(NativeException e)
        {
                 ret = -1;
        }
        catch(IllegalAccessException e)
        {
                ret = -2;
        }

        return ret;			
		
	}

	public int YW_AT88RF020_DeSel(int ReaderID)
	{
        int ret;
		try
        {
                JNative fuc = new JNative("YW60x.dll", "YW_AT88RF020_DeSel");

                fuc.setRetVal(Type.INT);
                fuc.setParameter(0, ReaderID);
                fuc.invoke();

                ret = fuc.getRetValAsInt();
        }
        catch(NativeException e)
        {
                 ret = -1;
        }
        catch(IllegalAccessException e)
        {
                ret = -2;
        }

        return ret;			
	}


	public int YW_AT88RF020_ReadMulti(int ReaderID, int BlockID,int BlockNums, Pointer LenData, Pointer pData)
	{
        int ret;
		try
        {
                JNative fuc = new JNative("YW60x.dll", "YW_AT88RF020_ReadMulti");

                fuc.setRetVal(Type.INT);
                fuc.setParameter(0, ReaderID);
                fuc.setParameter(1, BlockID);
                fuc.setParameter(2, BlockNums);
                fuc.setParameter(3, LenData);
                fuc.setParameter(4, pData);
                fuc.invoke();

                ret = fuc.getRetValAsInt();
        }
        catch(NativeException e)
        {
                 ret = -1;
        }
        catch(IllegalAccessException e)
        {
                ret = -2;
        }

        return ret;				
		
	}


	public int YW_AT88RF020_WriteMulti(int ReaderID, int BlockID,int BlockNums, int LenData, Pointer pData)
	{
        int ret;
		try
        {
                JNative fuc = new JNative("YW60x.dll", "YW_AT88RF020_WriteMulti");

                fuc.setRetVal(Type.INT);
                fuc.setParameter(0, ReaderID);
                fuc.setParameter(1, BlockID);
                fuc.setParameter(2, BlockNums);
                fuc.setParameter(3, LenData);
                fuc.setParameter(4, pData);
                fuc.invoke();

                ret = fuc.getRetValAsInt();
        }
        catch(NativeException e)
        {
                 ret = -1;
        }
        catch(IllegalAccessException e)
        {
                ret = -2;
        }

        return ret;	
		
	}

	public int YW_ST_Active(int ReaderID, Pointer ChipID)
	{
        int ret;
		try
        {
                JNative fuc = new JNative("YW60x.dll", "YW_ST_Active");

                fuc.setRetVal(Type.INT);
                fuc.setParameter(0, ReaderID);
                fuc.setParameter(1, ChipID);
                fuc.invoke();

                ret = fuc.getRetValAsInt();
        }
        catch(NativeException e)
        {
                 ret = -1;
        }
        catch(IllegalAccessException e)
        {
                ret = -2;
        }

        return ret;			
		
	}

	public int YW_ST_DeActive(int ReaderID)
	{
        int ret;
		try
        {
                JNative fuc = new JNative("YW60x.dll", "YW_ST_DeActive");

                fuc.setRetVal(Type.INT);
                fuc.setParameter(0, ReaderID);
                fuc.invoke();

                ret = fuc.getRetValAsInt();
        }
        catch(NativeException e)
        {
                 ret = -1;
        }
        catch(IllegalAccessException e)
        {
                ret = -2;
        }

        return ret;			
	}

	public int YW_SR176_GetUID(int ReaderID,Pointer UID)
	{
        int ret;
		try
        {
                JNative fuc = new JNative("YW60x.dll", "YW_SR176_GetUID");

                fuc.setRetVal(Type.INT);
                fuc.setParameter(0, ReaderID);
                fuc.setParameter(1, UID);
                fuc.invoke();

                ret = fuc.getRetValAsInt();
        }
        catch(NativeException e)
        {
                 ret = -1;
        }
        catch(IllegalAccessException e)
        {
                ret = -2;
        }

        return ret;			
	}


	public int YW_SR176_Read(int ReaderID, int BlockID,Pointer pData)
	{
        int ret;
		try
        {
                JNative fuc = new JNative("YW60x.dll", "YW_SR176_Read");

                fuc.setRetVal(Type.INT);
                fuc.setParameter(0, ReaderID);
                fuc.setParameter(1, BlockID);
                fuc.setParameter(2, pData);
                fuc.invoke();

                ret = fuc.getRetValAsInt();
        }
        catch(NativeException e)
        {
                 ret = -1;
        }
        catch(IllegalAccessException e)
        {
                ret = -2;
        }

        return ret;		
	}

	public int YW_SR176_Write(int ReaderID, int BlockID,Pointer pData)
	{
        int ret;
		try
        {
                JNative fuc = new JNative("YW60x.dll", "YW_SR176_Write");

                fuc.setRetVal(Type.INT);
                fuc.setParameter(0, ReaderID);
                fuc.setParameter(1, BlockID);
                fuc.setParameter(2, pData);
                fuc.invoke();

                ret = fuc.getRetValAsInt();
        }
        catch(NativeException e)
        {
                 ret = -1;
        }
        catch(IllegalAccessException e)
        {
                ret = -2;
        }

        return ret;			
	}

 
	public int YW_SR176_Lock(int ReaderID, byte LockByte)
	{
        int ret;
		try
        {
                JNative fuc = new JNative("YW60x.dll", "YW_SR176_Lock");

                fuc.setRetVal(Type.INT);
                fuc.setParameter(0, ReaderID);
                fuc.setParameter(1, LockByte);
                fuc.invoke();

                ret = fuc.getRetValAsInt();
        }
        catch(NativeException e)
        {
                 ret = -1;
        }
        catch(IllegalAccessException e)
        {
                ret = -2;
        }

        return ret;			
	}

 
	public int YW_SR176_LockStatus(int ReaderID, Pointer LockByte)
	{
        int ret;
		try
        {
                JNative fuc = new JNative("YW60x.dll", "YW_SR176_LockStatus");

                fuc.setRetVal(Type.INT);
                fuc.setParameter(0, ReaderID);
                fuc.setParameter(1, LockByte);
                fuc.invoke();

                ret = fuc.getRetValAsInt();
        }
        catch(NativeException e)
        {
                 ret = -1;
        }
        catch(IllegalAccessException e)
        {
                ret = -2;
        }

        return ret;		
	}


	public int YW_SR176_ReadMulti(int ReaderID, int BlockID, int BlockNums,Pointer LenData,Pointer pData)
	{
        int ret;
		try
        {
                JNative fuc = new JNative("YW60x.dll", "YW_SR176_ReadMulti");

                fuc.setRetVal(Type.INT);
                fuc.setParameter(0, ReaderID);
                fuc.setParameter(1, BlockID);
                fuc.setParameter(2, BlockNums);
                fuc.setParameter(3, LenData);
                fuc.setParameter(4, pData);
                fuc.invoke();

                ret = fuc.getRetValAsInt();
        }
        catch(NativeException e)
        {
                 ret = -1;
        }
        catch(IllegalAccessException e)
        {
                ret = -2;
        }

        return ret;			
		
	}

 
	public int YW_SR176_WriteMulti(int ReaderID, int BlockID, int BlockNums,int LenData, Pointer pData)
	{
        int ret;
		try
        {
                JNative fuc = new JNative("YW60x.dll", "YW_SR176_WriteMulti");

                fuc.setRetVal(Type.INT);
                fuc.setParameter(0, ReaderID);
                fuc.setParameter(1, BlockID);
                fuc.setParameter(2, BlockNums);
                fuc.setParameter(3, LenData);
                fuc.setParameter(4, pData);
                fuc.invoke();

                ret = fuc.getRetValAsInt();
        }
        catch(NativeException e)
        {
                 ret = -1;
        }
        catch(IllegalAccessException e)
        {
                ret = -2;
        }

        return ret;			
		
	}

	public int YW_SR512_GetUID(int ReaderID,Pointer UID)
	{
        int ret;
		try
        {
                JNative fuc = new JNative("YW60x.dll", "YW_SR512_GetUID");

                fuc.setRetVal(Type.INT);
                fuc.setParameter(0, ReaderID);
                fuc.setParameter(1, UID);
                fuc.invoke();

                ret = fuc.getRetValAsInt();
        }
        catch(NativeException e)
        {
                 ret = -1;
        }
        catch(IllegalAccessException e)
        {
                ret = -2;
        }

        return ret;			
	}

 
	public int YW_SR512_Read(int ReaderID, int BlockID,Pointer pData)
	{
        int ret;
		try
        {
                JNative fuc = new JNative("YW60x.dll", "YW_SR512_Read");

                fuc.setRetVal(Type.INT);
                fuc.setParameter(0, ReaderID);
                fuc.setParameter(1, BlockID);
                fuc.setParameter(2, pData);
                fuc.invoke();

                ret = fuc.getRetValAsInt();
        }
        catch(NativeException e)
        {
                 ret = -1;
        }
        catch(IllegalAccessException e)
        {
                ret = -2;
        }

        return ret;			
	}

 
	public int YW_SR512_Write(int ReaderID, int BlockID, Pointer pData)
	{
        int ret;
		try
        {
                JNative fuc = new JNative("YW60x.dll", "YW_SR512_Write");

                fuc.setRetVal(Type.INT);
                fuc.setParameter(0, ReaderID);
                fuc.setParameter(1, BlockID);
                fuc.setParameter(2, pData);
                fuc.invoke();

                ret = fuc.getRetValAsInt();
        }
        catch(NativeException e)
        {
                 ret = -1;
        }
        catch(IllegalAccessException e)
        {
                ret = -2;
        }

        return ret;			
	}

 
	public int YW_SR512_Lock(int ReaderID, short LockByte)
	{
        int ret;
		try
        {
                JNative fuc = new JNative("YW60x.dll", "YW_SR512_Lock");

                fuc.setRetVal(Type.INT);
                fuc.setParameter(0, ReaderID);
                fuc.setParameter(1, LockByte);
                fuc.invoke();

                ret = fuc.getRetValAsInt();
        }
        catch(NativeException e)
        {
                 ret = -1;
        }
        catch(IllegalAccessException e)
        {
                ret = -2;
        }

        return ret;		
	}


	public int YW_SR512_LockStatus(int ReaderID, Pointer LockByte)
	{
        int ret;
		try
        {
                JNative fuc = new JNative("YW60x.dll", "YW_SR512_LockStatus");

                fuc.setRetVal(Type.INT);
                fuc.setParameter(0, ReaderID);
                fuc.setParameter(1, LockByte);
                fuc.invoke();

                ret = fuc.getRetValAsInt();
        }
        catch(NativeException e)
        {
                 ret = -1;
        }
        catch(IllegalAccessException e)
        {
                ret = -2;
        }

        return ret;			
	}



	public int YW_SR512_ReadMulti(int ReaderID, int BlockID,int BlockNums,Pointer LenData,Pointer pData)
	{
        int ret;
		try
        {
                JNative fuc = new JNative("YW60x.dll", "YW_SR512_ReadMulti");

                fuc.setRetVal(Type.INT);
                fuc.setParameter(0, ReaderID);
                fuc.setParameter(1, BlockID);
                fuc.setParameter(2, BlockNums);
                fuc.setParameter(3, LenData);
                fuc.setParameter(4, pData);
                fuc.invoke();

                ret = fuc.getRetValAsInt();
        }
        catch(NativeException e)
        {
                 ret = -1;
        }
        catch(IllegalAccessException e)
        {
                ret = -2;
        }

        return ret;			
		
	}
 
	public int YW_SR512_WriteMulti(int ReaderID, int BlockID,int BlockNums,int LenData,Pointer pData)
	{
        int ret;
		try
        {
                JNative fuc = new JNative("YW60x.dll", "YW_SR512_ReadMulti");

                fuc.setRetVal(Type.INT);
                fuc.setParameter(0, ReaderID);
                fuc.setParameter(1, BlockID);
                fuc.setParameter(2, BlockNums);
                fuc.setParameter(3, LenData);
                fuc.setParameter(4, pData);
                fuc.invoke();

                ret = fuc.getRetValAsInt();
        }
        catch(NativeException e)
        {
                 ret = -1;
        }
        catch(IllegalAccessException e)
        {
                ret = -2;
        }

        return ret;				
	}

 
	public int YW_SRIX4K_Check(int ReaderID, Pointer Key,  Pointer Signature)
	{
        int ret;
		try
        {
                JNative fuc = new JNative("YW60x.dll", "YW_SRIX4K_Check");

                fuc.setRetVal(Type.INT);
                fuc.setParameter(0, ReaderID);
                fuc.setParameter(1, Key);
                fuc.setParameter(2, Signature);
                fuc.invoke();

                ret = fuc.getRetValAsInt();
        }
        catch(NativeException e)
        {
                 ret = -1;
        }
        catch(IllegalAccessException e)
        {
                ret = -2;
        }

        return ret;	
	}


	public int YW_TypeB_Sleep(int ReaderID, Pointer PUPI)
	{
        int ret;
		try
        {
                JNative fuc = new JNative("YW60x.dll", "YW_TypeB_Sleep");

                fuc.setRetVal(Type.INT);
                fuc.setParameter(0, ReaderID);
                fuc.setParameter(1, PUPI);
                fuc.invoke();

                ret = fuc.getRetValAsInt();
        }
        catch(NativeException e)
        {
                 ret = -1;
        }
        catch(IllegalAccessException e)
        {
                ret = -2;
        }

        return ret;			
	}

 
	public int YW_ISO15693_Inventory(int ReaderID, Pointer PData, Pointer PLen)
	{
        int ret;
		try
        {
                JNative fuc = new JNative("YW60x.dll", "YW_ISO15693_Inventory");

                fuc.setRetVal(Type.INT);
                fuc.setParameter(0, ReaderID);
                fuc.setParameter(1, PData);
                fuc.setParameter(2, PLen);
                fuc.invoke();

                ret = fuc.getRetValAsInt();
        }
        catch(NativeException e)
        {
                 ret = -1;
        }
        catch(IllegalAccessException e)
        {
                ret = -2;
        }

        return ret;		
	}
 
	public int  YW_ISO15693_Stay_Quiet(int ReaderID, Pointer PUID)
	{
        int ret;
		try
        {
                JNative fuc = new JNative("YW60x.dll", "YW_ISO15693_Stay_Quiet");

                fuc.setRetVal(Type.INT);
                fuc.setParameter(0, ReaderID);
                fuc.setParameter(1, PUID);
                fuc.invoke();

                ret = fuc.getRetValAsInt();
        }
        catch(NativeException e)
        {
                 ret = -1;
        }
        catch(IllegalAccessException e)
        {
                ret = -2;
        }

        return ret;			
	}

 
	public int YW_ISO15693_Select(int ReaderID, byte Model, Pointer PUID)
	{
        int ret;
		try
        {
                JNative fuc = new JNative("YW60x.dll", "YW_ISO15693_Select");

                fuc.setRetVal(Type.INT);
                fuc.setParameter(0, ReaderID);
                fuc.setParameter(1, Model);
                fuc.setParameter(2, PUID);
                fuc.invoke();

                ret = fuc.getRetValAsInt();
        }
        catch(NativeException e)
        {
                 ret = -1;
        }
        catch(IllegalAccessException e)
        {
                ret = -2;
        }

        return ret;			
	}

 
	public int YW_ISO15693_Reset_To_Ready(int ReaderID,byte Model, Pointer PUID)
	{
        int ret;
		try
        {
                JNative fuc = new JNative("YW60x.dll", "YW_ISO15693_Reset_To_Ready");

                fuc.setRetVal(Type.INT);
                fuc.setParameter(0, ReaderID);
                fuc.setParameter(1, Model);
                fuc.setParameter(2, PUID);
                fuc.invoke();

                ret = fuc.getRetValAsInt();
        }
        catch(NativeException e)
        {
                 ret = -1;
        }
        catch(IllegalAccessException e)
        {
                ret = -2;
        }

        return ret;		
	}

 
	public int YW_ISO15693_Read(int ReaderID, byte Model,Pointer PUID,byte StartBlockID, byte BlockNums, Pointer PData, Pointer PLen)
	{
        int ret;
		try
        {
                JNative fuc = new JNative("YW60x.dll", "YW_ISO15693_Read");

                fuc.setRetVal(Type.INT);
                fuc.setParameter(0, ReaderID);
                fuc.setParameter(1, Model);
                fuc.setParameter(2, PUID);
                fuc.setParameter(3, StartBlockID);
                fuc.setParameter(4, BlockNums);
                fuc.setParameter(5, PData);
                fuc.setParameter(6, PLen);
                fuc.invoke();

                ret = fuc.getRetValAsInt();
        }
        catch(NativeException e)
        {
                 ret = -1;
        }
        catch(IllegalAccessException e)
        {
                ret = -2;
        }

        return ret;		
		
	}

 
	public int YW_ISO15693_Write(int ReaderID,byte Model, Pointer PUID, byte BlockID,byte DataLen, Pointer PData)
	{
        int ret;
		try
        {
                JNative fuc = new JNative("YW60x.dll", "YW_ISO15693_Write");

                fuc.setRetVal(Type.INT);
                fuc.setParameter(0, ReaderID);
                fuc.setParameter(1, Model);
                fuc.setParameter(2, PUID);
                fuc.setParameter(3, BlockID);
                fuc.setParameter(4, DataLen);
                fuc.setParameter(5, PData);
                fuc.invoke();

                ret = fuc.getRetValAsInt();
        }
        catch(NativeException e)
        {
                 ret = -1;
        }
        catch(IllegalAccessException e)
        {
                ret = -2;
        }

        return ret;		
	}

 
	public int  YW_ISO15693_Lock_Block(int ReaderID,byte Model, Pointer PUID, byte BlockID)
	{
        int ret;
		try
        {
                JNative fuc = new JNative("YW60x.dll", "YW_ISO15693_Lock_Block");

                fuc.setRetVal(Type.INT);
                fuc.setParameter(0, ReaderID);
                fuc.setParameter(1, Model);
                fuc.setParameter(2, PUID);
                fuc.setParameter(3, BlockID);
                fuc.invoke();

                ret = fuc.getRetValAsInt();
        }
        catch(NativeException e)
        {
                 ret = -1;
        }
        catch(IllegalAccessException e)
        {
                ret = -2;
        }

        return ret;		
	}

 
	public int YW_ISO15693_Write_AFI(int ReaderID,byte Model, Pointer PUID, byte AFI)
	{
        int ret;
		try
        {
                JNative fuc = new JNative("YW60x.dll", "YW_ISO15693_Lock_Block");

                fuc.setRetVal(Type.INT);
                fuc.setParameter(0, ReaderID);
                fuc.setParameter(1, Model);
                fuc.setParameter(2, PUID);
                fuc.setParameter(3, AFI);
                fuc.invoke();

                ret = fuc.getRetValAsInt();
        }
        catch(NativeException e)
        {
                 ret = -1;
        }
        catch(IllegalAccessException e)
        {
                ret = -2;
        }

        return ret;			
	}

 
	public int  YW_ISO15693_Lock_AFI(int ReaderID,byte Model, Pointer PUID)
	{
        int ret;
		try
        {
                JNative fuc = new JNative("YW60x.dll", "YW_ISO15693_Lock_AFI");

                fuc.setRetVal(Type.INT);
                fuc.setParameter(0, ReaderID);
                fuc.setParameter(1, Model);
                fuc.setParameter(2, PUID);
                fuc.invoke();

                ret = fuc.getRetValAsInt();
        }
        catch(NativeException e)
        {
                 ret = -1;
        }
        catch(IllegalAccessException e)
        {
                ret = -2;
        }

        return ret;			
	}

 
	public int YW_ISO15693_Write_DSFID(int ReaderID,byte Model, Pointer PUID, byte DSFID)
	{
        int ret;
		try
        {
                JNative fuc = new JNative("YW60x.dll", "YW_ISO15693_Write_DSFID");

                fuc.setRetVal(Type.INT);
                fuc.setParameter(0, ReaderID);
                fuc.setParameter(1, Model);
                fuc.setParameter(2, PUID);
                fuc.setParameter(3, DSFID);
                fuc.invoke();

                ret = fuc.getRetValAsInt();
        }
        catch(NativeException e)
        {
                 ret = -1;
        }
        catch(IllegalAccessException e)
        {
                ret = -2;
        }

        return ret;			
	}

 
	public int  YW_ISO15693_Lock_DSFID(int ReaderID,byte Model, Pointer PUID)
	{
        int ret;
		try
        {
                JNative fuc = new JNative("YW60x.dll", "YW_ISO15693_Lock_DSFID");

                fuc.setRetVal(Type.INT);
                fuc.setParameter(0, ReaderID);
                fuc.setParameter(1, Model);
                fuc.setParameter(2, PUID);
                fuc.invoke();

                ret = fuc.getRetValAsInt();
        }
        catch(NativeException e)
        {
                 ret = -1;
        }
        catch(IllegalAccessException e)
        {
                ret = -2;
        }

        return ret;		
	}

 
	public int YW_ISO15693_Get_System_Information(int ReaderID,byte Model, Pointer PUID,Pointer PData, Pointer PLen)
	{
        int ret;
		try
        {
                JNative fuc = new JNative("YW60x.dll", "YW_ISO15693_Get_System_Information");

                fuc.setRetVal(Type.INT);
                fuc.setParameter(0, ReaderID);
                fuc.setParameter(1, Model);
                fuc.setParameter(2, PUID);
                fuc.setParameter(3, PData);
                fuc.setParameter(4, PLen);
                fuc.invoke();

                ret = fuc.getRetValAsInt();
        }
        catch(NativeException e)
        {
                 ret = -1;
        }
        catch(IllegalAccessException e)
        {
                ret = -2;
        }

        return ret;		
	}

 
	public int YW_ISO15693_Get_Block_Security(int ReaderID,byte Model, Pointer PUID,byte StartBlockID, byte BlockNums,Pointer PData, Pointer PLen)
	{
        int ret;
		try
        {
                JNative fuc = new JNative("YW60x.dll", "YW_ISO15693_Get_Block_Security");

                fuc.setRetVal(Type.INT);
                fuc.setParameter(0, ReaderID);
                fuc.setParameter(1, Model);
                fuc.setParameter(2, PUID);
                fuc.setParameter(3, StartBlockID);
                fuc.setParameter(4, BlockNums);
                fuc.setParameter(5, PData);
                fuc.setParameter(6, PLen);
                fuc.invoke();

                ret = fuc.getRetValAsInt();
        }
        catch(NativeException e)
        {
                 ret = -1;
        }
        catch(IllegalAccessException e)
        {
                ret = -2;
        }

        return ret;		
	}

 
	public int YW_ISO15693_Multi_Inventory(int ReaderID, byte AFIEnable, byte AFI, Pointer PData, Pointer PLen)
	{
        int ret;
		try
        {
                JNative fuc = new JNative("YW60x.dll", "YW_ISO15693_Multi_Inventory");

                fuc.setRetVal(Type.INT);
                fuc.setParameter(0, ReaderID);
                fuc.setParameter(1, AFIEnable);
                fuc.setParameter(2, AFI);
                fuc.setParameter(3, PData);
                fuc.setParameter(4, PLen);
                fuc.invoke();

                ret = fuc.getRetValAsInt();
        }
        catch(NativeException e)
        {
                 ret = -1;
        }
        catch(IllegalAccessException e)
        {
                ret = -2;
        }

        return ret;		
	}



 
	public int YW_SAM_ResetBaud(int ReaderID,int SAMIndex, int BaudIndex)
	{
        int ret;
		try
        {
                JNative fuc = new JNative("YW60x.dll", "YW_SAM_ResetBaud");

                fuc.setRetVal(Type.INT);
                fuc.setParameter(0, ReaderID);
                fuc.setParameter(1, SAMIndex);
                fuc.setParameter(2, BaudIndex);
                fuc.invoke();

                ret = fuc.getRetValAsInt();
        }
        catch(NativeException e)
        {
                 ret = -1;
        }
        catch(IllegalAccessException e)
        {
                ret = -2;
        }

        return ret;			
		
	}


	public int YW_SAM_Reset(int ReaderID,int SAMIndex, Pointer rtLen, Pointer pData)
	{
        int ret;
		try
        {
                JNative fuc = new JNative("YW60x.dll", "YW_SAM_Reset");

                fuc.setRetVal(Type.INT);
                fuc.setParameter(0, ReaderID);
                fuc.setParameter(1, SAMIndex);
                fuc.setParameter(2, rtLen);
                fuc.setParameter(3, pData);
                fuc.invoke();

                ret = fuc.getRetValAsInt();
        }
        catch(NativeException e)
        {
                 ret = -1;
        }
        catch(IllegalAccessException e)
        {
                ret = -2;
        }

        return ret;		
	}

	public int  YW_SAM_ResetEx(int ReaderID,int SAMIndex,byte SAMVoltage, Pointer rtLen, Pointer pData)
	{
        int ret;
		try
        {
                JNative fuc = new JNative("YW60x.dll", "YW_SAM_ResetEx");

                fuc.setRetVal(Type.INT);
                fuc.setParameter(0, ReaderID);
                fuc.setParameter(1, SAMIndex);
                fuc.setParameter(2, SAMVoltage);
                fuc.setParameter(3, rtLen);
                fuc.setParameter(4, pData);
                fuc.invoke();

                ret = fuc.getRetValAsInt();
        }
        catch(NativeException e)
        {
                 ret = -1;
        }
        catch(IllegalAccessException e)
        {
                ret = -2;
        }

        return ret;			
		
	}

 
	public int YW_SAM_COS(int ReaderID,int SAMIndex, int LenCOS, Pointer Com_COS, Pointer rtLen, Pointer pData)
	{
        int ret;
		try
        {
                JNative fuc = new JNative("YW60x.dll", "YW_SAM_COS");

                fuc.setRetVal(Type.INT);
                fuc.setParameter(0, ReaderID);
                fuc.setParameter(1, SAMIndex);
                fuc.setParameter(2, LenCOS);
                fuc.setParameter(3, Com_COS);
                fuc.setParameter(4, rtLen);
                fuc.setParameter(5, pData);
                fuc.invoke();

                ret = fuc.getRetValAsInt();
        }
        catch(NativeException e)
        {
                 ret = -1;
        }
        catch(IllegalAccessException e)
        {
                ret = -2;
        }

        return ret;			
	}
 
	public int YW_SAM_PPSBaud(int ReaderID,int SAMIndex, int BaudIndex)
	{
        int ret;
		try
        {
                JNative fuc = new JNative("YW60x.dll", "YW_SAM_PPSBaud");

                fuc.setRetVal(Type.INT);
                fuc.setParameter(0, ReaderID);
                fuc.setParameter(1, SAMIndex);
                fuc.setParameter(2, BaudIndex);
                fuc.invoke();

                ret = fuc.getRetValAsInt();
        }
        catch(NativeException e)
        {
                 ret = -1;
        }
        catch(IllegalAccessException e)
        {
                ret = -2;
        }

        return ret;			
	}

	public int  YW_SAM_PPSBaudEx(int ReaderID,int SAMIndex, int BaudIndex, int Protocol)
	{
        int ret;
		try
        {
                JNative fuc = new JNative("YW60x.dll", "YW_SAM_PPSBaudEx");

                fuc.setRetVal(Type.INT);
                fuc.setParameter(0, ReaderID);
                fuc.setParameter(1, SAMIndex);
                fuc.setParameter(2, BaudIndex);
                fuc.setParameter(3, Protocol);
                fuc.invoke();

                ret = fuc.getRetValAsInt();
        }
        catch(NativeException e)
        {
                 ret = -1;
        }
        catch(IllegalAccessException e)
        {
                ret = -2;
        }

        return ret;	
		
	}



	///////////////***************TOPAZ Start********/////////////////
	public int YW_TOPAZ_ReadUID(int ReaderID,Pointer HR0, Pointer HR1,Pointer DataLenRet, Pointer pDataRet)
	{
        int ret;
		try
        {
                JNative fuc = new JNative("YW60x.dll", "YW_TOPAZ_ReadUID");

                fuc.setRetVal(Type.INT);
                fuc.setParameter(0, ReaderID);
                fuc.setParameter(1, HR0);
                fuc.setParameter(2, HR1);
                fuc.setParameter(3, DataLenRet);
                fuc.setParameter(4, pDataRet);
                fuc.invoke();

                ret = fuc.getRetValAsInt();
        }
        catch(NativeException e)
        {
                 ret = -1;
        }
        catch(IllegalAccessException e)
        {
                ret = -2;
        }

        return ret;			
	}


	public int YW_TOPAZ_ReadAll(int ReaderID,Pointer UID, Pointer DataLenRet, Pointer pDataRet)
	{
        int ret;
		try
        {
                JNative fuc = new JNative("YW60x.dll", "YW_TOPAZ_ReadAll");

                fuc.setRetVal(Type.INT);
                fuc.setParameter(0, ReaderID);
                fuc.setParameter(1, UID);
                fuc.setParameter(2, DataLenRet);
                fuc.setParameter(3, pDataRet);
                fuc.invoke();

                ret = fuc.getRetValAsInt();
        }
        catch(NativeException e)
        {
                 ret = -1;
        }
        catch(IllegalAccessException e)
        {
                ret = -2;
        }

        return ret;	
	}


	public int YW_TOPAZ_ReadByte(int ReaderID,Pointer UID, byte BlockID, byte ByteAddr, Pointer pDataRet)
	{
        int ret;
		try
        {
                JNative fuc = new JNative("YW60x.dll", "YW_TOPAZ_ReadByte");

                fuc.setRetVal(Type.INT);
                fuc.setParameter(0, ReaderID);
                fuc.setParameter(1, UID);
                fuc.setParameter(2, BlockID);
                fuc.setParameter(3, ByteAddr);
                fuc.setParameter(4, pDataRet);
                fuc.invoke();

                ret = fuc.getRetValAsInt();
        }
        catch(NativeException e)
        {
                 ret = -1;
        }
        catch(IllegalAccessException e)
        {
                ret = -2;
        }

        return ret;			
	}



	public int YW_TOPAZ_WriteByteAfterErase(int ReaderID,Pointer UID, byte BlockID, byte ByteAddr, byte DataWrite, Pointer pDataRet)
	{
        int ret;
		try
        {
                JNative fuc = new JNative("YW60x.dll", "YW_TOPAZ_WriteByteAfterErase");

                fuc.setRetVal(Type.INT);
                fuc.setParameter(0, ReaderID);
                fuc.setParameter(1, UID);
                fuc.setParameter(2, BlockID);
                fuc.setParameter(3, ByteAddr);
                fuc.setParameter(4, DataWrite);
                fuc.setParameter(5, pDataRet);
                fuc.invoke();

                ret = fuc.getRetValAsInt();
        }
        catch(NativeException e)
        {
                 ret = -1;
        }
        catch(IllegalAccessException e)
        {
                ret = -2;
        }

        return ret;		
	}


	public int YW_TOPAZ_WriteByteWithoutErase(int ReaderID,Pointer UID, byte BlockID, byte ByteAddr, byte DataWrite, Pointer pDataRet)
	{
        int ret;
		try
        {
                JNative fuc = new JNative("YW60x.dll", "YW_TOPAZ_WriteByteWithoutErase");

                fuc.setRetVal(Type.INT);
                fuc.setParameter(0, ReaderID);
                fuc.setParameter(1, UID);
                fuc.setParameter(2, BlockID);
                fuc.setParameter(3, ByteAddr);
                fuc.setParameter(4, DataWrite);
                fuc.setParameter(5, pDataRet);
                fuc.invoke();

                ret = fuc.getRetValAsInt();
        }
        catch(NativeException e)
        {
                 ret = -1;
        }
        catch(IllegalAccessException e)
        {
                ret = -2;
        }

        return ret;			
	}


	public int YW_TOPAZ_ReadSegment(int ReaderID,Pointer UID, byte Segment, Pointer DataLenRet,Pointer pDataRet)
	{
        int ret;
		try
        {
                JNative fuc = new JNative("YW60x.dll", "YW_TOPAZ_WriteByteWithoutErase");

                fuc.setRetVal(Type.INT);
                fuc.setParameter(0, ReaderID);
                fuc.setParameter(1, UID);
                fuc.setParameter(2, Segment);
                fuc.setParameter(3, DataLenRet);
                fuc.setParameter(4, pDataRet);
                fuc.invoke();

                ret = fuc.getRetValAsInt();
        }
        catch(NativeException e)
        {
                 ret = -1;
        }
        catch(IllegalAccessException e)
        {
                ret = -2;
        }

        return ret;			
	}


	public int YW_TOPAZ_ReadBlock(int ReaderID,Pointer UID, byte BlockID, Pointer pDataRet)
	{
        int ret;
		try
        {
                JNative fuc = new JNative("YW60x.dll", "YW_TOPAZ_ReadBlock");

                fuc.setRetVal(Type.INT);
                fuc.setParameter(0, ReaderID);
                fuc.setParameter(1, UID);
                fuc.setParameter(2, BlockID);
                fuc.setParameter(3, pDataRet);
                fuc.invoke();

                ret = fuc.getRetValAsInt();
        }
        catch(NativeException e)
        {
                 ret = -1;
        }
        catch(IllegalAccessException e)
        {
                ret = -2;
        }

        return ret;		
	}


	public int YW_TOPAZ_WriteBlockAfterErase(int ReaderID,Pointer UID, byte BlockID, Pointer DataWrite, Pointer pDataRet)
	{
        int ret;
		try
        {
                JNative fuc = new JNative("YW60x.dll", "YW_TOPAZ_WriteBlockAfterErase");

                fuc.setRetVal(Type.INT);
                fuc.setParameter(0, ReaderID);
                fuc.setParameter(1, UID);
                fuc.setParameter(2, BlockID);
                fuc.setParameter(3, DataWrite);
                fuc.setParameter(4, pDataRet);
                fuc.invoke();

                ret = fuc.getRetValAsInt();
        }
        catch(NativeException e)
        {
                 ret = -1;
        }
        catch(IllegalAccessException e)
        {
                ret = -2;
        }

        return ret;			
	}


	public int YW_TOPAZ_WriteBlockWithoutErase(int ReaderID,Pointer UID, byte BlockID, Pointer DataWrite, Pointer pDataRet)
	{
        int ret;
		try
        {
                JNative fuc = new JNative("YW60x.dll", "YW_TOPAZ_WriteBlockWithoutErase");

                fuc.setRetVal(Type.INT);
                fuc.setParameter(0, ReaderID);
                fuc.setParameter(1, UID);
                fuc.setParameter(2, BlockID);
                fuc.setParameter(3, DataWrite);
                fuc.setParameter(4, pDataRet);
                fuc.invoke();

                ret = fuc.getRetValAsInt();
        }
        catch(NativeException e)
        {
                 ret = -1;
        }
        catch(IllegalAccessException e)
        {
                ret = -2;
        }

        return ret;			
	}



	public int YW_Felica_Polling(int ReaderID, short SystemCode, byte RequestCode, byte Slot,
	                   Pointer IDM, Pointer PMm, Pointer RequestData)
	{
        int ret;
		try
        {
                JNative fuc = new JNative("YW60x.dll", "YW_Felica_Polling");

                fuc.setRetVal(Type.INT);
                fuc.setParameter(0, ReaderID);
                fuc.setParameter(1, SystemCode);
                fuc.setParameter(2, RequestCode);
                fuc.setParameter(3, Slot);
                fuc.setParameter(4, IDM);
                fuc.setParameter(5, PMm);
                fuc.setParameter(6, RequestData);
                fuc.invoke();

                ret = fuc.getRetValAsInt();
        }
        catch(NativeException e)
        {
                 ret = -1;
        }
        catch(IllegalAccessException e)
        {
                ret = -2;
        }

        return ret;		
	}


	public int YW_Felica_RequestService(int ReaderID, Pointer IDM,
	                   byte NumbersOfCode, Pointer NodeList, Pointer NodeKeyList)
	{
        int ret;
		try
        {
                JNative fuc = new JNative("YW60x.dll", "YW_Felica_RequestService");

                fuc.setRetVal(Type.INT);
                fuc.setParameter(0, ReaderID);
                fuc.setParameter(1, IDM);
                fuc.setParameter(2, NumbersOfCode);
                fuc.setParameter(3, NodeList);
                fuc.setParameter(4, NodeKeyList);
                fuc.invoke();

                ret = fuc.getRetValAsInt();
        }
        catch(NativeException e)
        {
                 ret = -1;
        }
        catch(IllegalAccessException e)
        {
                ret = -2;
        }

        return ret;			
	}


	public int YW_Felica_RequestResponse(int ReaderID, Pointer IDM,
	                   Pointer Mode)
	{
        int ret;
		try
        {
                JNative fuc = new JNative("YW60x.dll", "YW_Felica_RequestResponse");

                fuc.setRetVal(Type.INT);
                fuc.setParameter(0, ReaderID);
                fuc.setParameter(1, IDM);
                fuc.setParameter(2, Mode);
                fuc.invoke();

                ret = fuc.getRetValAsInt();
        }
        catch(NativeException e)
        {
                 ret = -1;
        }
        catch(IllegalAccessException e)
        {
                ret = -2;
        }

        return ret;		
	}


	public int YW_Felica_ReadWithoutEncryption(int ReaderID, Pointer IDM,
	                   byte NumberofService, Pointer ServiceCodeList,
	                   byte NumberofBlock, byte LengthofBlockList, Pointer BlockList,
	                   Pointer Status1, Pointer Status2, Pointer pBlockData)
	{
        int ret;
		try
        {
                JNative fuc = new JNative("YW60x.dll", "YW_Felica_ReadWithoutEncryption");

                fuc.setRetVal(Type.INT);
                fuc.setParameter(0, ReaderID);
                fuc.setParameter(1, IDM);
                fuc.setParameter(2, NumberofService);
                fuc.setParameter(3, ServiceCodeList);
                fuc.setParameter(4, NumberofBlock);
                fuc.setParameter(5, LengthofBlockList);
                fuc.setParameter(6, BlockList);
                fuc.setParameter(7, Status1);
                fuc.setParameter(8, Status2);
                fuc.setParameter(9, pBlockData);
                fuc.invoke();

                ret = fuc.getRetValAsInt();
        }
        catch(NativeException e)
        {
                 ret = -1;
        }
        catch(IllegalAccessException e)
        {
                ret = -2;
        }

        return ret;			
	}


	public int YW_Felica_WriteWithoutEncryption(int ReaderID, Pointer IDM,
	                   byte NumberofService, Pointer ServiceCodeList,
	                   byte NumberofBlock, byte LengthofBlockList, Pointer BlockList,
	                   Pointer pBlockData,
	                   Pointer Status1, Pointer Status2)
	{
        int ret;
		try
        {
                JNative fuc = new JNative("YW60x.dll", "YW_Felica_WriteWithoutEncryption");

                fuc.setRetVal(Type.INT);
                fuc.setParameter(0, ReaderID);
                fuc.setParameter(1, IDM);
                fuc.setParameter(2, NumberofService);
                fuc.setParameter(3, ServiceCodeList);
                fuc.setParameter(4, NumberofBlock);
                fuc.setParameter(5, LengthofBlockList);
                fuc.setParameter(6, BlockList);
                fuc.setParameter(7, pBlockData);
                fuc.setParameter(8, Status1);
                fuc.setParameter(9, Status2);                
                fuc.invoke();

                ret = fuc.getRetValAsInt();
        }
        catch(NativeException e)
        {
                 ret = -1;
        }
        catch(IllegalAccessException e)
        {
                ret = -2;
        }

        return ret;			
	}




	public int YW_ChinaIDV2_RequestCardNo(int ReaderID, Pointer LengthOfCardNo, Pointer CardNo)
	{
        int ret;
		try
        {
                JNative fuc = new JNative("YW60x.dll", "YW_ChinaIDV2_RequestCardNo");

                fuc.setRetVal(Type.INT);
                fuc.setParameter(0, ReaderID);
                fuc.setParameter(1, LengthOfCardNo);
                fuc.setParameter(2, CardNo);            
                fuc.invoke();

                ret = fuc.getRetValAsInt();
        }
        catch(NativeException e)
        {
                 ret = -1;
        }
        catch(IllegalAccessException e)
        {
                ret = -2;
        }

        return ret;		
	}


	public int YW_NTag_GetVersion(int ReaderID,Pointer pData)
	{
        int ret;
		try
        {
                JNative fuc = new JNative("YW60x.dll", "YW_NTag_GetVersion");

                fuc.setRetVal(Type.INT);
                fuc.setParameter(0, ReaderID);
                fuc.setParameter(1, pData);           
                fuc.invoke();

                ret = fuc.getRetValAsInt();
        }
        catch(NativeException e)
        {
                 ret = -1;
        }
        catch(IllegalAccessException e)
        {
                ret = -2;
        }

        return ret;		
	}


	public int YW_NTag_Read(int ReaderID,int StartPage, Pointer DataLen, Pointer pData)
	{
        int ret;
		try
        {
                JNative fuc = new JNative("YW60x.dll", "YW_NTag_Read");

                fuc.setRetVal(Type.INT);
                fuc.setParameter(0, ReaderID);
                fuc.setParameter(1, StartPage);
                fuc.setParameter(2, DataLen); 
                fuc.setParameter(3, pData); 
                fuc.invoke();

                ret = fuc.getRetValAsInt();
        }
        catch(NativeException e)
        {
                 ret = -1;
        }
        catch(IllegalAccessException e)
        {
                ret = -2;
        }

        return ret;		
	}


	public int YW_NTag_FastRead(int ReaderID,int StartPage,int EndPage, Pointer DataLen, Pointer pData)
	{
        int ret;
		try
        {
                JNative fuc = new JNative("YW60x.dll", "YW_NTag_FastRead");

                fuc.setRetVal(Type.INT);
                fuc.setParameter(0, ReaderID);
                fuc.setParameter(1, StartPage);
                fuc.setParameter(2, EndPage); 
                fuc.setParameter(3, DataLen);
                fuc.setParameter(4, pData);
                fuc.invoke();

                ret = fuc.getRetValAsInt();
        }
        catch(NativeException e)
        {
                 ret = -1;
        }
        catch(IllegalAccessException e)
        {
                ret = -2;
        }

        return ret;			
	}


	public int YW_NTag_Write(int ReaderID, int PageIndex, Pointer pData)
	{
        int ret;
		try
        {
                JNative fuc = new JNative("YW60x.dll", "YW_NTag_Write");

                fuc.setRetVal(Type.INT);
                fuc.setParameter(0, ReaderID);
                fuc.setParameter(1, PageIndex);
                fuc.setParameter(2, pData); 
                fuc.invoke();

                ret = fuc.getRetValAsInt();
        }
        catch(NativeException e)
        {
                 ret = -1;
        }
        catch(IllegalAccessException e)
        {
                ret = -2;
        }

        return ret;		
	}


	public int YW_NTag_CompatibleWrite(int ReaderID, int PageIndex, Pointer pData)
	{
        int ret;
		try
        {
                JNative fuc = new JNative("YW60x.dll", "YW_NTag_CompatibleWrite");

                fuc.setRetVal(Type.INT);
                fuc.setParameter(0, ReaderID);
                fuc.setParameter(1, PageIndex);
                fuc.setParameter(2, pData); 
                fuc.invoke();

                ret = fuc.getRetValAsInt();
        }
        catch(NativeException e)
        {
                 ret = -1;
        }
        catch(IllegalAccessException e)
        {
                ret = -2;
        }

        return ret;		
	}


	public int YW_NTag_ReadCounter(int ReaderID, Pointer Counter)
	{
        int ret;
		try
        {
                JNative fuc = new JNative("YW60x.dll", "YW_NTag_ReadCounter");

                fuc.setRetVal(Type.INT);
                fuc.setParameter(0, ReaderID);
                fuc.setParameter(1, Counter); 
                fuc.invoke();

                ret = fuc.getRetValAsInt();
        }
        catch(NativeException e)
        {
                 ret = -1;
        }
        catch(IllegalAccessException e)
        {
                ret = -2;
        }

        return ret;			
	}


	public int YW_NTag_Password_Auth(int ReaderID,Pointer PWD, Pointer AuthResult)
	{
        int ret;
		try
        {
                JNative fuc = new JNative("YW60x.dll", "YW_NTag_Password_Auth");

                fuc.setRetVal(Type.INT);
                fuc.setParameter(0, ReaderID);
                fuc.setParameter(1, PWD);
                fuc.setParameter(2, AuthResult); 
                fuc.invoke();

                ret = fuc.getRetValAsInt();
        }
        catch(NativeException e)
        {
                 ret = -1;
        }
        catch(IllegalAccessException e)
        {
                ret = -2;
        }

        return ret;		
	}


	public int YW_NTag_ReadSignature(int ReaderID,Pointer Signature)
	{
        int ret;
		try
        {
                JNative fuc = new JNative("YW60x.dll", "YW_NTag_Password_Auth");

                fuc.setRetVal(Type.INT);
                fuc.setParameter(0, ReaderID);
                fuc.setParameter(1, Signature);
                fuc.invoke();

                ret = fuc.getRetValAsInt();
        }
        catch(NativeException e)
        {
                 ret = -1;
        }
        catch(IllegalAccessException e)
        {
                ret = -2;
        }

        return ret;			
	}


	//////////////****************NTag End************////////////////////


}

