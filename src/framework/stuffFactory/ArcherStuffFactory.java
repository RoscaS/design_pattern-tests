package framework.stuffFactory;

import framework.armors.Armor;
import framework.armors.LeatherArmor;
import framework.weapons.Bow;
import framework.weapons.Weapon;

public class ArcherStuffFactory implements StuffFactory {

    @Override
    public Armor createArmor() { return new LeatherArmor(); }

    @Override
    public Weapon createWeapon() { return new Bow(); }
}
