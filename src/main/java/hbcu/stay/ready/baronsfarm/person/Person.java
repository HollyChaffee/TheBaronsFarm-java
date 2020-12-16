package hbcu.stay.ready.baronsfarm.person;

import hbcu.stay.ready.baronsfarm.animals.Eater;
import hbcu.stay.ready.baronsfarm.animals.NoiseMaker;
import hbcu.stay.ready.baronsfarm.ediblefoods.Edible;

public abstract class Person implements NoiseMaker, Eater {

    private String name;

    public Person() {

    }

    public Person(String name) {
        this.name = name;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String eat(Edible food) {
        this.eat(food);
        return eat(food);
    }



}
