package hbcu.stay.ready.baronsfarm.crops;

import hbcu.stay.ready.baronsfarm.ediblefoods.Edible;

public abstract class Produce {

    private boolean hasBeenHarvested;
    private boolean hasBeenFertilized;


    public Produce() {
        hasBeenFertilized = false;
        hasBeenHarvested = false;
    }

    public boolean isHasBeenFertilized() {
        return hasBeenFertilized;
    }

    public void setHasBeenFertilized(boolean hasBeenFertilized) {
        this.hasBeenFertilized = hasBeenFertilized;
    }

    public boolean isHasBeenHarvested() {
        return hasBeenHarvested;
    }

    public void setHasBeenHarvested(boolean hasBeenHarvested) {
        this.hasBeenHarvested = hasBeenHarvested;
    }
}