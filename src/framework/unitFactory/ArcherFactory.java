package framework.unitFactory;

import framework.stuffFactory.ArcherStuffFactory;
import framework.stuffFactory.StuffFactory;
import framework.units.Archer;
import framework.units.Unit;

public class ArcherFactory extends UnitAbstractFactory {

    @Override
    protected Unit assemble() {
        StuffFactory archerStuff = new ArcherStuffFactory();
        return new Archer(archerStuff);
    }
}
