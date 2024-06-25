package Java8;

import java.util.Comparator;
import java.util.TreeMap;

public class TreeMapNumbers {
    public static void main(String[] args) {
        TreeMap<Integer, String> treeMap = new TreeMap<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }
        });

        treeMap.put(1, "One");
        treeMap.put(2, "Two");
        treeMap.put(3, "Three");


        for (Integer key : treeMap.keySet()) {
            System.out.println(key + " -> " + treeMap.get(key));
        }
    }
}

