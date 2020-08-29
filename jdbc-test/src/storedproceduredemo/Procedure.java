package storedproceduredemo;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Procedure {

	public static void main(String[] args) {
		Connection conn= null;
		CallableStatement myStmt = null;
		
		try {
			String url = "jdbc:mysql://localhost:3306/demo";
			String username = "student";
			String password = "student";
			// get connection
			conn = DriverManager.getConnection(url, username, password);
			
			String theDepartment = "Engineering";
			int theIncreaseAmount = 10000;
			
			//Prepared the stored procedure call
		myStmt = conn.prepareCall("{call increase_salaries_for_department(?,?)}");
			
		//Set the parameters
		 myStmt.setString(1, theDepartment);
		 myStmt.setDouble(2, theIncreaseAmount);
		 
		 //call stored procedure
		 System.out.println("\n\n Calling stored procedure. increase_salaries_for_department('" +
		  theDepartment + "', " + theIncreaseAmount);
		 myStmt.execute();
		 myStmt.close();
		 conn.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
