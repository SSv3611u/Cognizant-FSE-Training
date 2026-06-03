import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class BasicJdbcConnection {
    private static final String URL = "jdbc:mysql://localhost:3306/school";
    private static final String USER = "root";
    private static final String PASSWORD = "password";

    private static void printStudents(Connection connection) throws SQLException {
        String sql = "SELECT id, name, marks FROM students";

        try (Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(sql)) {
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                int marks = resultSet.getInt("marks");
                System.out.println(id + " - " + name + " - " + marks);
            }
        }
    }

    public static void main(String[] args) {
        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD)) {
            printStudents(connection);
        } catch (SQLException ex) {
            System.out.println("Database error: " + ex.getMessage());
        }
    }
}
