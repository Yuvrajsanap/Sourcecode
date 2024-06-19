import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class rollback2 {
	public static void main(String args[]) throws SQLException {

		DriverManager.registerDriver(new com.mysql.jdbc.Driver());
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/rollback1_db", "root",
				"Yuvraj@12345");
		System.out.println("Connection established......");

		con.setAutoCommit(false);

		Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);

		ResultSet rs = stmt.executeQuery("select * from student2");
		System.out.println("Contents of the table initially");
		while (rs.next()) {
			System.out.print("ID: " + rs.getString("ID") + ", ");
			System.out.print("First_Name: " + rs.getString("First_Name") + ", ");
			System.out.print("Last_Name: " + rs.getString("Last_Name") + ", ");
			System.out.print("Date_Of_Birth: " + rs.getString("Date_Of_Birth") + ", ");
			System.out.print("Place_Of_Birth: " + rs.getString("Place_Of_Birth") + ", ");
			System.out.print("Country: " + rs.getString("Country"));
			System.out.println("");
		}
		PreparedStatement pstmt = con.prepareStatement("INSERT INTO student2 VALUES (?, ?, ?, ?, ?, ?)");
		pstmt.setInt(1, 9);
		pstmt.setString(2, "ysh");
		pstmt.setString(3, "jaisval");
		pstmt.setDate(4, new Date(486194400000L));
		pstmt.setString(5, "Mumbai");
		pstmt.setString(6, "india");
		pstmt.executeUpdate();

		con.commit();

		stmt.execute("Delete from student2 where id = 8");

		con.rollback();

		System.out.println("Contents of the table");
		rs = stmt.executeQuery("select * from student2");
		while (rs.next()) {
			System.out.print("ID: " + rs.getString("ID") + ", ");
			System.out.print("First_Name: " + rs.getString("First_Name") + ", ");
			System.out.print("Last_Name: " + rs.getString("Last_Name") + ", ");
			System.out.print("Date_Of_Birth: " + rs.getString("Date_Of_Birth") + ", ");
			System.out.print("Place_Of_Birth: " + rs.getString("Place_Of_Birth") + ", ");
			System.out.print("Country: " + rs.getString("Country"));
			System.out.println("");
		}
	}
}