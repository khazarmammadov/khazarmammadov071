package lesson29;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class deleteTable {
    public void delete() {
        Scanner sc = new Scanner(System.in);
        ConnectionJDBc jdBc = new ConnectionJDBc();

        try {
            PreparedStatement pst = jdBc.connection.prepareStatement("delete from students where id = ?");

            System.out.print("ID: ");
            pst.setInt(1, sc.nextInt());

            pst.executeUpdate();
        } catch (SQLException e) {
            System.out.println("fail " + e);
        }
    }
}
