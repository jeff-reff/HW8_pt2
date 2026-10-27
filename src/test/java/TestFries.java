import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestFries {

    @Test
    public void testBaseCost(){
        Food fries = new Fries();
        double expected = 4.00;
        double actual = fries.baseCost();
        assertEquals(expected, actual);
    }

    @Test
    public void testItemName(){
        Food fries = new Fries();
        String expected = "fries";
        String actual = fries.itemName();
        assertEquals(expected, actual);
    }

}
