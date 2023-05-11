package lesson6;

public class RectangleTest {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(3,4);
        Rectangle rectangle1 = new Rectangle(5);

        System.out.println(rectangle.getHeight() + " " + rectangle.getWidth());
        System.out.println(rectangle1.getHeight() + " " + rectangle1.getWidth());
    }
}
