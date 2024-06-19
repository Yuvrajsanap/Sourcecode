
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.sql.RowSetMetaData;
import javax.sql.rowset.CachedRowSet;
import javax.sql.rowset.RowSetProvider;

public class rowset3 {

	public static void main(String[] args) {
		try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/metadata_db", "root",
				"Yuvraj@12345");
				Statement statement = connection.createStatement();
				ResultSet resultSet = statement.executeQuery("SELECT * FROM rowset3")) {//

			CachedRowSet rowSet = RowSetProvider.newFactory().createCachedRowSet();
			rowSet.populate(resultSet);

			RowSetMetaData rsmd = (RowSetMetaData) rowSet.getMetaData();

			int columnCount = rsmd.getColumnCount();
			System.out.println("Number of columns: " + columnCount);

			for (int i = 1; i <= columnCount; i++) {
				System.out.println("Column " + i + ":");
				System.out.println("  Name: " + rsmd.getColumnName(i));
				System.out.println("  Type: " + rsmd.getColumnTypeName(i));
				System.out.println("  Display Size: " + rsmd.getColumnDisplaySize(i));
				System.out.println("  Is Nullable: " + rsmd.isNullable(i));
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
