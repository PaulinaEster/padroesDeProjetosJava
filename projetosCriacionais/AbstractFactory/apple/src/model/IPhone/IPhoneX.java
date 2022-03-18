package model.IPhone;

import factory.rulesFactory.CountryRulesAbstractFactory;

public class IPhoneX extends IPhone{

	
	public IPhoneX(CountryRulesAbstractFactory rules) {
		super(rules);
		// TODO Auto-generated constructor stub
	}

	public void getHardware() {
		System.out.println("Hardware list");
		System.out.println("\t- 5.8in Screen");
		System.out.println("\t- A11 Chipset");
		System.out.println("\t- 3Gb RAM");
		System.out.println("\t- 256Gb Memory");
		
	}

}
