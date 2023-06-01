package lesson15;

public class FactLam {
    public static void main(String[] args) {
        Factorial factorial = (int a) -> {
            int product = 1;
            while (a!=0) {
            product*=a;
            a--;
            }
            return product;
        };
        System.out.println(factorial.factorial(5));
    }
}

interface Factorial {
    int factorial(int num);
}
