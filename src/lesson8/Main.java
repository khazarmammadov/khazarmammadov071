package lesson8;

import java.util.Scanner;

public abstract class Main {
    public static void main(String[] args) {
       Square sq = new Square(5);
        System.out.println(sq.getArea());
        System.out.println(sq.getPerimeter());
        Rectangle tr = new Rectangle();
        System.out.println(tr.getPerimeter(3,4));
        System.out.println(tr.getArea(3,4));


    }
}
