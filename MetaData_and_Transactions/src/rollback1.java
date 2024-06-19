
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class rollback1 {
	public static void main(String args[]) {

		Connection connection = null;
		Statement stmt = null;
		ResultSet resultSet = null;

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/rollback1_db", "root",
					"Yuvraj@12345");

			connection.setAutoCommit(false);

			stmt = connection.createStatement();

			stmt.executeUpdate("insert into student values (10,'jayesh','jayesh12@gmail.com',24)");

			int updateResult = stmt.executeUpdate("update student set name='shubham', age=29 where id =2");
			System.out.println(updateResult + " record(s) updated");

			int deleteResult = stmt.executeUpdate("delete from student where id=6");
			System.out.println(deleteResult + " record(s) deleted");

			throw new RuntimeException("Simulated error to test rollback");

		} catch (SQLException | ClassNotFoundException | RuntimeException e) {
			try {
				if (connection != null) {
					connection.rollback();
					System.out.println("Transaction rolled back successfully.");
				}
			} catch (SQLException rollbackException) {
				System.out.println("Error rolling back transaction: " + rollbackException.getMessage());
			}

			e.printStackTrace();

		} finally {

			try {
				if (resultSet != null)
					resultSet.close();
				if (stmt != null)
					stmt.close();
				if (connection != null)
					connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
