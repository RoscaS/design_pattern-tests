package framework.weapons;

public class Sword implements Weapon {

    public Sword() {
        System.out.println("Creating Sword");
    }

    @Override
    public String toString() { return "Sword"; }
}
