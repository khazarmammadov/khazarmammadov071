package lesson24TaskDay;

import java.util.HashMap;
import java.util.Scanner;

public class Dictionary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, String> map = new HashMap<>();
        map.put("word", "Soz");
        map.put("apple", "Alma");
        map.put("yellow", "Sari");
        map.put("blue", "Mavi");
        map.put("tree", "Agac");
        map.put("oak", "Sam agaci");
        map.put("grass", "Ot");
        map.put("string", "Kendir");


        System.out.println("For exit: exit");
        while (true) {
            String str = sc.next();
            if (str.equals("exit")) {
                System.out.println("Exit...");
                break;
            }
            System.out.println(map.get(str.toLowerCase()));
        }

    }
}
