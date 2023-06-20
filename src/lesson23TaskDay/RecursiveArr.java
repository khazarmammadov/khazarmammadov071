package lesson23TaskDay;

public class RecursiveArr {
    public static void revArr(int[] arr,int index) {
        if (index < 0) {
            return;
        }
        System.out.print(arr[index] + " ");
        revArr(arr,index-1);
    }

    public static void main(String[] args) {
        int[] arr = {4,7,1,9,3,7,0,1,5};
        revArr(arr, arr.length-1);
    }
}
