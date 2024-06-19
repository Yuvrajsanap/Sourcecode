package jdbc_insertdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

//Student
public class class_example {
	public static void main(String args[]) throws Exception

	{

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/class_db", "root",
				"Yuvraj@12345");

		Statement stmt = connection.createStatement();

		stmt.executeUpdate("insert into class values (7, 'PT_707', 'jay sir',07,'108')");

		int result = stmt.executeUpdate("update class set teacher_name='yuvraj', room_number='1000' where id =5");
		result = stmt.executeUpdate("delete from class where id=4");

		System.out.println(result + " records affected");

		ResultSet resultSet = stmt.executeQuery("select * from class");

		while (resultSet.next())

		{

			System.out.println(resultSet.getInt(1) + " " + resultSet.getString(2) + " " + resultSet.getString(3) + " "
					+ resultSet.getInt(4));

			connection.close();
		}
	}

}