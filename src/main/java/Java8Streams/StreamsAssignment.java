package Java8Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsAssignment {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product("Laptop", 1500, "Electronics", "A"));
        products.add(new Product("Phone", 800, "Electronics", "B"));
        products.add(new Product("Desk", 200, "Furniture", "A"));
        products.add(new Product("TV", 1200, "Electronics", "A"));
        products.add(new Product("Chair", 150, "Furniture", "B"));

        // Task 1: Get all products with price > 1000
        List<Product> expensiveProducts = products.stream()
                .filter(product -> product.getPrice() > 1000)
                .collect(Collectors.toList());
        System.out.println("Products with price > 1000:");
        expensiveProducts.forEach(product -> System.out.println(product.getName()));

        // Task 2: Get all products from electronics category
        List<Product> electronicsProducts = products.stream()
                .filter(product -> "Electronics".equalsIgnoreCase(product.getCategory()))
                .collect(Collectors.toList());
        System.out.println("\nProducts from Electronics category:");
        electronicsProducts.forEach(product -> System.out.println(product.getName()));

        // Task 3: Get all products with price > 1000 and from electronics category. Change names to uppercase.
        List<Product> expensiveElectronicsProducts = products.stream()
                .filter(product -> product.getPrice() > 1000 && "Electronics".equalsIgnoreCase(product.getCategory()))
                .collect(Collectors.toList());
        expensiveElectronicsProducts.forEach(product -> product.setName(product.getName().toUpperCase()));
        System.out.println("\nProducts with price > 1000 from Electronics category with names in uppercase:");
        expensiveElectronicsProducts.forEach(product -> System.out.println(product.getName()));

        // Task 4: Calculate the count of all electronic products
        long electronicsCount = products.stream()
                .filter(product -> "Electronics".equalsIgnoreCase(product.getCategory()))
                .count();
        System.out.println("\nCount of Electronics products: " + electronicsCount);
    }
}