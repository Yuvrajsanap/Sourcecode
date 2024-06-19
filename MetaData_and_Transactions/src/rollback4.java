import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class rollback4 {
	public static void main(String args[]) throws SQLException {

		DriverManager.registerDriver(new com.mysql.jdbc.Driver());
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/rollback1_db", "root",
				"Yuvraj@12345");
		System.out.println("Connection established......");

		con.setAutoCommit(false);

		Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);

		ResultSet rs = stmt.executeQuery("select * from Books");
		System.out.println("Contents of the table initially");
		while (rs.next()) {
			System.out.print("BookID: " + rs.getString("BookID") + ", ");
			System.out.print("Title: " + rs.getString("Title") + ", ");
			System.out.print("Author: " + rs.getString("Author") + ", ");
			System.out.print("PublicationDate: " + rs.getString("PublicationDate") + ", ");
			System.out.print("Genre: " + rs.getString("Genre") + ", ");
			System.out.println("");
		}
		PreparedStatement pstmt = con.prepareStatement("INSERT INTO Books VALUES (?, ?, ?, ?, ?)");
		pstmt.setInt(1, 7);
		pstmt.setString(2, "The life");
		pstmt.setString(3, "j.nolan");
		pstmt.setDate(4, new Date(147794400000L));
		pstmt.setString(5, "Mystery");
		pstmt.executeUpdate();

		con.commit();

		stmt.execute("Delete from Books where BookID = 4");

		con.rollback();

		System.out.println("Contents of the table");
		rs = stmt.executeQuery("select * from Books");
		while (rs.next()) {
			System.out.print("BookID: " + rs.getString("BookID") + ", ");
			System.out.print("Title: " + rs.getString("Title") + ", ");
			System.out.print("Author: " + rs.getString("Author") + ", ");
			System.out.print("PublicationDate: " + rs.getString("PublicationDate") + ", ");
			System.out.print("Genre: " + rs.getString("Genre") + ", ");
			System.out.println("");
		}
	}
}