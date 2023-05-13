package lesson7;

import java.util.Arrays;

public class FirstLetter {
    public static void main(String[] args) {
        String text0 = "Predecessors of the modern PDA include the Psion Organiser and the Sharp Wizard. These early devices, which were intended to be portable computers, came out in the mid- to late 1980s. They included small keyboards for input, a small display, and basic features such as an alarm clock, calendar, telephone pad and calculator. Support for specialized software such as games and spreadsheets was also included. The Psion Organiser II, released in 1986, was especially popular and more than half a million were sold.";
        String text = " " + text0;
        char[] arr = text.toCharArray();

        System.out.println((char) ((int) arr[1] - 32));

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == ' ') {
                if (arr[i + 1] > 96) {
                    arr[i + 1] = (char) ((int) arr[i + 1] - 32);
                }
            }

        }
        System.out.println(arr);
    }
}
