package hbcu.stay.ready.baronsfarm.animals;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class HorseTest {
    private Horse horse;

    @Before
    public void setUp() {
        horse = new Horse();
    }

    @Test
    public void mountTest() {
        //Given
        horse.ride();

        //When
        Boolean expected = true;
        Boolean actual = horse.getHasBeenMounted();

        //Then
        Assert.assertTrue(actual);
    }

    @Test
    public void rideTest() {
        //Given
        horse.ride();
        horse.stoppedRiding();

        //When
        Boolean expected = true;
        Boolean actual = horse.getHasBeenRidden();

        //Then
        Assert.assertTrue(actual);
    }

    @Test
    public void makeNoiseTest() {
        //Given
        horse.makeNoise();

        //When
        String expected = "Neigh";
        String actual = horse.makeNoise();

        //Then
        Assert.assertEquals(expected, actual);
    }
}