import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestHotDog {

    @Test
    public void baseCost(){
        Food hotdog = new HotDogs();
        double expected = 3.00;
        double actual = hotdog.baseCost();
        assertEquals(expected, actual);
    }

    @Test
    public void itemName(){
        Food hotdog = new HotDogs();
        String expected = "hot dog";
        String actual = hotdog.itemName();
        assertEquals(expected, actual);
    }
}
