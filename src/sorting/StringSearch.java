package sorting;

public class StringSearch {
    public static void main(String[] args) {


        int cnt = 0;
        String str = "Salamlar";


        char[] arr = str.toCharArray();

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    cnt++;
                }
            }
            System.out.println(arr[i] + " --> " + cnt);
            cnt = 0;

        }



    }
}
