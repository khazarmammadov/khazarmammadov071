package lesson10;

public class Recursion {

    static int aRecursion(int i) {
        if (i == 1) {
            return 0;
        }
        return i+aRecursion(i-1);
    }
    public static void main(String[] args) {

        System.out.println(aRecursion(3));
    }
}
