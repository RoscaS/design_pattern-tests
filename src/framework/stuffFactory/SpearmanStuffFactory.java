package framework.stuffFactory;

import framework.armors.Armor;
import framework.armors.LightArmor;
import framework.weapons.Spear;
import framework.weapons.Weapon;

public class SpearmanStuffFactory implements StuffFactory {

    @Override
    public Armor createArmor() { return new LightArmor(); }

    @Override
    public Weapon createWeapon() { return new Spear(); }
}
