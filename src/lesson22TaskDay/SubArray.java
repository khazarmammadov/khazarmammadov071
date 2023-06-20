package lesson22TaskDay;

public class SubArray {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 2, 5, 7, 2, 4, 6, 8};
        int end = 0;
        int cnt = 1;
        int max = 0;

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > numbers[i - 1]) {
                cnt++;
            } else {
                if (cnt > max) {
                    max = cnt;
                    end = i - 1;
                }
                cnt = 1;
            }

            if (cnt > max) {
                max = cnt;
                end = numbers.length - 1;
            }


        }
        for (int i = end-max+1; i <= end; i++) {
            System.out.print(numbers[i] + ",");
        }


    }
}
