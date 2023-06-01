package lesson15;

public class SumLam {
    public static void main(String[] args) {
        Sum sum = (int a,int b) -> System.out.println(a+b);
        sum.sum(2,4);
    }
}

interface Sum {
    void sum(int num1,int num2);
}
