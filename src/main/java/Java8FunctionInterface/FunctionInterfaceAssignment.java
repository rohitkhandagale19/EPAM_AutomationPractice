package Java8FunctionInterface;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FunctionInterfaceAssignment {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product("Laptop", 1500, "electronics", "A"));
        products.add(new Product("Phone", 800, "electronics", "B"));
        products.add(new Product("Book", 50, "education", "A"));
        products.add(new Product("Shoes", 120, "fashion", "C"));
        products.add(new Product("TV", 300, "electronics", "A"));
        products.add(new Product("Headphones", 150, "electronics", "B"));

        // 1. Calculate total cost of all products
        double totalCost = calculateTotalCost(products, p -> p.getPrice());
        System.out.println("Total cost of all products: " + totalCost);

        // 2. Calculate cost of products with price > 1000
        double costGreaterThan1000 = calculateTotalCost(products, p -> p.getPrice() > 1000 ? p.getPrice() : 0);
        System.out.println("Total cost of products with price > 1000: " + costGreaterThan1000);

        // 3. Calculate cost of all electronic products
        double electronicProductsCost = calculateTotalCost(products, p -> "electronics".equalsIgnoreCase(p.getCategory()) ? p.getPrice() : 0);
        System.out.println("Total cost of electronic products: " + electronicProductsCost);

        // 4. Get products with price > 1000 and in electronics category
        List<Product> expensiveElectronics = getFilteredProducts(products, p -> p.getPrice() > 1000 && "electronics".equalsIgnoreCase(p.getCategory()));
        System.out.println("Products with price > 1000 and in electronics category: " + expensiveElectronics);
    }

    // Function to calculate total cost based on a given criterion
    private static double calculateTotalCost(List<Product> products, Function<Product, Double> costFunction) {
        return products.stream()
                .mapToDouble(costFunction::apply)
                .sum();
    }

    // Function to get products based on a given criterion
    private static List<Product> getFilteredProducts(List<Product> products, Function<Product, Boolean> filterFunction) {
        return products.stream()
                .filter(filterFunction::apply)
                .collect(Collectors.toList());
    }
}
