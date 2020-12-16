package hbcu.stay.ready.baronsfarm.ediblefoods;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BeetTest {
    private Beet beet;

    @Before
    public void setUp() {
        beet = new Beet();
    }

    @Test
    public void getIsEdibleTest() {
        //Given
        beet.getIsEdible();

        //When
        boolean expected = true;
        boolean actual = beet.getIsEdible();

        //Then
        Assert.assertEquals(expected, actual);
    }

}
