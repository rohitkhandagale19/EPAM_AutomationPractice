package Java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparatorInterfaceLambda {

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(4);
        numbers.add(20);
        numbers.add(15);

        Collections.sort(numbers, (o1, o2) -> o2.compareTo(o1));

        System.out.println("Sorted list in reverse order: " + numbers);
    }
}
