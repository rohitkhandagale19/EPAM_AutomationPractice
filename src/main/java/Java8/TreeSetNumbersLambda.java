package Java8;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetNumbersLambda {
    public static void main(String[] args) {
        Set<Integer> numbers = new TreeSet<>((o1, o2) -> o2.compareTo(o1));

        numbers.add(5);
        numbers.add(10);
        numbers.add(3);
        numbers.add(8);

        System.out.println(numbers);
    }
}

