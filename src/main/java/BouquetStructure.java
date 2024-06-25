import java.util.*;

class Flower {
    private String name;
    private int cost;

    public Flower(String name, int cost) {
        this.name = name;
        this.cost = cost;
    }

    public int getCost() {
        return cost;
    }
}

class Bouquet {
    private List<Flower> flowers = new ArrayList<>();

    public void addFlower(Flower flower) {
        flowers.add(flower);
    }

    public int calculateCost() {
        int totalCost = 0;
        for (Flower flower : flowers) {
            totalCost += flower.getCost();
        }
        return totalCost;
    }
}

public class BouquetStructure {
    public static void main(String[] args) {
        Flower rose = new Flower("Rose", 1);
        Flower jasmine = new Flower("Jasmine", 2);
        Flower lily = new Flower("Lily", 3);

        Bouquet bouquet = new Bouquet();
        bouquet.addFlower(rose);
        bouquet.addFlower(jasmine);
        bouquet.addFlower(lily);

        System.out.println("Cost of the bouquet is: $" + bouquet.calculateCost());
    }
}

