import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder ternary = new StringBuilder();

        int decimal = sc.nextInt();

        while (decimal != 0) {
            ternary.append(decimal % 3);
            decimal /= 3;
        }
        System.out.println(ternary.reverse());

    }

}