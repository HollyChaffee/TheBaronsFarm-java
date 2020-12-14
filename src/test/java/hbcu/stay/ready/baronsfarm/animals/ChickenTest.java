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
    public void hasBeenFertilizedTest() {
        //Given
        chicken.hasBeenFertilized();

        //When
        Boolean expected = true;
        Boolean actual = chicken.hasBeenFertilized();

        //Then
        Assert.assertTrue(actual);
    }

    @Test
    public void hasNotBeenFertilizedTest() {
        //Given
        chicken.hasNotBeenFertilized();

        //When
        Boolean expected = false;
        Boolean actual = chicken.hasNotBeenFertilized();

        //Then
        Assert.assertFalse(actual);
    }

    @Test
    public void makeNoise() {
        //Given
        chicken.makeNoise();

        //When
        String expected = "Cluck Cluck";
        String actual = chicken.makeNoise();

        //Then
        Assert.assertEquals(expected, actual);
    }
}