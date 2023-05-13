package lesson7;

import java.time.LocalDate;
import java.util.Scanner;

public class Subscription {

    public static LocalDate getSubscription(int amount) {
        LocalDate localDate = LocalDate.parse("2023-05-13");
        if (amount == 5) {
            return localDate.plusWeeks(1);
        }if (amount == 15) {
            return localDate.plusMonths(1);
        }if (amount == 25) {
            return localDate.plusMonths(2);
        }if (amount == 60) {
            return localDate.plusYears(1);
        }
        return localDate;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int amount = sc.nextInt();

        System.out.println(getSubscription(amount));

    }
}
