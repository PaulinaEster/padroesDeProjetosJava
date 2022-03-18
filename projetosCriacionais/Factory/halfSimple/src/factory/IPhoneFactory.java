package factory;

import model.IPhone;

public abstract class IPhoneFactory {
	public abstract IPhone createIPhone(String model);
	
	public IPhone ortherIPhone(String model) {
		IPhone device = null;
		
		device = this.createIPhone(model);
		device.assemble();
		device.certificates();
		device.getHardware();
		device.pack();
		
		return device;
	}
	

}
