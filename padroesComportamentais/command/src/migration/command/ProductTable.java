package migration.command;

import java.util.*;

public class ProductTable extends MigrationCommand{

	public ProductTable(Map<String, List<String>> database) {
		super(database);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void execute() {
		List<String> columns = new ArrayList<String>(Arrays.asList("Id", "Descripton", "Price"));
		database.put("Product", columns);
	}

	@Override
	public void undo() {
		database.remove("Product");
	}

}
