package lesson31;
import java.math.BigInteger;
import java.util.Scanner;

public class FactorialCalculator implements Runnable {
    private final int number;
    private BigInteger result;

    public FactorialCalculator(int number) {
        this.number = number;
    }

    public BigInteger getResult() {
        return result;
    }

    @Override
    public void run() {
        result = calculateFactorial(number);
    }

    private BigInteger calculateFactorial(int number) {
        BigInteger factorial = BigInteger.ONE;

        for (int i = 1; i <= number; i++) {
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }

        return factorial;
    }

    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int threadCount = sc.nextInt();

        FactorialCalculator[] calculators = new FactorialCalculator[threadCount];
        Thread[] threads = new Thread[threadCount];

        for (int i = 0; i < threadCount; i++) {
            calculators[i] = new FactorialCalculator(number);
            threads[i] = new Thread(calculators[i]);
            threads[i].start();
        }


        for (Thread thread : threads) {
            thread.join();
        }

        BigInteger totalResult = BigInteger.ONE;
        for (FactorialCalculator calculator : calculators) {
            totalResult = totalResult.multiply(calculator.getResult());
        }

        System.out.println(number + "! = " + totalResult);
    }
}
