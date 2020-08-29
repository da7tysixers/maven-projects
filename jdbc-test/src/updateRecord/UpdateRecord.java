package updateRecord;

import java.io.Closeable;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.x.protobuf.MysqlxConnection.Close;

public class UpdateRecord {
	public static void main(String[] args) {
		Connection conn = null;
		Statement statement = null;
		ResultSet rSet = null;
		
		String url = "jdbc:mysql://localhost:3306/demo";
		String username = "student";
		String password = "student";
		try {
			
			// get connection
			conn = DriverManager.getConnection(url, username, password);
			
			// create statement
			statement = conn.createStatement();
			
			// call method before update
			System.out.println("BEFOR THE UPDATE...");
			displayEmployee(conn, "Doe", "John");
			
			//adding changes....
			int affectedRows = statement.executeUpdate("update employees set email = 'john.doe@luv2code.com'"
					+ "where last_name = 'Doe' and first_name = 'John'");
			
			System.out.println("Rows affected " + affectedRows);
			statement.close();
			conn.close();
			
			
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	
	}

	private static void displayEmployee(Connection conn, String firstName, String secondName) throws SQLException {
		Statement st = conn.createStatement();
		ResultSet rSet = st.executeQuery("select * from employees where last_name = '" + firstName + "' and first_name = '" + secondName + "'");
		while (rSet.next()) {
			System.out.println(rSet.getString("first_name") + ", " + rSet.getString("last_name"));
		
		}
		rSet.close();
		st.close();
	}

}
