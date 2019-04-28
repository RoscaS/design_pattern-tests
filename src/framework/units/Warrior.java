package framework.units;

import framework.stuffFactory.StuffFactory;

public class Warrior extends Unit {

    private StuffFactory warriorStuffFactory;

    public Warrior(StuffFactory warriorStuffFactory) {
        this.warriorStuffFactory = warriorStuffFactory;
    }

    @Override
    public void prepare() {
        this.setArmor(warriorStuffFactory.createArmor());
        this.setWeapon(warriorStuffFactory.createWeapon());
    }
}
