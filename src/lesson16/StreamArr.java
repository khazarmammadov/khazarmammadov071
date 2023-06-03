package lesson16;

import java.util.Arrays;
import java.util.stream.Collectors;

public class StreamArr {
    public static void main(String[] args) {
       Integer[] arr = {1,2,3,4,5,6};

       Integer[] revArr = Arrays.stream(arr).collect(Collectors.toList()).stream().sorted((a,b) -> -1).toArray(Integer[]::new);
        System.out.println(Arrays.toString(revArr));


    }
}
