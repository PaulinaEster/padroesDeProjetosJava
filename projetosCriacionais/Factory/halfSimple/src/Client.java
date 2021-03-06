
import factory.IPhone11Factory;
import factory.IPhoneFactory;
import factory.IPhoneXFactory;
import model.IPhone;

public class Client {
	public static void main(String[] args) {
		IPhoneFactory genIPhoneFactory = new IPhoneXFactory();
		IPhone device = null;
		
		String model = "Ultra";
		
		System.out.println("## Gerando IPhoneX ##");
		device = genIPhoneFactory.ortherIPhone(model);
		System.out.println(device);
		
		
		genIPhoneFactory = new IPhone11Factory();
		model = "Basic";
		System.out.println("## Gerando IPhone11 ##");
		device = genIPhoneFactory.ortherIPhone(model);
		System.out.println(device);
		
	}
}