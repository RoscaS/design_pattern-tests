package framework.unitFactory;

import framework.stuffFactory.StuffFactory;
import framework.stuffFactory.WarriorStuffFactory;
import framework.units.Unit;
import framework.units.Warrior;

public class WarriorFactory extends UnitAbstractFactory {

    @Override
    protected Unit assemble() {
        StuffFactory warriorStuff = new WarriorStuffFactory();
        return new Warrior(warriorStuff);
    }
}
