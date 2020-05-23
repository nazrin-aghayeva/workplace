package sqlLesson2.jdbc;

import java.sql.*;

public class SqlApp2 {
  private final static String URL = "jdbc:postgresql://localhost:5432/sql-lesson";
  private final static String NAME = "postgres";
  private final static String PWD = "secret";

  public static void main(String[] args) throws SQLException {
    Connection conn = DriverManager.getConnection(URL, NAME, PWD);

    String username = "Jim";
    String password = "123";

    // approach #1
    String loginSQL = "SELECT * from users WHERE name = ?";
    PreparedStatement stmt2 = conn.prepareStatement(loginSQL);
    stmt2.setString(1, username);
    ResultSet rset2 = stmt2.executeQuery();
    while (rset2.next()) {
//      byte[] mp4 = rset2.getBytes("mp4");
//      InputStream is = new ByteArrayInputStream(mp4);
//      os = resp.getOutputStream();
//      Files.copy(is, os);
      System.out.printf("%d : %s : %s\n",
          rset2.getInt("id"),
          rset2.getString("name"),
          rset2.getString("password")
      );
      // if (...)
    }

    // approach #1
    String loginS2QL = "SELECT id from users WHERE name = ? AND password = ?";
  }
}
