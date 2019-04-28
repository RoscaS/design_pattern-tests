package framework.units;

import framework.armors.Armor;
import framework.weapons.Weapon;

public abstract class Unit {
    private Armor armor;
    private Weapon weapon;

    public abstract void prepare();

    public void setArmor(Armor armor) { this.armor = armor; }
    public void setWeapon(Weapon weapon) { this.weapon = weapon; }

    public Armor getArmor() { return armor; }
    public Weapon getWeapon() { return weapon; }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Unit: ");
        sb.append(getClass().getSimpleName());
        sb.append(" { armor = ").append(armor);
        sb.append(", weapon = ").append(weapon);
        sb.append('}');
        return sb.toString();
    }
}
