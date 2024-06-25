import java.util.Comparator;

public class Checker implements Comparator<Player> {
    @Override
    public int compare(Player o1, Player o2) {
        int scoreCompare = o2.score - o1.score;
        int nameCompare = o1.name.compareTo(o2.name);
        return scoreCompare == 0 ? nameCompare : o2.score - o1.score;
    }
}
