package hbcu.stay.ready.baronsfarm.crops;

import hbcu.stay.ready.baronsfarm.ediblefoods.Edible;

public abstract class Produce {


    private boolean hasBeenFertilized;


    public Produce() {
        hasBeenFertilized = false;

    }

    public boolean isHasBeenFertilized() {
        return hasBeenFertilized;
    }

    public void setHasBeenFertilized(boolean hasBeenFertilized) {
        this.hasBeenFertilized = hasBeenFertilized;
    }


    public abstract Edible yield();


}