package lesson29;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class UpdateTable {
    public void update() {
        Scanner sc = new Scanner(System.in);
        ConnectionJDBc jdBc = new ConnectionJDBc();

        try {
            System.out.print("ID: ");
            PreparedStatement pst = jdBc.connection.prepareStatement("update students set id = ? where ID = 210147002");
            pst.setInt(1,sc.nextInt());
            pst.executeUpdate();

        } catch (SQLException e) {
            System.out.println("fail " + e);
        }
    }
}
