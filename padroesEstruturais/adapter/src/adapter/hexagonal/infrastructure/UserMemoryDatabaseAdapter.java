package adapter.hexagonal.infrastructure;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import adapter.hexagonal.core.model.User;
import adapter.hexagonal.core.ports.UserRepository;

public class UserMemoryDatabaseAdapter implements UserRepository{
	
	private Map<String, User> memoryUsers = new HashMap<String, User>(); 

	public void save(User user) {
		memoryUsers.put(user.getEmail(), user);
	}

	@Override
	public List<User> getAll() {
		return new ArrayList<User>(memoryUsers.values());
	}

}
