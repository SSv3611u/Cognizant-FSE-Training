import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class StudentDAO {
    private static final String URL = "jdbc:mysql://localhost:3306/school";
    private static final String USER = "root";
    private static final String PASSWORD = "password";

    private Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }

    public void insertStudent(int id, String name, int marks) {
        String sql = "INSERT INTO students (id, name, marks) VALUES (?, ?, ?)";

        try (Connection connection = getConnection();
             PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setInt(1, id);
            statement.setString(2, name);
            statement.setInt(3, marks);
            statement.executeUpdate();
            System.out.println("Student inserted.");
        } catch (SQLException ex) {
            System.out.println("Insert failed: " + ex.getMessage());
        }
    }

    public void updateStudentMarks(int id, int marks) {
        String sql = "UPDATE students SET marks = ? WHERE id = ?";

        try (Connection connection = getConnection();
             PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setInt(1, marks);
            statement.setInt(2, id);
            statement.executeUpdate();
            System.out.println("Student updated.");
        } catch (SQLException ex) {
            System.out.println("Update failed: " + ex.getMessage());
        }
    }

    public static void main(String[] args) {
        StudentDAO dao = new StudentDAO();
        dao.insertStudent(1, "Ananya", 88);
        dao.updateStudentMarks(1, 92);
    }
}
