package preparedStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MainApplication {

	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement st = null;
		ResultSet result = null;
		String url = "jdbc:mysql://localhost:3306/demo";
		String username = "student";
		String password = "student";
		
		try {
			
			// get connection
			conn = DriverManager.getConnection(url, username, password);
			
			// Prepare Statement
			String sql = "select * from employees where salary > ? and department =?";
			st = conn.prepareStatement(sql);
			
			// set the parameters
			st.setDouble(1, 80000);
			st.setString(2, "Legal");
			result = st.executeQuery(); 
			while(result.next()) {
				System.out.println(result.getString("last_name") + ", " + result.getString("first_name") 
				+ ", " + result.getDouble("salary") + ", " + result.getString("department"));
			}
			conn.close();
			st.close();
			result.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
