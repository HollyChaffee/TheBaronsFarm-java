package hbcu.stay.ready.baronsfarm.vehicles;

import hbcu.stay.ready.baronsfarm.person.Pilot;

public interface Aircraft extends Vehicle {

    void fly(Pilot pilot);
    void fertilize();

}
