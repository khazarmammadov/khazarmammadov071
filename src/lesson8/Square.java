package lesson8;

public class Square extends AbsCls{
    public double sideLength;

    Square(double sideLength) {
        this.sideLength = sideLength;
    }


    @Override
    public double getPerimeter() {
        return 4*sideLength;
    }

    @Override
    public double getArea() {
        return sideLength*sideLength;
    }
}
