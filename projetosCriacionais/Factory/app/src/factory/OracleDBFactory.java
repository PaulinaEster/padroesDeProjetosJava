package factory;

import model.DB;
import model.OracleDB;

public class OracleDBFactory extends DBFactory{

	@Override
	public DB conectDB(String sql) {
		return new OracleDB();
	}

}
