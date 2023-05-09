package lesson5;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        User user = new User();

        user.setName(sc.next());
        user.setSurname(sc.next());
        user.setAge(sc.nextInt());
        user.print();


    }
}
