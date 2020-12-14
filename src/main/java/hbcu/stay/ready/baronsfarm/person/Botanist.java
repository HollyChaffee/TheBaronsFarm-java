package hbcu.stay.ready.baronsfarm.person;

import hbcu.stay.ready.baronsfarm.crops.Crop;
import hbcu.stay.ready.baronsfarm.crops.CropRow;

public interface Botanist {
    void plant(CropRow croprow, Crop crop);
}
