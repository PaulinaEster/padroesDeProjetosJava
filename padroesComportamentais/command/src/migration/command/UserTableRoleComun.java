package migration.command;

import java.util.*;

public class UserTableRoleComun extends MigrationCommand {
	
	public UserTableRoleComun(Map<String, List<String>> database) {
		super(database);
	}

	@Override
	public void execute() {
		List<String> columns = database.get("User");
		columns.add("Role");
	}

	@Override
	public void undo() {
		List<String> columns = database.get("User");
		columns.remove("Role");
	}
}
