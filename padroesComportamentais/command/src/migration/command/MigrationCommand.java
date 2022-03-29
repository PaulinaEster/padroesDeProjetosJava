package migration.command;

import java.util.*;

public abstract class MigrationCommand {
	protected Map<String, List<String>> database;
	
	public MigrationCommand(Map<String, List<String>> database) {
		this.database = database;
	}
	
	public abstract void execute();
	public abstract void undo();
	
}
