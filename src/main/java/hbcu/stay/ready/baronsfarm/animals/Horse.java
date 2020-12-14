package hbcu.stay.ready.baronsfarm.animals;

import hbcu.stay.ready.baronsfarm.ediblefoods.Edible;
import hbcu.stay.ready.baronsfarm.person.Rider;

public class Horse implements Animal, Rideable {

    private boolean mounted = false;
    private boolean hasBeenRidden = false;

    public void ride() {
        this.mounted = true;
    }

    public void stoppedRiding() {
        this.hasBeenRidden = true;
        this.mounted = false;
    }

    public boolean getHasBeenRidden() {
        return hasBeenRidden;
    }

    public boolean getHasBeenMounted() {
        return mounted;
    }


    public String makeNoise() {
        return "Neigh";
    }


    public void ride(Rider rider) {

    }

    public void eat(Edible food) {

    }
}

