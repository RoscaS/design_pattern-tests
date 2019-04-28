package framework.armors;

public class LightArmor implements Armor {
    public LightArmor() {
        System.out.println("Creating Light armor");
    }

    @Override
    public String toString() { return "Light"; }
}
