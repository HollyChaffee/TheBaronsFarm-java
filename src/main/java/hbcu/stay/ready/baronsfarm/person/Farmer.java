package hbcu.stay.ready.baronsfarm.person;

import hbcu.stay.ready.baronsfarm.animals.Rideable;
import hbcu.stay.ready.baronsfarm.crops.Crop;
import hbcu.stay.ready.baronsfarm.crops.CropRow;
import hbcu.stay.ready.baronsfarm.ediblefoods.Edible;

public class Farmer extends Person implements Botanist, Rider {

    public Farmer() {
        super();

    }
    public String eat(Edible food) {
        return "The farmer only eats edible food";
    }

    public String makeNoise() {
        return "That's one fine chicken you got there sonny";
    }

    public void plant(CropRow croprow, Crop crop) {

    }

    public void mount(Rideable rideable) {

    }

    public void dismount(Rideable rideable) {

    }
}
