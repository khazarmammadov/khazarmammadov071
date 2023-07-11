package lesson29;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class insertTable {
    public void insert() {
        Scanner sc = new Scanner(System.in);
        ConnectionJDBc jdBc = new ConnectionJDBc();

        try {
            PreparedStatement pst = jdBc.connection.prepareStatement("insert into students values (? , ? ,? , ?)");
            System.out.print("ID: ");
            pst.setInt(1, sc.nextInt());
            System.out.print("Name: ");
            pst.setString(2, sc.next());
            System.out.print("Surname: ");
            pst.setString(3, sc.next());
            System.out.print("Profession: ");
            pst.setString(4, sc.next());
            pst.executeUpdate();
        } catch (SQLException e) {
            System.out.println("fail " + e);
        }
    }
}

