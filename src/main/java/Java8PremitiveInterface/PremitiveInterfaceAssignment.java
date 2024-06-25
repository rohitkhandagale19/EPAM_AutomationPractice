package Java8PremitiveInterface;

import java.util.Random;
import java.util.function.IntConsumer;
import java.util.function.IntPredicate;
import java.util.function.IntSupplier;

public class PremitiveInterfaceAssignment {
    public static void main(String[] args) {
        // Task 1: Prime Number Check
        IntPredicate isPrime = number -> {
            if (number <= 1) return false;
            for (int i = 2; i <= number / 2; i++) {
                if (number % i == 0) return false;
            }
            return true;
        };

        // Example usage of Task 1:
        int testNumber = 19;
        System.out.println("Is " + testNumber + " a prime number? " + isPrime.test(testNumber));

        // Task 2: Print Square of Number
        IntConsumer printSquare = number -> System.out.println("Square of " + number + " is " + (number * number));

        // Example usage of Task 2:
        int numberToSquare = 12;
        printSquare.accept(numberToSquare);

        // Task 3: Generate Random Integer
        IntSupplier randomIntBelow5000 = () -> new Random().nextInt(5000);

        // Example usage of Task 3:
        System.out.println("Random integer below 5000: " + randomIntBelow5000.getAsInt());
    }
}
