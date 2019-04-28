package framework.units;

import framework.stuffFactory.StuffFactory;

public class Archer extends Unit {

    private StuffFactory archerStuffFactory;

    public Archer(StuffFactory archerStuffFactory) {
        this.archerStuffFactory = archerStuffFactory;
    }

    @Override
    public void prepare() {
        this.setArmor(archerStuffFactory.createArmor());
        this.setWeapon(archerStuffFactory.createWeapon());
    }
}
