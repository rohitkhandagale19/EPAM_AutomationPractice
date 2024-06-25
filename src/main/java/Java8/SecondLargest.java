package Java8;

import java.util.ArrayList;
import java.util.List;

public class SecondLargest {
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
            return null;   // return null gives error if we use datatype int
        }

        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int number : numbers) {
            if (number > first) {
                second = first;
                first = number;
            } else if (number > second && number != first) {
                second = number;
            }
        }

        return second != Integer.MIN_VALUE ? second : null;
    }
}


