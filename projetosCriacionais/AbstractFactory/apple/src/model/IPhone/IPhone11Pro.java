package model.IPhone;

import factory.rulesFactory.CountryRulesAbstractFactory;

public class IPhone11Pro extends IPhone{
	public IPhone11Pro(CountryRulesAbstractFactory rules) {
		super(rules);
		// TODO Auto-generated constructor stub
	}

	public void getHardware() {
		System.out.println("Hardware list");
		System.out.println("\t- 6.5in Screen");
		System.out.println("\t- A13 Chipset");
		System.out.println("\t- 4Gb RAM");
		System.out.println("\t- 512Gb Memory");
		
	}
}
