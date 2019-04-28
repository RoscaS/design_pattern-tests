package framework.unitFactory;

import framework.stuffFactory.PriestStuffFactory;
import framework.stuffFactory.StuffFactory;
import framework.units.Priest;
import framework.units.Unit;

public class PriestFactory extends UnitAbstractFactory {

    @Override
    protected Unit assemble() {
        StuffFactory priestStuffFactory = new PriestStuffFactory();
        return new Priest(priestStuffFactory);
    }
}
