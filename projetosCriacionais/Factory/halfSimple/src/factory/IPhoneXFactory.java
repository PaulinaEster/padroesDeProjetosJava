package factory;

import model.IPhone;
import model.IPhoneX;
import model.IPhoneXSMax;

public class IPhoneXFactory extends IPhoneFactory{

	public IPhone createIPhone(String model) {
		if("Basic".equals(model)) {
			return new IPhoneX();
		}else {
			return new IPhoneXSMax();
		}
	}

}
