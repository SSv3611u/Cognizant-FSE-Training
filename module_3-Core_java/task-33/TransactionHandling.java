import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TransactionHandling {
    private static final String URL = "jdbc:mysql://localhost:3306/bank";
    private static final String USER = "root";
    private static final String PASSWORD = "password";

    private static void transferMoney(int fromAccount, int toAccount, double amount) {
        String debitSql = "UPDATE accounts SET balance = balance - ? WHERE account_id = ?";
        String creditSql = "UPDATE accounts SET balance = balance + ? WHERE account_id = ?";

        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD)) {
            connection.setAutoCommit(false);

            try (PreparedStatement debit = connection.prepareStatement(debitSql);
                 PreparedStatement credit = connection.prepareStatement(creditSql)) {
                debit.setDouble(1, amount);
                debit.setInt(2, fromAccount);
                debit.executeUpdate();

                credit.setDouble(1, amount);
                credit.setInt(2, toAccount);
                credit.executeUpdate();

                connection.commit();
                System.out.println("Transfer completed.");
            } catch (SQLException ex) {
                connection.rollback();
                System.out.println("Transfer rolled back: " + ex.getMessage());
            }
        } catch (SQLException ex) {
            System.out.println("Connection failed: " + ex.getMessage());
        }
    }

    public static void main(String[] args) {
        transferMoney(101, 102, 500.00);
    }
}
