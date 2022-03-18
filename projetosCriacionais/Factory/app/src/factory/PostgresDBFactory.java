package factory;

import model.DB;
import model.PostgresDB;

public class PostgresDBFactory extends DBFactory{

	@Override
	public DB conectDB(String sql) {
		return new PostgresDB();
	}

}
