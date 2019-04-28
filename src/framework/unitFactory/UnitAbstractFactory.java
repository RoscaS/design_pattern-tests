package framework.unitFactory;

import framework.units.Unit;


public abstract class UnitAbstractFactory {

    protected abstract Unit assemble();

    public Unit create() {
        System.out.println("Beginning unit creation.");
        Unit unit = assemble();
        unit.prepare();
        return unit;
    }
}
