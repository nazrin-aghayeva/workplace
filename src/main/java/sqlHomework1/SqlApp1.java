package sqlHomework1;

import java.sql.*;

public class SqlApp1 {
  private final static String URL = "jdbc:postgresql://localhost:5432/sql-lesson";
  private final static String NAME = "postgres";
  private final static String PWD = "secret";

  public static void main(String[] args) throws SQLException {
    Connection conn = DriverManager.getConnection(URL, NAME, PWD);
    String SQL = "SELECT * FROM users";
    PreparedStatement stmt = conn.prepareStatement(SQL);
    ResultSet rset = stmt.executeQuery();
    while (rset.next()) {
      int id = rset.getInt("id");
      int age = rset.getInt("age");
      String name = rset.getString("name");
      System.out.printf("%5d : %5d : %20s\n", id, age, name);
    }
  }
}
