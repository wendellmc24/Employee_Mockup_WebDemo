package employeeDBAL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class connection {

    String strConnectionDB = "jdbc:sqlite:D:/SQLite/Employee Mockup WebDemo.s3db";
    Connection conn = null;

    public connection() {
        try {
            Class.forName("org.sqlite.JDBC");
            conn = DriverManager.getConnection(strConnectionDB);
            System.out.println("DB Connection established");
        } catch (Exception e) {
            System.out.println("Connection error: " + e);
        }
    }

    public int executeQuerySQL(String strQuerySQL) {
        try {
            PreparedStatement pstm = conn.prepareStatement(strQuerySQL);
            pstm.execute();
            System.out.println("Query executed");
            return 1;
        } catch (SQLException e) {
            System.out.println(e);
            return 0;
        }
    }

    public ResultSet getRegisters(String strQuerySQL) {
        try {
            PreparedStatement pstm = conn.prepareStatement(strQuerySQL);
            ResultSet response = pstm.executeQuery();
            System.out.println("We got a response!");
            return response;
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }
}
