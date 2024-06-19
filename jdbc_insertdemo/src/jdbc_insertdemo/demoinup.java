package jdbc_insertdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

//Student
public class demoinup {
	public static void main(String args[]) throws Exception

	{

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/inup_example", "root",
				"Yuvraj@12345");

		Statement stmt = connection.createStatement();

		stmt.executeUpdate("insert into student values (7, 'amit', 'amit@gmail.com',60)");

		int result = stmt.executeUpdate("update student set name='Pritesh', email='pritesh333@gmail.com' where id =2");
		result = stmt.executeUpdate("delete from student where id=4");

		System.out.println(result + " records affected");

		ResultSet resultSet = stmt.executeQuery("select * from student");

		while (resultSet.next())

		{

			System.out.println(resultSet.getInt(1) + " " + resultSet.getString(2) + " " + resultSet.getString(3) + " "
					+ resultSet.getInt(4));

			connection.close();
		}
	}

}