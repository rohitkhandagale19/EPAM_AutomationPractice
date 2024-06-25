import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

abstract class Sweet {
    private String name;
    private double weight;

    public Sweet(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }
}

class Chocolate extends Sweet {
    private String brand;

    public Chocolate(String name, double weight, String brand) {
        super(name, weight);
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }
}

class Candy extends Sweet {
    private String flavor;

    public Candy(String name, double weight, String flavor) {
        super(name, weight);
        this.flavor = flavor;
    }

    public String getFlavor() {
        return flavor;
    }
}

public class NewYearGift {
    private static void sortByName(List<Sweet> gift) {
        for (int i = 0; i < gift.size() - 1; i++) {
            for (int j = i + 1; j < gift.size(); j++) {
                if (gift.get(i).getName().compareTo(gift.get(j).getName()) > 0) {
                    Sweet temp = gift.get(i);
                    gift.set(i, gift.get(j));
                    gift.set(j, temp);
                }
            }
        }
    }

    private static void sortByWeight(List<Sweet> gift) {
        for (int i = 0; i < gift.size() - 1; i++) {
            for (int j = i + 1; j < gift.size(); j++) {
                if (gift.get(i).getWeight() > gift.get(j).getWeight()) {
                    Sweet temp = gift.get(i);
                    gift.set(i, gift.get(j));
                    gift.set(j, temp);
                }
            }
        }
    }

    public static void main(String[] args) {
        List<Sweet> gift = new ArrayList<>();

        Chocolate dairyMilk = new Chocolate("Dairy Milk", 50, "Cadbury");
        Chocolate kitKat = new Chocolate("Kit Kat", 30, "Nestle");
        Chocolate munch = new Chocolate("Munch", 40, "Nestle");
        Candy gulabJamun = new Candy("Gulab Jamun", 100, "Sweet");
        Candy rasgulla = new Candy("Rasgulla", 80, "Sweet");
        Candy kajuKatli = new Candy("Kaju Katli", 120, "Sweet");

        gift.add(dairyMilk);
        gift.add(kitKat);
        gift.add(gulabJamun);
        gift.add(rasgulla);
        gift.add(munch);
        gift.add(kajuKatli);

        double totalWeight = 0;
        for (Sweet sweet : gift) {
            totalWeight += sweet.getWeight();
        }
        System.out.println("Total Weight of the Gift: " + totalWeight + " grams");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Sort chocolates by (1) name or (2) weight? Enter choice:");
        int choice = scanner.nextInt();
        if (choice == 1) {
            sortByName(gift);
        } else if (choice == 2) {
            sortByWeight(gift);
        }

        System.out.println("Sorted Chocolates:");
        for (Sweet sweet : gift) {
            if (sweet instanceof Chocolate) {
                System.out.println(sweet.getName() + " (" + ((Chocolate) sweet).getBrand() + ") - " + sweet.getWeight() + " grams");
            }
        }

        System.out.println("Enter minimum weight:");
        double minWeight = scanner.nextDouble();
        System.out.println("Enter maximum weight:");
        double maxWeight = scanner.nextDouble();

        System.out.println("Candies within the specified range:");
        for (Sweet sweet : gift) {
            if (sweet instanceof Candy) {
                Candy candy = (Candy) sweet;
                if (candy.getWeight() >= minWeight && candy.getWeight() <= maxWeight) {
                    System.out.println(candy.getName() + " - " + candy.getWeight() + " grams");
                }
            }
        }

        scanner.close();
    }
}
