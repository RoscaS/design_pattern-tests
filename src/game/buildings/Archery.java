package game.buildings;

import framework.unitFactory.ArcherFactory;
import framework.unitFactory.UnitAbstractFactory;
import framework.units.Unit;

public class Archery {
    private UnitAbstractFactory archerFactory;

    public Archery() {
        archerFactory = new ArcherFactory();
    }

    public Unit trainArcher() {
        return archerFactory.create();
    }
}
