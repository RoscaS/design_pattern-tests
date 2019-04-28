package framework.armors;

public class PlateArmor implements Armor {

    public PlateArmor() {
        System.out.println("Creating Plate armor");
    }

    @Override
    public String toString() { return "Plate"; }
}
