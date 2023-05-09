package lesson5;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int rr1 = random.nextInt(20);


        while (true) {
            System.out.print("Enter the Number: ");
            int num = sc.nextInt();
            if (num > rr1) {
                System.out.println("Your Number greater than");
            } else if (num < rr1) {
                System.out.println("Your Number less than");
            } else if (num == rr1) {
                System.out.println("Yepp!!");
                return;
            }
        }
    }
}
