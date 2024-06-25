package Java8;

import java.util.ArrayList;
import java.util.List;

public class SecondLargestLambda {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(4);
        numbers.add(45);
        numbers.add(99);

        System.out.println("The second largest number is: " + findSecondLargest(numbers));
    }

    public static Integer findSecondLargest(List<Integer> numbers) {
        if (numbers.size() < 2) {
            return null; // return null gives error if we use datatype int instead of Wrapper Class Integer
        }

        Integer secondLargest = numbers.stream()
                .sorted((a, b) -> b.compareTo(a))
                .distinct()
                .skip(1)
                .findFirst()
                .orElse(null);

        return secondLargest;
    }
}

