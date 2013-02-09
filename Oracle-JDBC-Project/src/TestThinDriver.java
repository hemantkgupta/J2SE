import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class TestThinDriver {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			Class.forName ("oracle.jdbc.driver.OracleDriver");
            Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "hr", "hr");
            Statement stmt = conn.createStatement();
			ResultSet rset = stmt.executeQuery("select table_name from user_tables");
			while (rset.next())
				System.out.println (rset.getString(1)); 
			stmt.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}


