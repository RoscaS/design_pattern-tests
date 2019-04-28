package framework.units;

import framework.stuffFactory.StuffFactory;

public class Spearman extends Unit {

    private StuffFactory spearmanStuffFactory;

    public Spearman(StuffFactory spearmanStuffFactory) {
        this.spearmanStuffFactory = spearmanStuffFactory;
    }

    @Override
    public void prepare() {
        setArmor(spearmanStuffFactory.createArmor());
        setWeapon(spearmanStuffFactory.createWeapon());
    }
}
