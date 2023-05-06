import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int b, sum = 0, cnt = 1;
        int a = sc.nextInt();


        while (a != 0) {
            b = a % 3;
            sum = sum * 10 + b;
            if (sum == 0 && b == 0) {
                cnt = cnt * 10;
            }
            a = a / 3;

        }

        int temp = sum * cnt;

        while (temp != 0) {
            System.out.print(temp % 10);
            temp /= 10;
        }


    }

}