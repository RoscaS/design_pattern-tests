package framework.armors;

public class ClothArmor implements Armor {
    public ClothArmor() {
        System.out.println("Creating Cloth armor");
    }

    @Override
    public String toString() { return "Cloth"; }
}
