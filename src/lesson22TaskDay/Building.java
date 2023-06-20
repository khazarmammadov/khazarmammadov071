package lesson22TaskDay;

import java.util.Scanner;

public class Building {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        if (n%2 == 0 && m%2 == 0) {
            System.out.println("1");
        }
        if (n%2 == 1 && m%2 == 1) {
            System.out.println("1");
        }
        if (n%2 == 1 && m%2 == 0) {
            System.out.println("0");
        }
        if (n%2 == 0 && m%2 == 1) {
            System.out.println("0");
        }
    }
}
