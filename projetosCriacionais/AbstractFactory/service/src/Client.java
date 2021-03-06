import factory.*;
import model.EJABService.EJABService;
import model.restService.RestService;

public class Client {

	public static void main(String[] args) {
		
		ServiceAbstractFactory factory = null;
		EJABService ejab = null;
		RestService rest = null;
		
		factory = new UserAbstractFactory();
		ejab = factory.getEJABSerice();
		System.out.println(ejab.save());
		ejab.delete();
		System.out.println(ejab);
		
		
		factory = new CarAbstractFactory();
		rest = factory.getRestService();
		System.out.println(rest.save());
		System.out.println(rest.update());
		System.out.println(rest);
	
	}

}
