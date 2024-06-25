import java.util.ArrayList;
import java.util.List;

abstract class Appliance {
    private String name;
    private int powerConsumption;
    private boolean isOn;

    public Appliance(String name, int powerConsumption) {
        this.name = name;
        this.powerConsumption = powerConsumption;
        this.isOn = false;
    }

    public String getName() {
        return name;
    }

    public int getPowerConsumption() {
        return powerConsumption;
    }

    public boolean isOn() {
        return isOn;
    }

    public void switchOn() {
        isOn = true;
    }

    public void switchOff() {
        isOn = false;
    }
}

class Fan extends Appliance {
    public Fan() {
        super("Fan", 1);
    }
}

class Light extends Appliance {
    public Light() {
        super("Light", 2);
    }
}

class TV extends Appliance {
    public TV() {
        super("TV", 3);
    }
}

class Laptop extends Appliance {
    public Laptop() {
        super("Laptop", 4);
    }
}

class Home {
    private List<Appliance> appliances;

    public Home() {
        appliances = new ArrayList<>();
    }

    public void addAppliance(Appliance appliance) {
        appliances.add(appliance);
    }

    public int calculatePowerConsumption() {
        int totalPower = 0;
        for (Appliance appliance : appliances) {
            if (appliance.isOn()) {
                totalPower += appliance.getPowerConsumption();
            }
        }
        return totalPower;
    }

    public void sortByState() {
        for (int i = 0; i < appliances.size() - 1; i++) {
            for (int j = i + 1; j < appliances.size(); j++) {
                if (appliances.get(i).isOn() && !appliances.get(j).isOn()) {
                    Appliance temp = appliances.get(i);
                    appliances.set(i, appliances.get(j));
                    appliances.set(j, temp);
                }
            }
        }
    }

    public void sortByPowerConsumption() {
        for (int i = 0; i < appliances.size() - 1; i++) {
            for (int j = i + 1; j < appliances.size(); j++) {
                if (appliances.get(i).getPowerConsumption() > appliances.get(j).getPowerConsumption()) {
                    Appliance temp = appliances.get(i);
                    appliances.set(i, appliances.get(j));
                    appliances.set(j, temp);
                }
            }
        }
    }

    public void printAppliances() {
        for (Appliance appliance : appliances) {
            System.out.println(appliance.getName() + " - Power Consumption: " + appliance.getPowerConsumption() +
                    " units, State: " + (appliance.isOn() ? "ON" : "OFF"));
        }
    }
}

public class HomePowerConsumption {
    public static void main(String[] args) {
        Home home = new Home();

        Appliance fan = new Fan();
        Appliance light = new Light();
        Appliance tv = new TV();
        Appliance laptop = new Laptop();

        home.addAppliance(fan);
        home.addAppliance(light);
        home.addAppliance(tv);
        home.addAppliance(laptop);

        System.out.println("Initial State:");
        home.printAppliances();
        System.out.println("Total Power Consumption: " + home.calculatePowerConsumption() + " units");

        fan.switchOn();
        laptop.switchOn();
        System.out.println("\nSwitched on--> Fan and Laptop");
        home.printAppliances();
        System.out.println("Total Power Consumption: " + home.calculatePowerConsumption() + " units");

        home.sortByState();
        System.out.println("\nAfter Sorting by State:");
        home.printAppliances();

        home.sortByPowerConsumption();
        System.out.println("\nAfter Sorting by Power Consumption:");
        home.printAppliances();
    }
}
