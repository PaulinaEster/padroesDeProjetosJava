package model;

public class PostgresDB implements DB{

	@Override
	public void query(String sql) {
		System.out.println("conectando com db " + sql);
	}

	@Override
	public void update(String sql) {
		// TODO Auto-generated method stub
		System.out.println("Updating db " + sql);
	}

}
