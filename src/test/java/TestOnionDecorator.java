import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestOnionDecorator {

    @Test
    public void testToppingsCost(){
        Food hotdogWithOnions = new OnionDecorator(new HotDogs());

        double expected = 3.25;
        double actual = hotdogWithOnions.baseCost();
        assertEquals(expected, actual);
    }
}
