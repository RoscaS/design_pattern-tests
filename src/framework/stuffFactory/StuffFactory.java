package framework.stuffFactory;

import framework.armors.Armor;
import framework.weapons.Weapon;

public interface StuffFactory {
    Armor createArmor();
    Weapon createWeapon();
}
