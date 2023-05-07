package sorting;

public class Fibonacci {
    public static void main(String[] args) {

        int[] arr = {5, 6, 11, 17, 28};

        for (int i = 0; i < arr.length - 2; i++) {
            if ((arr[i] + arr[i + 1]) == arr[i + 2]) {

            } else {
                System.out.println("Not");
                return;
            }
        }

        System.out.println("Yes");
    }
}
