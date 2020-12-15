package hbcu.stay.ready.baronsfarm.farm;

import hbcu.stay.ready.baronsfarm.person.Farmer;

public class Farm {

    private FarmHouse baronsHouse;
    private Farmer baron;
    private Farmer baroness;
//    private Stable trinityStables;
//    private ChickenCoop CasaDeHuevos;

    private static Farm baronsFarm = new Farm();

    private Farm() {
    }

    public static Farm getInstance() {
        return baronsFarm;


    }



}
