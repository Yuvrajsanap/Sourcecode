import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ParameterMetaData;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class parameter2 {

	public static void main(String[] args) {
		try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/metadata_db", "root",
				"Yuvraj@12345")) {
			// SQL query with parameters (placeholders)
			String sql = "SELECT * FROM parametr2 WHERE column1 = ? AND column2 = ?";

			// Create a PreparedStatement
			PreparedStatement preparedStatement = connection.prepareStatement(sql);

			// Get ParameterMetaData from the PreparedStatement
			ParameterMetaData pmd = preparedStatement.getParameterMetaData();

			// Get and print metadata information
			int parameterCount = pmd.getParameterCount();
			System.out.println("Number of parameters: " + parameterCount);

			for (int i = 1; i <= parameterCount; i++) {
				System.out.println("Parameter " + i + ":");
				System.out.println("  Type: " + pmd.getParameterTypeName(i));
				System.out.println("  Mode: " + getParameterMode(pmd.getParameterMode(i)));
				System.out.println("  Precision: " + pmd.getPrecision(i));
				System.out.println("  Scale: " + pmd.getScale(i));
				System.out.println(
						"  Is Nullable: " + (pmd.isNullable(i) == ParameterMetaData.parameterNullable ? "YES" : "NO"));
			}

			// Setting values to parameters for demonstration (not executing query here)
			preparedStatement.setString(1, "value1");
			preparedStatement.setInt(2, 123);

			// Optional: Execute the query to fetch results
			try (ResultSet resultSet = preparedStatement.executeQuery()) {
				while (resultSet.next()) {
					// Process the result set
					System.out.println("Column1: " + resultSet.getString("column1"));
					System.out.println("Column2: " + resultSet.getInt("column2"));
				}
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	private static String getParameterMode(int mode) {
		switch (mode) {
		case ParameterMetaData.parameterModeIn:
			return "IN";
		case ParameterMetaData.parameterModeOut:
			return "OUT";
		case ParameterMetaData.parameterModeInOut:
			return "INOUT";
		case ParameterMetaData.parameterModeUnknown:
		default:
			return "UNKNOWN";
		}
	}
}
