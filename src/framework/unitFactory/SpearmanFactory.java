package framework.unitFactory;

import framework.stuffFactory.SpearmanStuffFactory;
import framework.stuffFactory.StuffFactory;
import framework.units.Spearman;
import framework.units.Unit;

public class SpearmanFactory extends UnitAbstractFactory {

    @Override
    protected Unit assemble() {
        StuffFactory spearmanStuffFactory = new SpearmanStuffFactory();
        return new Spearman(spearmanStuffFactory);
    }
}
