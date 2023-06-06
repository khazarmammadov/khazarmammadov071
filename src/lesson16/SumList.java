package lesson16;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SumList {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(2,3,4,5);

        int sum = integerList.stream().mapToInt(Integer::intValue).reduce(0,(a,b) -> a+b);
        System.out.println(sum);
    }
}
