package Java8ConsumerSupplier;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerAssignment {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product("Laptop", 1500, "electronics", "A"));
        products.add(new Product("Phone", 800, "electronics", "B"));
        products.add(new Product("Book", 50, "education", "A"));
        products.add(new Product("Shoes", 120, "fashion", "C"));
        products.add(new Product("TV", 300, "electronics", "A"));
        products.add(new Product("Headphones", 150, "electronics", "B"));
        products.add(new Product("Luxury Car", 3500, "automobile", "A"));

        // 1. Print product based on print parameter
        Consumer<Product> printProduct = p -> {
            String printParameter = "file"; // Change to "file" to log to file
            if ("file".equalsIgnoreCase(printParameter)) {

                String filePath = System.getProperty("user.dir") + "\\products.txt";
                try (PrintWriter out = new PrintWriter(new FileWriter(filePath, true))) {
                    out.println(p);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            } else {
                System.out.println(p);
            }
        };

        // Print each product
        products.forEach(printProduct);

        // 2. Update grade to 'Premium' if price > 1000
        Consumer<Product> updateGrade = p -> {
            if (p.getPrice() > 1000) {
                p.setGrade("Premium");
            }
        };

        // Update grade and print each product
        products.forEach(updateGrade);
        products.forEach(printProduct); // Print using the consumer to handle console/file

        // 3. Update name by suffixing '*' if price > 3000
        Consumer<Product> updateName = p -> {
            if (p.getPrice() > 3000) {
                p.setName(p.getName() + "*");
            }
        };

        // Update name and print each product
        products.forEach(updateName);
        products.forEach(printProduct); // Print using the consumer to handle console/file

        // 4. Print Premium grade products with name suffixed with '*'
        products.stream()
                .filter(p -> "Premium".equals(p.getGrade()) && p.getName().endsWith("*"))
                .forEach(printProduct); // Print using the consumer to handle console/file
    }
}
