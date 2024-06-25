import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class JavaComparator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        scanner.nextLine();
        ArrayList<Player> players = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String name = scanner.next();
            int score = scanner.nextInt();
            players.add(new Player(name, score));
        }

        Collections.sort(players, new Checker());

        for (Player player : players) {
            System.out.println(player.name + " " + player.score);
        }

        scanner.close();
    }
}