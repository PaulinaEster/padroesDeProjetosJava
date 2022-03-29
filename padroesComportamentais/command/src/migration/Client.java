package migration;

import java.util.*;

import migration.command.*;

public class Client {

	public static void main(String[] args) {
		Map<String, List<String>> database = new LinkedHashMap<String, List<String>>();
		MigrationTool tool = new MigrationTool();
		tool.addMigration(new UserTable(database));
		tool.addMigration(new ProductTable(database));
		tool.addMigration(new UserTableRoleComun(database));
		
		System.out.println(database);
		
		tool.up();
		System.out.println(database);
		
		tool.up();
		System.out.println(database);
		
		tool.up();
		System.out.println(database);
		
		tool.up();
		System.out.println(database);
		
		tool.down();
		System.out.println(database);
		
		tool.down();
		System.out.println(database);
		
		tool.down();
		System.out.println(database);
		
		tool.down();
		System.out.println(database);
		
		tool.latest();
		System.out.println(database);
		
		tool.roolback();
		System.out.println(database);
		

	}

}
