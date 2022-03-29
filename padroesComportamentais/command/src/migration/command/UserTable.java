package migration.command;

import java.util.*;

public class UserTable extends MigrationCommand {
	
	public UserTable(Map<String, List<String>> database) {
		super(database);
	}

	@Override
	public void execute() {
		List<String> columns = new ArrayList<String>(Arrays.asList("Id", "Name", "Email", "Password"));
		database.put("User", columns);
	}

	@Override
	public void undo() {
		database.remove("User");
	}

}
