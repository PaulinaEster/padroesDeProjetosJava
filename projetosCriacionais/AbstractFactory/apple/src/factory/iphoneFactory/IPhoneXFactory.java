package factory.iphoneFactory;

import factory.rulesFactory.CountryRulesAbstractFactory;
import model.IPhone.IPhone;
import model.IPhone.IPhoneX;
import model.IPhone.IPhoneXSMax;

public class IPhoneXFactory extends IPhoneFactory{

	public IPhoneXFactory(CountryRulesAbstractFactory rules) {
		super(rules);
		// TODO Auto-generated constructor stub
	}

	@Override
	public IPhone createIPhone(String level) {
		
		if("Basic".equals(level)) {
			return new IPhoneX(rules);
		}else {
			return new IPhoneXSMax(rules);		
		}
		
	}
	
}
