package hbcu.stay.ready.baronsfarm.animals;

import hbcu.stay.ready.baronsfarm.crops.Produce;
import hbcu.stay.ready.baronsfarm.ediblefoods.Edible;
import hbcu.stay.ready.baronsfarm.ediblefoods.EdibleEgg;

public class Chicken extends Produce implements Animal {

    public boolean getHasBeenHarvested() {
        return hasBeenHarvested;
    }

    public boolean getHasBeenFertilized() {
        return hasBeenFertilized;
    }

    public boolean getHasNotBeenFertilized() {
        return false;
    }

    public void harvest() {
        hasBeenHarvested = true;
    }

    public void fertilize() {
        hasBeenFertilized = true;
    }

    public String makeNoise() {
        return "Cluck cluck";
    }

    public EdibleEgg yield() {
        if (hasBeenFertilized && hasBeenHarvested) {
            EdibleEgg egg = new EdibleEgg();
            return egg;
        }
        return null;
    }

    public String eat(Edible food) {
        String message = "";
        if (food != null) {
            message += "Chicken has eaten the food!";
            System.out.println(message);
        }
        return message;
    }
}