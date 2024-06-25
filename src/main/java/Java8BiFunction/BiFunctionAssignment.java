package Java8BiFunction;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;

public class BiFunctionAssignment {
    public static void main(String[] args) {
        // Task 1: Create a Product
        BiFunction<String, Double, Product> createProduct = (name, price) -> new Product(name, price, "defaultCategory", "defaultGrade");

        // Example usage of Task 1:
        Product product1 = createProduct.apply("Laptop", 999.99);
        System.out.println("Product created: " + product1.getName() + " - " + product1.getPrice());

        // Task 2: Calculate the cost of products
        BiFunction<Product, Integer, Double> calculateCost = (product, quantity) -> product.getPrice() * quantity;

        // Example usage of Task 2:
        int quantity = 5;
        double totalCost = calculateCost.apply(product1, quantity);
        System.out.println("Total cost for " + quantity + " " + product1.getName() + "(s): " + totalCost);

        // Task 3: Calculate the cost of the cart
        // Example cart
        Map<Product, Integer> cart = new HashMap<>();
        cart.put(new Product("Laptop", 999.99, "Electronics", "A"), 2);
        cart.put(new Product("Smartphone", 499.99, "Electronics", "B"), 3);

        double totalCartCost = cart.entrySet().stream()
                .mapToDouble(entry -> calculateCost.apply(entry.getKey(), entry.getValue()))
                .sum();

        System.out.println("Total cost of the cart: " + totalCartCost);
    }
}
