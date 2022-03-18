import factory.IPhoneFactory;
import model.IPhone;

public class Client {

	public static void main(String[] args) {
		System.out.println("## IPhoneX ##");
		IPhone device = IPhoneFactory.ortherIPhone("X", "Basic");
		
		System.out.println(device);
		
		System.out.println("## IPhone 11 Pro ##");
		device = IPhoneFactory.ortherIPhone("11", "Ultra");
		System.out.println(device);
		
	}

}
