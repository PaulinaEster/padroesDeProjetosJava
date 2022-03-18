import factory.DBFactory;
import factory.OracleDBFactory;
import factory.PostgresDBFactory;
import model.DB;

public class Application {
	public static void main(String[] args) {
		DBFactory factory = new OracleDBFactory();
		
		
		
		System.out.println("Criado novo banco de dados Oracle");
		DB db = factory.ortherDB("Oracle");
		System.out.println(db);
		
		factory = new PostgresDBFactory();
		System.out.println("Criado novo banco de dados Postgres");
		db = factory.ortherDB("Postgres");
		System.out.println(db);
		db.query("Postgres");
		db.update("Postgres");
		
	}
}
