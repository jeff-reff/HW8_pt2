import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestKetchupDecorator {

    @Test
    public void testToppingsCost(){
        Food burgerWithKetchup = new KetchupDecorator(new Burger());
        double expected = 5.50;
        double actual = burgerWithKetchup.baseCost();
        assertEquals(expected, actual);
    }

}
