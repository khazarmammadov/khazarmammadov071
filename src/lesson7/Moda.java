package lesson7;

public class Moda {
    public static void main(String[] args) {
        int[] arr = {1,1,2,3,5,5,5,5,2,3,5,7,0,8,7,5,3,4,5,6,5,7,89,9,94,4,5,5,6,7,8,8,54,34,3,32,2,32,49};
        int max = 0,cnt = 0,element = 0;

        for (int k : arr) {
            for (int i : arr) {
                if (k == i) {
                    cnt++;
                }
            }
            if (cnt > max) {
                max = cnt;
                element = k;
            }
            cnt = 0;
        }

        System.out.println(element);
    }
}
