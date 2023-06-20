import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterBottleTest {

    WaterBottle waterBottle; //declare a variable of class WaterBottle

    @Before    //create instance of WaterBottle class 
    public void before() {
        waterBottle = new WaterBottle();
    }

    @Test
    public void hasWater() {
        assertEquals(100, waterBottle.getVolume());
    }

    @Test
    public void afterDrinks() {
        waterBottle.drink();
        waterBottle.drink();
        assertEquals(80, waterBottle.getVolume());
    }

    @Test
    public void emptyBottle() {
        waterBottle.empty();
        assertEquals(0, waterBottle.getVolume());
    }

    @Test
    public void fillBottle() {
        waterBottle.empty();
        waterBottle.fill();
        assertEquals(100, waterBottle.getVolume());
    }

}
