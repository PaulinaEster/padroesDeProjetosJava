package adapter.hexagonal.core.usecases;

import java.util.List;
import java.util.stream.Stream;

import adapter.hexagonal.core.model.User;
import adapter.hexagonal.core.ports.UserRepository;

public class UserService {
	private UserRepository userRepo;
	
	public UserService(UserRepository userRepo) {
		this.userRepo = userRepo;
	}
	
	public void saveUser(User user) {
		boolean alreadyUserEmail = userRepo.getAll().stream()
			.anyMatch(userDB -> userDB.getEmail().equalsIgnoreCase(user.getEmail()));
		if(alreadyUserEmail) throw new RuntimeException("Email address already exists!");
		userRepo.save(user);
	}
	
	public List<User> getUsers(){
		return userRepo.getAll();
	}
	
}
