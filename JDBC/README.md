import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class StatementExample {
    public static void main(String[] args) {
        String url = "jdbc:sqlite:test.db"; // Change to your database URL
        try (Connection connection = DriverManager.getConnection(url);
             Statement statement = connection.createStatement()) {

            // Create a table
            String createTableSQL = "CREATE TABLE IF NOT EXISTS employees (id INTEGER PRIMARY KEY, name TEXT, salary REAL)";
            statement.execute(createTableSQL);

            // Insert data
            String insertDataSQL = "INSERT INTO employees (name, salary) VALUES ('John Doe', 45000)";
            int rowsInserted = statement.executeUpdate(insertDataSQL);
            System.out.println(rowsInserted + " row(s) inserted.");

            // Update data
            String updateDataSQL = "UPDATE employees SET salary = 50000 WHERE name = 'John Doe'";
            int rowsUpdated = statement.executeUpdate(updateDataSQL);
            System.out.println(rowsUpdated + " row(s) updated.");

            // Query data
            String selectDataSQL = "SELECT * FROM employees";
            ResultSet resultSet = statement.executeQuery(selectDataSQL);

            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                double salary = resultSet.getDouble("salary");
                System.out.println("ID: " + id + ", Name: " + name + ", Salary: " + salary);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
