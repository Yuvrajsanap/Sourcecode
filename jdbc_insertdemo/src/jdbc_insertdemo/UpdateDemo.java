package jdbc_insertdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class UpdateDemo {
	public static void main(String args[]) throws Exception {
		String city1 = "Nagpur";
		String email1 = "yuvraj@gmail.com";

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_db", "root", "Yuvraj@12345");

		PreparedStatement ps = con.prepareStatement("update employee set city=? where email=?");
		ps.setString(1, city1);
		ps.setString(2, email1);

		int count = ps.executeUpdate();
		if (count > 0) {
			System.out.println("Udated Succesfully");
		} else {
			System.out.println("Failed");
		}
		con.close();
	}

}
