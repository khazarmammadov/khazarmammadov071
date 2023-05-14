package lesson7;

import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int a = sc.nextInt();

        while (a != 0) {
            int b = a % 2;
            a /= 2;
            sb.append(b);
        }

        System.out.println(sb.reverse());
    }
}
