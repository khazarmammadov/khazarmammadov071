package lesson9;

import java.util.Scanner;
public class FinalKeyWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int temp = num;

        if (num > 20) {
            num += 10;
        }else {
            num = num;
        }
        if (num == temp) {
            System.out.println(true);
        } else {
            throw new RuntimeException();
        }
    }
}
