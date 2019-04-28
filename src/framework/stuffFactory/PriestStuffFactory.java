package framework.stuffFactory;

import framework.armors.Armor;
import framework.armors.ClothArmor;
import framework.weapons.Staff;
import framework.weapons.Weapon;

public class PriestStuffFactory implements StuffFactory {

    @Override
    public Armor createArmor() { return new ClothArmor(); }

    @Override
    public Weapon createWeapon() { return new Staff(); }
}
