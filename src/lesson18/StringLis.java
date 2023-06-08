package lesson18;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StringLis {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("apple");
        strings.add("cow");
        strings.add("bee");
        strings.add("need");
        strings.add("app");

        List<String> filteredWords = strings.stream()
                .filter(word -> getDistinctLetterCount(word) >= 3)
                .sorted(Comparator.comparingInt(String::length).reversed())
                .limit(5)
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println(filteredWords);

    }
    private static int getDistinctLetterCount(String word) {
        return (int) word.chars().distinct().count();
    }
}
