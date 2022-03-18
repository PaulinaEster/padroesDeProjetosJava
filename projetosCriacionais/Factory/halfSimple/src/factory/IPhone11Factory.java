package factory;

import model.IPhone;
import model.IPhone11;
import model.IPhone11Pro;

public class IPhone11Factory extends IPhoneFactory{

	@Override
	public IPhone createIPhone(String model) {
		if("Basic".equals(model)) {
			return new IPhone11();
		}else {
			return new IPhone11Pro();
		}
	}
	

}
