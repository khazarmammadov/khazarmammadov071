package lesson29;

import java.sql.*;

public class ConnectionJDBc {
    Connection connection;
    String url = "jdbc:postgresql://localhost:5432/postgres";
    String username = "newuser";
    String password = "password";


    {
        try {
            connection = DriverManager.getConnection(url, username, password);
            System.out.println("Success>>>>>>");

        } catch (SQLException e) {
            System.out.println("Fail<<<<<<" + e);
        }
    }
}
