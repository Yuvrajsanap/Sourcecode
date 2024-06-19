import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class rollback3 {
	public static void main(String args[]) throws SQLException {

		DriverManager.registerDriver(new com.mysql.jdbc.Driver());
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/rollback1_db", "root",
				"Yuvraj@12345");
		System.out.println("Connection established......");

		con.setAutoCommit(false);

		Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);

		ResultSet rs = stmt.executeQuery("select * from employe");
		System.out.println("Contents of the table initially");
		while (rs.next()) {
			System.out.print("employee_id :" + rs.getString("employee_id") + ", ");
			System.out.print("First_Name: " + rs.getString("First_Name") + ", ");
			System.out.print("Last_Name: " + rs.getString("Last_Name") + ", ");
			System.out.print("email: " + rs.getString("email") + ", ");
			System.out.print("phone_number: " + rs.getString("phone_number") + ", ");
			System.out.print("salary: " + rs.getString("salary"));
			System.out.println("");
		}
		PreparedStatement pstmt = con.prepareStatement("INSERT INTO employe VALUES (?, ?, ?, ?, ?, ?)");
		pstmt.setInt(1, 805);
		pstmt.setString(2, "mayur");
		pstmt.setString(3, "patil");
		pstmt.setString(4, "mayur@gamil.com");
		pstmt.setString(5, "7459254");
		pstmt.setInt(6, 9500);
		pstmt.executeUpdate();

		con.commit();

		stmt.execute("Delete from employe where employee_id = 3");

		con.rollback();

		System.out.println("Contents of the table");
		rs = stmt.executeQuery("select * from employe");
		while (rs.next()) {
			System.out.print("employee_id: " + rs.getString("employee_id") + ", ");
			System.out.print("First_Name: " + rs.getString("First_Name") + ", ");
			System.out.print("Last_Name: " + rs.getString("Last_Name") + ", ");
			System.out.print("email: " + rs.getString("email") + ", ");
			System.out.print("phone_number: " + rs.getString("phone_number") + ", ");
			System.out.print("salary: " + rs.getString("salary"));
			System.out.println("");
		}
	}
}