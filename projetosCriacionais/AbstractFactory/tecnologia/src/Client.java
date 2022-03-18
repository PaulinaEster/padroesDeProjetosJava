import factory.*;
import model.userService.UserService;

public class Client {

	public static void main(String[] args) {
		ServicesAbstractFactory factory = null;
		UserService userService = null;
		
		
		factory = new EJBAbstractFactory();
		userService = factory.getUserService();
		userService.save();
		userService.delete();
		System.out.println(userService);
		
	}

}
