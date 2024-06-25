package Java8;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetNumbers {
    public static void main(String[] args) {
        Set<Integer> numbers = new TreeSet<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }
        });

        numbers.add(5);
        numbers.add(10);
        numbers.add(3);
        numbers.add(8);

        System.out.println(numbers);
    }
}

