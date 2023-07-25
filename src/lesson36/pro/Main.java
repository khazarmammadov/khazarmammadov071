package lesson36.pro;

public class Main {
    public static void main(String[] args) {
        Product originalProduct = new Product(1, "Laptop", 1000.0);

        Product copyProduct = originalProduct.clone();

        copyProduct.setId(2);
        copyProduct.setName("Desktop");
        copyProduct.setPrice(800.0);

        System.out.println("Original: " + originalProduct);
        System.out.println("Copy: " + copyProduct);
    }
}
