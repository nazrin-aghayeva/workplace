package sqlLesson3.jdbc;

import java.sql.*;

public class SqlApp2 {
  private final static String URL = "jdbc:postgresql://localhost:5432/sql-lesson";
  private final static String NAME = "postgres";
  private final static String PWD = "secret";

  public static void main(String[] args) {

    // try-with-resources syntax, connection will be closed automatically
    try (Connection conn = DriverManager.getConnection(URL, NAME, PWD)) {
      String username = "Jim";
      String loginSQL = "SELECT * from users WHERE name = ?";
      PreparedStatement stmt2 = conn.prepareStatement(loginSQL);
      stmt2.setString(1, username);
      ResultSet rset2 = stmt2.executeQuery();
    } catch (SQLException x) {
      // exception needs to be caught here
      throw new RuntimeException("SQL", x);
    }

  }
}
