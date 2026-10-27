import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestCheeseDecorator {

    @Test
    public void testToppingsCost(){
        Food friesWithCheese = new CheeseDecorator(new Fries());
        double expected = 4.75;
        double actual = friesWithCheese.baseCost();
        assertEquals(expected, actual);
    }

    @Test
    public void testNameChange(){
        Food friesWithCheese = new CheeseDecorator(new Fries());
        String expected = "fries, with cheese";
        String actual = friesWithCheese.itemName();
        assertEquals(expected, actual);
    }

}
