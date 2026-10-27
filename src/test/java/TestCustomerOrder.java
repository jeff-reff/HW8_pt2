import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestCustomerOrder {

    @Test
    public void testOrderTotal(){
        CustomerOrder order = new CustomerOrder();

        double expected = 9.00;
        order.addItem(new Burger());
        order.addItem(new Fries());
        double actual = order.totalOrderCost();
        assertEquals(expected, actual);
    }

}
