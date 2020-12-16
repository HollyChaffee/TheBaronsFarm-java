package hbcu.stay.ready.baronsfarm.ediblefoods;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class EdibleEggTest {

    private EdibleEgg edibleEgg;

    @Before
    public void setUp() {
        edibleEgg = new EdibleEgg();
    }

    @Test
    public void getEdibleEggTest() {
        //Given
        edibleEgg.getIsEdible();

        //When
        Boolean expected = true;
        Boolean actual = edibleEgg.getIsEdible();

        //Then
        Assert.assertEquals(expected, actual);
    }
}