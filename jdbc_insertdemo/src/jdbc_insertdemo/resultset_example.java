package jdbc_insertdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class resultset_example {
	public static void main(String[] args) {

		String query = "SELECT * FROM result";

		try {

			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/result_db", "root",
					"Yuvraj@12345");

			PreparedStatement preparedStatement = connection.prepareStatement(query);

			ResultSet resultSet = preparedStatement.executeQuery();

			ResultSetMetaData metaData = resultSet.getMetaData();

			int columnCount = metaData.getColumnCount();
			System.out.println("Number of Columns: " + columnCount);

			for (int i = 1; i <= columnCount; i++) {
				// Get column name
				String columnName = metaData.getColumnName(i);
				System.out.println("Column Name: " + columnName);

				int columnType = metaData.getColumnType(i);
				System.out.println("Column Type (int): " + columnType);

				String columnTypeName = metaData.getColumnTypeName(i);
				System.out.println("Column Type Name: " + columnTypeName);

				String tableName = metaData.getTableName(i);
				System.out.println("Table Name: " + tableName);

				System.out.println("------------------------------");
			}

			resultSet.close();
			preparedStatement.close();
			connection.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
