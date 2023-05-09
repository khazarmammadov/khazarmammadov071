package lesson4;

public class Palindrom {
    public static void main(String[] args) {

        String arr = "aabccbaa";
        char[] arr2 = arr.toCharArray();

        for (int i = 0,j = arr2.length-1; i < arr.length()/2 ;i++,j--) {
            if (!(arr2[i] == arr2[j])) {
                System.out.println("not");
                return;
            }

        }
        System.out.println("Yes Palindrom");
    }
}
