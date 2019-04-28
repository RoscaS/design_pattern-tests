package framework.weapons;

public class Staff implements Weapon {

    public Staff() {
        System.out.println("Creating Staff");
    }

    @Override
    public String toString() { return "Staff"; }
}
