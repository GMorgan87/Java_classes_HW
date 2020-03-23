import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterBottleTest {

    WaterBottle bottle;

    @Before
    public void before() {
    bottle = new WaterBottle();
    }

    @Test
    public void startsWith100Volume(){
        assertEquals(100, bottle.getVolume());
    }

    @Test
    public void drinkReducesVolumeBy10(){
        bottle.drink();
        assertEquals(90, bottle.getVolume());
    }

    @Test
    public void canEmotyBottle(){
        bottle.empty();
        assertEquals(0, bottle.getVolume());
    }

    @Test
    public void canFillBottle(){
        bottle.fill();
        assertEquals(100, bottle.getVolume());
    }

}
