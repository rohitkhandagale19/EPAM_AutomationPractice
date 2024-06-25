package Java8;

import java.util.TreeMap;

public class TreeMapNumbersLambda {
    public static void main(String[] args) {
        TreeMap<Integer, String> treeMap = new TreeMap<>((o1, o2) -> o2.compareTo(o1));

        treeMap.put(1, "One");
        treeMap.put(3, "Three");
        treeMap.put(2, "Two");

        for (Integer key : treeMap.keySet()) {
            System.out.println(key + " -> " + treeMap.get(key));
        }
    }
}
