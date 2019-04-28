package game;

import framework.units.Unit;
import game.buildings.Archery;
import game.buildings.Barrack;
import game.buildings.Monastery;

public class Player {

    public static void main(String[] args) {

        Monastery monastery = new Monastery();
        Barrack barrack = new Barrack();
        Archery archery = new Archery();

        Unit warrior = barrack.trainWarrior();
        Unit spearman = barrack.trainSpearman();
        Unit archer = archery.trainArcher();
        Unit priest = monastery.trainPriest();

        System.out.println(warrior);
        System.out.println(spearman);
        System.out.println(archer);
        System.out.println(priest);
    }
}
