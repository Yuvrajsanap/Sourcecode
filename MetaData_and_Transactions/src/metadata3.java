
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class metadata3 {
	public static void main(String[] args) {
		try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/metadata_db", "root",
				"Yuvraj@12345")) {
			DatabaseMetaData metaData = connection.getMetaData();

			ResultSet tables = metaData.getTables(null, null, "%", new String[] { "TABLE" });
			System.out.println("Tables:");
			while (tables.next()) {
				String tableName = tables.getString("TABLE_NAME");
				System.out.println(" - " + tableName);
			}

			String specificTable = "metadata3"; //
			ResultSet columns = metaData.getColumns(null, null, specificTable, "%");
			System.out.println("\nColumns in " + specificTable + ":");
			while (columns.next()) {
				String columnName = columns.getString("COLUMN_NAME");
				String columnType = columns.getString("TYPE_NAME");
				int columnSize = columns.getInt("COLUMN_SIZE");
				System.out.println(" - " + columnName + " (" + columnType + "(" + columnSize + "))");
			}

			ResultSet types = metaData.getTypeInfo();
			System.out.println("\nTypes:");
			while (types.next()) {
				String typeName = types.getString("TYPE_NAME");
				System.out.println(" - " + typeName);
			}

			ResultSet primaryKeys = metaData.getPrimaryKeys(null, null, specificTable);
			System.out.println("\nPrimary keys in " + specificTable + ":");
			while (primaryKeys.next()) {
				String primaryKeyColumn = primaryKeys.getString("COLUMN_NAME");
				System.out.println(" - " + primaryKeyColumn);
			}

			ResultSet procedures = metaData.getProcedures(null, null, "%");
			System.out.println("\nProcedures:");
			while (procedures.next()) {
				String procedureName = procedures.getString("PROCEDURE_NAME");
				System.out.println(" - " + procedureName);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
