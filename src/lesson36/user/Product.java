package lesson36.user;

import java.util.List;

class Product {
    private int productId;
    private String name;
    private double price;

    public Product(int productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }
}

class Bucket {
    private int bucketId;
    private List<Product> products;

    public Bucket(int bucketId, List<Product> products) {
        this.bucketId = bucketId;
        this.products = products;
    }
}

class User {
    private int userId;
    private String name;
    private int age;
    private String surname;
    private Bucket bucket;

    public User(int userId, String name, int age, String surname, Bucket bucket) {
        this.userId = userId;
        this.name = name;
        this.age = age;
        this.surname = surname;
        this.bucket = bucket;
    }
}
