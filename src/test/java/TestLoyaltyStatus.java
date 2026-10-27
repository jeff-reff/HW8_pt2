import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestLoyaltyStatus {

    @Test
    public void testIsApartOfProgram(){
        LoyaltyStatus member = new LoyaltyStatus(true);
        boolean expected = true;
        boolean actual = member.isApartOfProgram();;
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @ValueSource(doubles = 5.00)
    public void testDiscount(double total){
        LoyaltyStatus member = new LoyaltyStatus(true);
        double expected = 4.00;
        double actual = member.applyDiscount(total);
        assertEquals(expected, actual);

    }

}
