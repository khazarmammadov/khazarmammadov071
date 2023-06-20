package lesson23TaskDay;

public class PolindromeStr {
    public static boolean check(char[] arr) {
        for (int i = 0,j= arr.length-1; i < arr.length/2; i++,j--) {
            if (!(arr[i] == arr[j])) {
                return false;
            }
        } return true;
    }
    public static void main(String[] args) {
        String str = "Provides classes and interfaces for obtaining kkrrkk reflective information about classes and objects. Reflection allows programmatic access to information about the fields, methods and constructors of loaded classes, and the use of reflected fields, methods, and constructors to operate on their underlying counterparts, within security restrictions almaamla";

        String[] arr = str.split(" ");

        for (int i = 0; i < arr.length; i++) {
            char[] newArr = arr[i].toCharArray();
            if (check(newArr)){
                System.out.println(arr[i]);
            }
        }
    }
}
