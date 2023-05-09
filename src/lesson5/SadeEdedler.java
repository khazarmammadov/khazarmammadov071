package lesson5;

import java.util.Scanner;

public class SadeEdedler {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Limit: ");
        int num = sc.nextInt();
        int cnt = 0;


        for (int i = 1; i < num; i++) {
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if ((i % j) == 0) {
                    cnt++;
                }
            }
            if (cnt == 0) {
                System.out.print(i + ",");
            }
            cnt = 0;

        }
    }
}

