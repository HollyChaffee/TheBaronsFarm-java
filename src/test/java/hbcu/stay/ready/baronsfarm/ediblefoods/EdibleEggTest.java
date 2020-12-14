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
        edibleEgg.isEdible();

        //When
        Boolean expected = true;
        Boolean actual = edibleEgg.isEdible();

        //Then
        Assert.assertTrue(actual);
    }
}