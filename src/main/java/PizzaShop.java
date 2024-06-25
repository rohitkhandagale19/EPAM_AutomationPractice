import java.util.ArrayList;
import java.util.List;

class Base {
    private double cost;

    public Base(double cost) {
        this.cost = cost;
    }

    public double getCost() {
        return cost;
    }
}

class Topping {
    private double cost;

    public Topping(double cost) {
        this.cost = cost;
    }

    public double getCost() {
        return cost;
    }
}

class Pizza {
    private Base base;
    private List<Topping> toppings = new ArrayList<>();

    public Pizza(Base base) {
        this.base = base;
    }

    public void addTopping(Topping topping) {
        toppings.add(topping);
    }

    public double calculateCost() {
        double totalCost = base.getCost();
        for (Topping topping : toppings) {
            totalCost += topping.getCost();
        }
        return totalCost;
    }
}

public class PizzaShop {
    public static void main(String[] args) {
        Base standardBase = new Base(5.0);
        Topping tomato = new Topping(1.0);
        Topping corn = new Topping(1.5);

        Pizza myPizza = new Pizza(standardBase);
        myPizza.addTopping(tomato);
        myPizza.addTopping(corn);

        System.out.println("Total cost: $" + myPizza.calculateCost());
    }
}
