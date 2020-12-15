package hbcu.stay.ready.baronsfarm.animals;

import hbcu.stay.ready.baronsfarm.crops.Produce;
import hbcu.stay.ready.baronsfarm.ediblefoods.Edible;

import java.util.ArrayList;

public class Chicken extends Produce implements Animal {



    public Boolean hasBeenFertilized() {
        return null;
    }

    public Boolean hasNotBeenFertilized() {
        return null;
    }

    public String makeNoise() {
        return "Cluck Cluck!";
    }

    public void eat(Edible edible) {

    }

    public Edible yield() {
        return null;
    }
}
