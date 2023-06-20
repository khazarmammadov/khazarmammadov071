package lesson23TaskDay;

public class Main {
    public static void main(String[] args) {
        Engine engine = new Engine(200);
        Car car = new Car("Toyota", engine);
        System.out.println(car.getBrand() + " " + car.getEngine().getHorsePower());
    }
}
