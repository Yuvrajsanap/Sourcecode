package jdbc_insertdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

//Student
public class parent_example {
	public static void main(String args[]) throws Exception

	{

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/parent_db", "root",
				"Yuvraj@12345");

		Statement stmt = connection.createStatement();

		stmt.executeUpdate("insert into parent values (7, 'chetan', 'chetan@gmail.com','65325836','near xyz hotel')");

		int result = stmt
				.executeUpdate("update parent set parent_name='shubham', email='shubham@gmail.com' where id =2");
		result = stmt.executeUpdate("delete from parent where id=4");

		System.out.println(result + " records affected");

		ResultSet resultSet = stmt.executeQuery("select * from parent");

		while (resultSet.next())

		{

			System.out.println(resultSet.getInt(1) + " " + resultSet.getString(2) + " " + resultSet.getString(3) + " "
					+ resultSet.getInt(4));

			connection.close();
		}
	}

}