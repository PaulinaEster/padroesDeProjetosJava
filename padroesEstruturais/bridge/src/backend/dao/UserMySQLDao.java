package backend.dao;

import backend.model.User;

public class UserMySQLDao implements UserDao{

	@Override
	public void save(User user) {
		System.out.println("Saving the user in the MySQL DB");
		
	}

}
