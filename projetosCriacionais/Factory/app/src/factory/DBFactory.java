package factory;

import model.DB;

public abstract class DBFactory {

	public abstract DB conectDB(String sql);
	
	public DB ortherDB(String sql) {
		DB db = conectDB(sql);
		System.out.println("Conectado ao DB");
		
		return db;
	}
}
