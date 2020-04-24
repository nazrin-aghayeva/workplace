package sqlHomework1;

import java.sql.*;

public class SqlApp {
    private static final String URL = "jdbc:postgresql://localhost:5432/nazrin";
    private static final String NAME = "nazrin";
    private static final String PASSWORD = "secret";


    public static void main(String[] args) throws SQLException {
        Connection conn= DriverManager.getConnection(URL,NAME,PASSWORD);
        String SQL= "SELECT * FROM students";
        PreparedStatement stmt=conn.prepareStatement(SQL);
        ResultSet rset= stmt.executeQuery();
        while(rset.next()){
            int id= rset.getInt("id");
            String name= rset.getString("name");
            String surname= rset.getString("surname");
            System.out.printf("%5d : %5s : %10s\n", id, name, surname);
        }
    }

}