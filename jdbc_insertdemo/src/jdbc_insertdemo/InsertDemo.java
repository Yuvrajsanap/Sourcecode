package jdbc_insertdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class InsertDemo {
	public static void main(String args[]) throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_db", "root", "Yuvraj@12345");

		PreparedStatement ps = con
				.prepareStatement("insert into employee values('suraj','suraj@gmail.com','suraj@123','male','Mumbai')");
		int i = ps.executeUpdate();

		if (i > 0) {
			System.out.println("Update success");
		} else {
			System.out.println("Fail");
		}
		con.close();

	}
}
