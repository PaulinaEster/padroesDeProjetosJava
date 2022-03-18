
import factory.iphoneFactory.IPhoneFactory;
import factory.iphoneFactory.IPhoneXFactory;
import factory.rulesFactory.*;
import model.IPhone.IPhone;

public class Client {
	public static void main(String[] args) {
		
		CountryRulesAbstractFactory rules = null;
		IPhoneFactory factory = null;
		IPhone device = null;
			
		rules = new ArgentinaRulesAbstractFactory();
		factory = new IPhoneXFactory(rules);
		device = factory.orderIPhone("Ultra");
		System.out.println(device);
		
		
		
	}
}
