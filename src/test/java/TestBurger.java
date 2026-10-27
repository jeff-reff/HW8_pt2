import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestBurger {

    @Test
    public void testBaseCost(){
        Food burger = new Burger();
        double expected = 5.00;
        double actual = burger.baseCost();
        assertEquals(expected, actual);
    }

    @Test
    public void testItemName(){
        Food burger = new Burger();
        String expected = "burger";
        String actual = burger.itemName();
        assertEquals(expected, actual);
    }

}
