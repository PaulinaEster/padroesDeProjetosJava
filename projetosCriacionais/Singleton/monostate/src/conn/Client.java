package conn;

public class Client {
	public static void main(String[] args) {
		System.out.println("Connection Pool Size: " + ConnectionPool.POOL_SIZE);
		int pool = ConnectionPool.POOL_SIZE;
		System.out.println(pool);
		doQuery("*", "A1");
		doQuery1("*", "A2");
		doQuery("*", "A3");
		doQuery("*", "A4");
		doQuery("*", "A5");
	}
	
	public static void doQuery(String to, String from) {
		ConnectionPool pool = new ConnectionPool();
		Connection conn = pool.getConnection();
		if(conn != null) {
			conn.query(" SELECT " + to + " FROM " + from);
		}
	}
	
	public static void doQuery1(String to, String from) {
		ConnectionPool pool = new ConnectionPool();
		Connection conn = pool.getConnection();
		if(conn != null) {
			conn.query(" SELECT " + to + " FROM " + from);
		}
		System.out.println("Leaving connection " + from + "...");
		pool.leaveConnection(conn);
	}
}
