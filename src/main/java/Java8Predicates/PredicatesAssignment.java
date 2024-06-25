package Java8Predicates;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PredicatesAssignment {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product("Laptop", 1500, "electronics", "A"));
        products.add(new Product("Phone", 800, "electronics", "B"));
        products.add(new Product("Book", 50, "education", "A"));
        products.add(new Product("Shoes", 120, "fashion", "C"));

        List<Response> responses = new ArrayList<>();
        responses.add(new Response("Success", 200, "JSON"));
        responses.add(new Response("Bad Request", 400, "JSON"));
        responses.add(new Response("Not Found", 404, "HTML"));
        responses.add(new Response("Unauthorized", 401, "JSON"));

        // 1. Price greater than 1000
        Predicate<Product> priceGreaterThan1000 = p -> p.getPrice() > 1000;
        printProducts(products, priceGreaterThan1000);

        // 2. Electronics category
        Predicate<Product> isElectronics = p -> "electronics".equalsIgnoreCase(p.getCategory());
        printProducts(products, isElectronics);

        // 3. Electronics category and price greater than 100
        Predicate<Product> electronicsAndPriceGreaterThan100 = isElectronics.and(p -> p.getPrice() > 100);
        printProducts(products, electronicsAndPriceGreaterThan100);

        // 4. Price greater than 100 or electronics category
        Predicate<Product> priceGreaterThan100OrElectronics = p -> p.getPrice() > 100 || "electronics".equalsIgnoreCase(p.getCategory());
        printProducts(products, priceGreaterThan100OrElectronics);

        // 5. Electronics category and price less than 100
        Predicate<Product> electronicsAndPriceLessThan100 = isElectronics.and(p -> p.getPrice() < 100);
        printProducts(products, electronicsAndPriceLessThan100);

        // 6. Status code 400
        Predicate<Response> statusCode400 = r -> r.getStatusCode() == 400;
        printResponses(responses, statusCode400);

        // 7. Response type JSON
        Predicate<Response> responseTypeJSON = r -> "JSON".equalsIgnoreCase(r.getResponseType());
        printResponses(responses, responseTypeJSON);

        // 8. Status code 400 and response type JSON
        Predicate<Response> statusCode400AndResponseTypeJSON = statusCode400.and(responseTypeJSON);
        printResponses(responses, statusCode400AndResponseTypeJSON);

        // 9. Status code 400 or response type JSON
        Predicate<Response> statusCode400OrResponseTypeJSON = statusCode400.or(responseTypeJSON);
        printResponses(responses, statusCode400OrResponseTypeJSON);

        // 10. Status code not 400 and response type JSON
        Predicate<Response> statusCodeNot400AndResponseTypeJSON = statusCode400.negate().and(responseTypeJSON);
        printResponses(responses, statusCodeNot400AndResponseTypeJSON);
    }

    private static void printProducts(List<Product> products, Predicate<Product> predicate) {
        products.stream().filter(predicate).forEach(System.out::println);
    }

    private static void printResponses(List<Response> responses, Predicate<Response> predicate) {
        responses.stream().filter(predicate).forEach(System.out::println);
    }
}
