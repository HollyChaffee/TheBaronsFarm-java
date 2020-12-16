package hbcu.stay.ready.baronsfarm.ediblefoods;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TomatoTest {
    private Tomato tomato;

    @Before
    public void setUp() {
        tomato = new Tomato();
    }

    @Test
    public void getIsEdibleTest() {
        //Given
        tomato.getIsEdible();

        //When
        boolean expected = true;
        boolean actual = tomato.getIsEdible();

        //Then
        Assert.assertEquals(expected, actual);
    }
}