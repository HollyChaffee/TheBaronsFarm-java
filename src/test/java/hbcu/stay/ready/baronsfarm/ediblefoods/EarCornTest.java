package hbcu.stay.ready.baronsfarm.ediblefoods;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class EarCornTest {

        private EarCorn earCorn;

        @Before
        public void setUp() {
            earCorn = new EarCorn();
        }

        @Test
        public void getIsEdibleTest() {
            //Given
            earCorn.getIsEdible();

            //When
            boolean expected = true;
            boolean actual = earCorn.getIsEdible();

            //Then
            Assert.assertEquals(expected, actual);
        }

    }