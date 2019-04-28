package framework.weapons;

public class Bow implements Weapon {

    public Bow() {
        System.out.println("Creating Bow");
    }

    @Override
    public String toString() { return "Bow"; }
}
