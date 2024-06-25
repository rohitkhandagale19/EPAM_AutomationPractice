import java.util.Scanner;
import java.util.TreeMap;

public class TreeMapOperations {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt(); // Number of test cases
        for (int t = 0; t < T; t++) {
            TreeMap<Integer, Integer> treeMap = new TreeMap<>();
            int Q = scanner.nextInt(); // Number of queries
            for (int q = 0; q < Q; q++) {
                char operation = scanner.next().charAt(0);

                if (operation == 'a') {
                    int key = scanner.nextInt();
                    int value = scanner.nextInt();
                    treeMap.put(key, value);
                } else if (operation == 'b') {
                    int key = scanner.nextInt();
                    int value = treeMap.containsKey(key) ? treeMap.get(key) : -1;
                    System.out.print(value + " ");
                } else if (operation == 'c') {
                    System.out.print(treeMap.size() + " ");
                } else if (operation == 'd') {
                    int key = scanner.nextInt();
                    treeMap.remove(key);
                } else if (operation == 'e') {
                    for (int mapKey : treeMap.keySet()) {
                        System.out.print(mapKey + ":" + treeMap.get(mapKey) + " ");
                    }
                }
            }
            System.out.println();
        }
        scanner.close();
    }
}
