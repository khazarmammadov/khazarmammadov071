package lesson12;


import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class RomaNumber {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int number = sc.nextInt();
            String romanNumeral = convertToRoman(number);
            System.out.println("Roman Numeral: " + romanNumeral);
        }

        public static String convertToRoman(int number) {
            Map<Integer, String> romanSymbols = new LinkedHashMap<>();
            romanSymbols.put(1000, "M");
            romanSymbols.put(900, "CM");
            romanSymbols.put(500, "D");
            romanSymbols.put(400, "CD");
            romanSymbols.put(100, "C");
            romanSymbols.put(90, "XC");
            romanSymbols.put(50, "L");
            romanSymbols.put(40, "XL");
            romanSymbols.put(10, "X");
            romanSymbols.put(9, "IX");
            romanSymbols.put(5, "V");
            romanSymbols.put(4, "IV");
            romanSymbols.put(1, "I");

            StringBuilder romanNumeral = new StringBuilder();

            for (Map.Entry<Integer, String> entry : romanSymbols.entrySet()) {
                int arabicValue = entry.getKey();
                String romanSymbol = entry.getValue();

                while (number >= arabicValue) {
                    romanNumeral.append(romanSymbol);
                    number -= arabicValue;
                }
            }

            return romanNumeral.toString();
        }
    }






