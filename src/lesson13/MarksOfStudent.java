package lesson13;

import java.util.Scanner;

enum Marks {
    A,
    B,
    C,
    D,
    E,
    F
}

public class MarksOfStudent {
    public static void valuate(int point) {

        switch (point / 10) {
            case 10, 9 -> System.out.println(Marks.A);
            case 8 -> System.out.println(Marks.B);
            case 7 -> System.out.println(Marks.C);
            case 6 -> System.out.println(Marks.D);
            case 5 -> System.out.println(Marks.E);
            default -> System.out.println(Marks.F);
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        valuate(sc.nextInt());


    }
}
