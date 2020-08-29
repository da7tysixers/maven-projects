package insertData;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class DataInsert {
	public static void main(String[] args) {
		// initialize connection
		Connection connection = null;
		//initialize statement to null
		Statement statement = null;
		// created database url
		String url = "jdbc:mysql://localhost:3306/demo";
		String password = "student";
		String username = "student";
		
		try {
			
			// get connection.
			connection = DriverManager.getConnection(url, username, password);
			System.out.println("Connection successful!");
			// create statement;
			statement = connection.createStatement();
			String sql = "insert into employees(last_name, first_name, email, department, salary)"
					+ " values('Wright', 'Eric', 'eric.wright@foo.com', 'HR', 33000.00)"; 
			 int count = statement.executeUpdate(sql);
			System.out.println("Numbers of rows affected is " + count);
			
			ResultSet rs = statement.executeQuery("select * from employees order by last_name");
			while (rs.next()) {
				System.out.println(rs.getString("last_name") + ", " + rs.getString("first_name"));
				
			}
			connection.close();
			statement.close();
			rs.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
	
	

}
