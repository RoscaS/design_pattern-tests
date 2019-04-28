package framework.stuffFactory;

import framework.armors.Armor;
import framework.armors.PlateArmor;
import framework.weapons.Sword;
import framework.weapons.Weapon;

public class WarriorStuffFactory implements StuffFactory {

    @Override
    public Armor createArmor() { return new PlateArmor(); }

    @Override
    public Weapon createWeapon() { return new Sword(); }
}
