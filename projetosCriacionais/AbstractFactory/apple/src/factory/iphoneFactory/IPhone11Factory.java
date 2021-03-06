package factory.iphoneFactory;

import factory.rulesFactory.CountryRulesAbstractFactory;
import model.IPhone.IPhone;
import model.IPhone.IPhone11;
import model.IPhone.IPhone11Pro;

public class IPhone11Factory extends IPhoneFactory{

	public IPhone11Factory(CountryRulesAbstractFactory rules) {
		super(rules);
		// TODO Auto-generated constructor stub
	}

	@Override
	public IPhone createIPhone(String level) {
		if("Basic".equals(level)) {
			return new IPhone11(rules);
		}else {
			return new IPhone11Pro(rules);
		}
	}

}
