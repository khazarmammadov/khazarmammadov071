package lesson22TaskDay;

import java.util.Scanner;

public class SwapNum {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num = sc.next();
        char[] arr = num.toCharArray();

        char temp = arr[0];
        arr[0]=arr[arr.length-1];
        arr[arr.length-1] = temp;

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }

    }
}
