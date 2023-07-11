package lesson29;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Select {
    Scanner sc = new Scanner(System.in);
    ConnectionJDBc jdBc = new ConnectionJDBc();

    Statement st;

    {
        try {
            st = jdBc.connection.createStatement();
            ResultSet str = st.executeQuery("select * from students");

            while (str.next()) {
                System.out.println(str.getInt("id") + str.getString("name") + str.getString("surname" + str.getString("profession")));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
