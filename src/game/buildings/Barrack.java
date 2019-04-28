package game.buildings;

import framework.unitFactory.SpearmanFactory;
import framework.unitFactory.UnitAbstractFactory;
import framework.unitFactory.WarriorFactory;
import framework.units.Unit;

public class Barrack {
    private UnitAbstractFactory warriorFactory;
    private UnitAbstractFactory spearmanFactory;

    public Barrack() {
        warriorFactory = new WarriorFactory();
        spearmanFactory = new SpearmanFactory();
    }

    public Unit trainWarrior() {
        return warriorFactory.create();
    }

    public Unit trainSpearman() {
        return spearmanFactory.create();
    }
}
