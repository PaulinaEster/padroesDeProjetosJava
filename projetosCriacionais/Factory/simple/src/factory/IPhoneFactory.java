package factory;

import model.IPhone;
import model.IPhone11;
import model.IPhone11Pro;
import model.IPhoneX;
import model.IPhoneXSMax;

public class IPhoneFactory {
	
	public static IPhone ortherIPhone(String model, String version) {
		IPhone device = null;
		
		if("X".equals(model)) {
			if("Basic".equals(version)) {
				device = new IPhoneX();
			}else {
				device = new IPhoneXSMax();
			}
		}else {
			if("Basic".equals(version)) {
				device = new IPhone11();
			}else {
				device = new IPhone11Pro();
			}
		}
		device.assemble();
		device.certificates();
		device.getHardware();
		device.pack();
		
		return device;
	}
}
