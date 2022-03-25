package backend.services;

import backend.dao.UserDao;
import backend.model.User;

public class UserEJB extends UserService{

	public UserEJB(UserDao dao) {
		super(dao);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void save(User user) {
		System.out.println("Starting a save operation through EJB Protocol!");
		dao.save(user);
	}

}
