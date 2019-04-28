package framework.units;

import framework.stuffFactory.StuffFactory;

public class Priest extends Unit  {

    private StuffFactory priestStuffFactory;

    public Priest(StuffFactory priestStuffFactory) {
        this.priestStuffFactory = priestStuffFactory;
    }

    @Override
    public void prepare() {
        setArmor(priestStuffFactory.createArmor());
        setWeapon(priestStuffFactory.createWeapon());
    }
}
