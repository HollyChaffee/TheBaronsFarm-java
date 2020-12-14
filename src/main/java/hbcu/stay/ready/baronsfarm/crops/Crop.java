package hbcu.stay.ready.baronsfarm.crops;

public abstract class Crop extends Produce{

    private Boolean hasBeenHarvested;
    private Boolean hasBeenFertilized;

    public Crop() {
        this.hasBeenFertilized = false;
        this.hasBeenHarvested = false;
    }
    public Boolean getHasBeenHarvested() {
        return hasBeenHarvested;
    }

    public void setHasBeenHarvested(boolean hasBeenHarvested) {
        this.hasBeenHarvested = hasBeenHarvested;
    }


    public Boolean getHasBeenFertilized() {
        return hasBeenFertilized;
    }


    public void setHasBeenFertilized(boolean hasBeenFertilized) {
        this.hasBeenFertilized = hasBeenFertilized;
    }
}
