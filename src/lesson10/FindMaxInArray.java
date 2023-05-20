package lesson10;

public class FindMaxInArray {
    static int maxNum = 0;

    public static int max(int[] arr, int index) {
        if (index <= 0) {
            return maxNum;
        } else if (maxNum < arr[index]) {
            maxNum = arr[index];
        }
        return max(arr, index - 1);
    }

    public static void main(String[] args) {
        int[] arr = {4, 15, 6, 2, 9, 3};
        System.out.println(max(arr, arr.length - 1));
    }


}
