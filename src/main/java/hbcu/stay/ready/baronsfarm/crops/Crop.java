package hbcu.stay.ready.baronsfarm.crops;

import hbcu.stay.ready.baronsfarm.ediblefoods.Edible;

public abstract class Crop extends Produce{

    private boolean hasBeenHarvested;
    private boolean hasBeenFertilized;

    public Crop() {
        this.hasBeenFertilized = false;
        this.hasBeenHarvested = false;
    }
    public boolean isHasBeenHarvested() {
        return hasBeenHarvested;
    }

    public void setHasBeenHarvested(boolean hasBeenHarvested) {
        this.hasBeenHarvested = hasBeenHarvested;
    }


    public boolean isHasBeenFertilized() {
        return hasBeenFertilized;
    }


    public void setHasBeenFertilized(boolean hasBeenFertilized) {
        this.hasBeenFertilized = hasBeenFertilized;
    }


    public void harvest() {

    }

    public void fertilize() {

    }

    public Edible yield() {
        return null;
    }

    @Override
    public boolean getHasBeenHarvested() {
        return false;
    }


}

