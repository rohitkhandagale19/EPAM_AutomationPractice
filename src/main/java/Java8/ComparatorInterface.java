package Java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorInterface {

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(4);
        numbers.add(20);
        numbers.add(15);

        Comparator<Integer> reverseOrderComparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }
        };

        Collections.sort(numbers, reverseOrderComparator);

        System.out.println("Sorted list in reverse order: " + numbers);
    }
}

