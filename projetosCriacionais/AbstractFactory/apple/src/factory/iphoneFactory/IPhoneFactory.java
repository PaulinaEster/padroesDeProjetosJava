package factory.iphoneFactory;

import factory.rulesFactory.CountryRulesAbstractFactory;
import model.IPhone.IPhone;

public abstract class IPhoneFactory {
	
	
	CountryRulesAbstractFactory rules;
	
	public IPhoneFactory(CountryRulesAbstractFactory rules) {
		this.rules = rules;
	}

	public abstract IPhone createIPhone(String level);
	
	public IPhone orderIPhone(String level) {
		IPhone device = null;
		device = createIPhone(level);
		device.assemble();
		device.certificates();
		device.getHardware();
		device.pack();
		
		return device;
	}

}
