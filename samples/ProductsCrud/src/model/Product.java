package model;

public class Product {
    // atributos - tem
    public String name;
    public double price;
    public int quantity;
    public String description;

    // construtor
    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    // metodos - faz
    public double calculateValueInStock() {
        return price * quantity;
    }
}