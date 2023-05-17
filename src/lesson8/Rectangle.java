package lesson8;

public class Rectangle {
    double side1;
    double side2;


    double getPerimeter(double side1, double side2) {
        return side1 + side2 + Math.pow((side1*side1)+side2*side2,1.0/2);
    }

    double getArea(double side1, double side2) {
        return 1.0/2 * side1*side2;
    }


}
