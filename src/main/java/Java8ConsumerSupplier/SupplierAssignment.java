package Java8ConsumerSupplier;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class SupplierAssignment {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product("Laptop", 1500, "electronics", "A"));
        products.add(new Product("Phone", 800, "electronics", "B"));
        products.add(new Product("Book", 50, "education", "A"));
        products.add(new Product("Shoes", 120, "fashion", "C"));
        products.add(new Product("TV", 300, "electronics", "A"));
        products.add(new Product("Headphones", 150, "electronics", "B"));
        products.add(new Product("Luxury Car", 3500, "automobile", "A"));

        // Supplier to produce a random product
        Supplier<Product> randomProductSupplier = () -> {
            Random random = new Random();
            int index = random.nextInt(products.size());
            return products.get(index);
        };

        // Supplier to produce a random OTP
        Supplier<String> otpSupplier = () -> {
            Random random = new Random();
            int otp = 100000 + random.nextInt(900000);
            return String.valueOf(otp);
        };

        // Example usage of the suppliers with the consumer
        System.out.println("Random Product: " + randomProductSupplier.get());
        System.out.println("Random OTP: " + otpSupplier.get());
    }
}
