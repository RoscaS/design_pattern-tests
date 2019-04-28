package game.buildings;

import framework.unitFactory.PriestFactory;
import framework.unitFactory.UnitAbstractFactory;
import framework.units.Unit;

public class Monastery {
    private UnitAbstractFactory priestFactory;

    public Monastery() {
        priestFactory = new PriestFactory();
    }

    public Unit trainPriest() {
        return priestFactory.create();
    }
}
