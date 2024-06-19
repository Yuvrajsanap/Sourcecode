package jdbc_insertdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

//Student
public class employe_example {
	public static void main(String args[]) throws Exception

	{

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/employe_db", "root",
				"Yuvraj@12345");

		Statement stmt = connection.createStatement();

		stmt.executeUpdate("insert into employe values (8, 'harsh', 'darade',2000,96455836)");

		int result = stmt.executeUpdate("update employe set FirstName='shubham', Salary=45000 where id =2");
		result = stmt.executeUpdate("delete from employe where id=4");

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