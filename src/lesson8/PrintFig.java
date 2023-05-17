package lesson8;

import java.util.Scanner;
public class PrintFig {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int lengthUp = length;
        int cnt = 0, cntUp = 1;
        String sb = "* ";
        StringBuilder sp = new StringBuilder();
        StringBuilder strB = new StringBuilder("*");

        while (cntUp != lengthUp) {
            int temp = lengthUp;
            while (cntUp < lengthUp) {
                System.out.print(" ");
                lengthUp--;
            }
            lengthUp = temp;
            System.out.print(strB + "\n");
            strB.append(" *");
            lengthUp--;
        }
        while (cnt != length - 1) {
            int temp = cnt;
            while (cnt < length) {
                System.out.print(sb);
                cnt++;
            }
            cnt = temp;
            System.out.print("\n" + sp);
            sp.append(" ");
            sb = " *";
            cnt++;
        }
        System.out.println(" *");


    }

}
