import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayListAssignment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        scanner.nextLine();

        ArrayList<ArrayList<Integer>> lines = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int numIntegers = scanner.nextInt();
            ArrayList<Integer> currentLine = new ArrayList<>();
            for (int j = 0; j < numIntegers; j++) {
                currentLine.add(scanner.nextInt());
            }
            lines.add(currentLine);
        }

        int q = scanner.nextInt();
        scanner.nextLine();

        List<int[]> queries = new ArrayList<>();
        for (int i = 0; i < q; i++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            scanner.nextLine();
            queries.add(new int[]{x, y});
        }

        for (int[] query : queries) {
            int x = query[0];
            int y = query[1];
            if (x > 0 && x <= lines.size() && y > 0 && y <= lines.get(x - 1).size()) {
                System.out.println(lines.get(x - 1).get(y - 1));
            } else {
                System.out.println("ERROR!");
            }
        }

        scanner.close();
    }
}
