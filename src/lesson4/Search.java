package lesson4;
import java.util.Arrays;
import java.util.Scanner;
public class Search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {4, 7, 9, 10 ,23};
        int[] newArr = new int[arr.length + 1];
        int temp = 0;
        int num = sc.nextInt();





        for (int i = 0; i < arr.length-1; i++) {
            if (num > arr[i] && num < arr[i + 1]) {
                temp = i + 1;
                newArr[i] = arr[i];
                newArr[temp] = num;
                break;
            }
            newArr[i] = arr[i];
        }
        if (temp == 0) {
            return;
        }
        for (int i = temp; i < arr.length; i++) {
            newArr[i+1] = arr[i];

        }
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(newArr));

    }
}
