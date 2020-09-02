import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;


public class JdbcTest {
	
	
	public static void main(String args[]) {
		
		Integer num1 = new Integer(1);
		Integer num2 = num1;
		num1+= 1;
		System.out.println(num1);
		System.out.println(num2);
		
		System.out.println(num2);
		
		Connection conn = null;
		Statement statement = null;
		ResultSet result = null;
		String url = "jdbc:mysql://localhost:3306/demo?useSSL=false";
		String username = "student";
		String password = "student";
		
		try {
			// get connection
		conn = DriverManager.getConnection(url, username, password);
		System.out.println("Database connection successful!\n");
			// create statement
		statement = conn.createStatement();
			//execute query to database
		String sql = "select * from employees";
		result = statement.executeQuery(sql);
		
			// process statment;
		while (result.next()) {
			System.out.println(result.getString("last_name") + ", " + result.getString("first_name"));
			
		}
		
		}catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				conn.close();
				statement.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			

		}
	}

}
