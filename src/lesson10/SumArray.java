package lesson10;

public class SumArray {
    public static int sumArray(int[] arr,int index) {

        if (index <= 0) {
            return 0;
        }
        return (sumArray(arr,index-1)+arr[index-1]);
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        System.out.println(sumArray(arr,arr.length));
    }
}
