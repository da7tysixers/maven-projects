package jdbctransactions;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class TransactionsMain {
	
	public static void main(String[] args) {
		Connection myConn = null;
		Statement myStmt = null;
		
		try {
			String url = "jdbc:mysql://localhost:3306/demo";
			String username = "student";
			String password = "student";
			// Get connection
			myConn = DriverManager.getConnection(url, username, password);
			
			// Turn of auto commit statement.
			myConn.setAutoCommit(false);
			
			// Display details before changes
			
			System.out.println("Before commit\n");
			System.out.printf("%20s%n","|HR Department|");
			showSalaries(myConn, myStmt, "HR");
			System.out.printf("%n%20s%n","|Engineering Department|");
			showSalaries(myConn, myStmt, "Engineering");
			
			// Create statement: Transaction 1.
			myStmt = myConn.createStatement();
			myStmt.executeUpdate("delete from employees where department = 'HR'");
			
			//Transcation Two set salaries to 300000 for all engineering.
			myStmt.executeUpdate("update employees set salary=300000 where department = 'Engineering'");
			System.out.println("Transaction steps are ready");
			
			boolean ok = askUserIfOkToSave();
			
			if (ok) {
				//commit
				myConn.commit();
				System.out.println("\n>> Transcation Committed. \n");
			}else {
				//discard
				myConn.rollback();
				System.out.println("\n>> Transcation Rolled Back.\n");
			}
			
			// Show salaries After Transaction made..
			System.out.println("SALARIES AFTER \n");
			System.out.printf("%20s%n","|HR Department|");
			showSalaries(myConn, myStmt, "HR");
			System.out.printf("%n%20s%n","|Engineering Department|");
			showSalaries(myConn, myStmt, "Engineering");
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	private static boolean askUserIfOkToSave() {
		return false;
	}

	private static void showSalaries(Connection myConn, Statement myStmt, String dept) throws SQLException {
		myStmt = myConn.createStatement();
		ResultSet result = myStmt.executeQuery("select * from employees where department = '" + dept + "'" );
		while (result.next()) {
			System.out.println(result.getString("last_name") + ", " + result.getString("first_name") +
					", " + result.getString("department") + ", " + result.getDouble("salary"));
			
		}
	
		
	}
}
