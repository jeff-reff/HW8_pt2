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

    @Test
    public void testOrderTotalWithToppings(){
        CustomerOrder order = new CustomerOrder();

        double expected = 10.75;
        order.addItem(new CheeseDecorator(new OnionDecorator(new Burger())));
        order.addItem(new CheeseDecorator(new Fries()));
        double actual = order.totalOrderCost();
        assertEquals(expected, actual);
    }

    @Test
    public void testOrderNames(){
        CustomerOrder order = new CustomerOrder();

        String expected = "burger: 5.00 & fries: 4.00";
        order.addItem(new Burger());
        order.addItem(new Fries());
        String actual = order.orderedItems();
        assertEquals(expected, actual);
    }

    @Test
    public void testOrderNamesWithToppings(){
        CustomerOrder order = new CustomerOrder();

        String expected = "burger, with onions, with cheese: $6.00 & fries, with cheese: $4.75";
        order.addItem(new CheeseDecorator(new OnionDecorator(new Burger())));
        order.addItem(new CheeseDecorator(new Fries()));
        String actual = order.orderedItems();
        assertEquals(expected, actual);
    }

}
