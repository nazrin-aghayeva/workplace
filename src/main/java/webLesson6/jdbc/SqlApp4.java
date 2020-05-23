package webLesson6.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SqlApp4 {
  private final static String URL = "jdbc:postgresql://localhost:5432/sql-lesson";
  private final static String NAME = "postgres";
  private final static String PWD = "secret";

  public static void main(String[] args) throws SQLException {
    Connection conn = DriverManager.getConnection(URL, NAME, PWD);

    conn.setAutoCommit(false);
    try {
      //
      // update x set salary = 120 where id = 1
      // update x set salary = 80 where id = 2
      //
      //
      conn.commit();
    } catch (RuntimeException x) {
      //
      //
      conn.rollback();
    }

  }
}
