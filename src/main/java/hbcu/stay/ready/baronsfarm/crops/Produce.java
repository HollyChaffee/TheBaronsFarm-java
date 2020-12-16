package hbcu.stay.ready.baronsfarm.crops;

import hbcu.stay.ready.baronsfarm.ediblefoods.Edible;

public abstract class Produce {

    protected boolean hasBeenHarvested = false;
    protected boolean hasBeenFertilized = false;

    public abstract void harvest();
    public abstract void fertilize();
    public abstract Edible yield();

    public abstract boolean getHasBeenHarvested();
    public abstract boolean getHasBeenFertilized();

    public abstract boolean getHasNotBeenFertilized();
}