package util;

import org.junit.Test;
import org.xvolks.jnative.exceptions.NativeException;

import cn.tit.ias.util.equipment.NFC;
import cn.tit.ias.util.equipmentfactory.ScanFactory;
/**
 * 
 *  
 * @Description:Test nfc status 
 * @author: maotao 
 * @date:   2019年5月28日 下午9:20:04       
 *
 */
public class TestNFC {
	@Test
	public void test(){
		try {
			ScanFactory nfc = new NFC();
			nfc.setConnect();
			((NFC) nfc).readData();
		} catch (NativeException e) {
			e.printStackTrace();
		}
	}

}
