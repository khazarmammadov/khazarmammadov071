package lesson18;

import java.util.Map;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class RandomNum {
            public static void main(String[] args) {
                Random random = new Random();

                IntStream numbers = random.ints(100, 1, 101);

                Map<Integer, Long> numberCountMap = numbers.boxed()
                        .collect(Collectors.groupingBy(i -> i, Collectors.counting()));

                numberCountMap.forEach((number, count) ->
                        System.out.println(number + " number " + count + " times repeat."));
            }
        }


