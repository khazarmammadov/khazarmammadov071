package lesson16;

import java.util.stream.IntStream;
public class IntStream1 {
    public static void main(String[] args) {
        IntStream.rangeClosed(1, 100).filter(num -> num % 2 == 0).forEach(num -> System.out.print(num + " "));
    }

}
