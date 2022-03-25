package backend;

import backend.dao.*;
import backend.dao.UserOracleDao;
import backend.model.User;
import backend.services.*;

public class Client {

	public static void main(String[] args) {
		UserDao daoDB = null;
		UserService service = null;
		User usuario = null;
		
		
		daoDB = new UserMySQLDao();
		service = new UserRest(daoDB);
		usuario = new User("Paulina", "Paulina@paulina.com", "password1");
		service.save(usuario);
		
		
		daoDB = new UserOracleDao();
		service = new UserEJB(daoDB);
		service.save(usuario);
		
		

	}

}
