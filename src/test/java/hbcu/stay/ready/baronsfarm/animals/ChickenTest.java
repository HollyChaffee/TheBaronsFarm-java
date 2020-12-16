package hbcu.stay.ready.baronsfarm.animals;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ChickenTest {
    private Chicken chicken;

    @Before
    public void setUp() {
        chicken = new Chicken();
    }

    @Test
    public void getHasBeenFertilizedTest() {
        //Given
        chicken.getHasBeenFertilized();

        //When
        boolean expected = false;
        boolean actual = chicken.getHasBeenFertilized();

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getHasNotBeenFertilizedTest() {
        //Given
        chicken.getHasNotBeenFertilized();

        //When
        boolean expected = false;
        boolean actual = chicken.getHasNotBeenFertilized();

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void makeNoise() {
        //Given
        chicken.makeNoise();

        //When
        String expected = "Cluck cluck";
        String actual = chicken.makeNoise();

        //Then
        Assert.assertEquals(expected, actual);
    }
}