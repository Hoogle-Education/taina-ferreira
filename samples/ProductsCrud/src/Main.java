import model.Product;

public class Main {
    public static void main(String[] args) {
        Product tshirt = new Product("T-Shirt", 45.0, 10);

//         tshirt.name = "T-Shirt";
//        tshirt.price = 45.0;
//        tshirt.quantity = 10;
        tshirt.description = "Blue T-Shirt";

        System.out.println(tshirt.calculateValueInStock());

        tshirt.price = 55.0;
        System.out.println(tshirt.calculateValueInStock());
    }
}