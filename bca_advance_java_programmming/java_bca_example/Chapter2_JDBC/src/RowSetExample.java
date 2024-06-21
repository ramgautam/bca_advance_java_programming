import javax.sql.rowset.CachedRowSet;
import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetProvider;
import java.sql.SQLException;

public class RowSetExample {
    public static void main(String[] args) {
        String jdbcUrl = "jdbc:mysql://localhost:3306/College";
        String username = "root";
        String password = "mysql";

        JdbcRowSet rowSet = null;

        try {
            // Creating a JdbcRowSet instance
            rowSet = RowSetProvider.newFactory().createJdbcRowSet();

            // Setting the JDBC URL, username, and password
            rowSet.setUrl(jdbcUrl);
            rowSet.setUsername(username);
            rowSet.setPassword(password);

            // Setting the SQL query
            rowSet.setCommand("SELECT * FROM teacher");
            rowSet.execute();

            // Using absolute to move the cursor to the third row
            if (rowSet.absolute(2)) {
                System.out.println("Third row ID: " + rowSet.getInt("teacher_id"));
                System.out.println("Third row Data: " + rowSet.getString("teacher_name"));
            }

            // Using relative to move the cursor forward by one row
            if (rowSet.relative(1)) {
                System.out.println("Fourth row ID: " + rowSet.getInt("teacher_id"));
                System.out.println("Fourth row Data: " + rowSet.getString("teacher_name"));
            }

            // Using relative to move the cursor backward by two rows
            if (rowSet.relative(-2)) {
                System.out.println("Second row ID: " + rowSet.getInt("teacher_id"));
                System.out.println("Second row Data: " + rowSet.getString("teacher_name"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // Closing the RowSet
            if (rowSet != null) {
                try {
                    rowSet.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
