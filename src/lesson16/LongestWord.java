package lesson16;

import java.util.Arrays;

public class LongestWord {
    public static void main(String[] args) {
        String txt = "ecstvy vfb uvce gni hbvd ces ctxv cb";

        String longest = Arrays.stream(txt.split(" ")).max((a,b) -> a.length() - b.length()).orElse("");
        System.out.println(longest);
    }
}
