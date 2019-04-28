package framework.armors;

public class LeatherArmor implements Armor {

    public LeatherArmor() {
        System.out.println("Creating Leather armor");
    }

    @Override
    public String toString() { return "Leather"; }
}
