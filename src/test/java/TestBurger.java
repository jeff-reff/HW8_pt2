import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestBurger {

    @Test
    public void baseCost(){
        Food burger = new Burger();
        double expected = 5.00;
        double actual = burger.baseCost();
        assertEquals(expected, actual);
    }

}
