package PreparedStatementExample;
import java.sql.*;
public class PreparedStatementExample {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    String url = "jdbc:mysql://localhost:3306/student_db";
        String username = "root";
        String password = "Sneha@2002";
        try {
        Connection con = DriverManager.getConnection(url, username, password);

        // Create a prepared statement
        String query = "INSERT INTO klustudents (sname, sid) VALUES (?, ?)";
        PreparedStatement pstmt = con.prepareStatement(query);

        // Set the parameters
        pstmt.setString(1, "John");
        pstmt.setInt(2, 20);

        // Execute the prepared statement
        int rowsAffected = pstmt.executeUpdate();

        System.out.println("Rows affected: " + rowsAffected);

        // Close the resources
        pstmt.close();
        con.close();
    } catch (SQLException e) {
        System.out.println("Error: " + e.getMessage());
    }
  }
}