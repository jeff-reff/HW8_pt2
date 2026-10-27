import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestLoyaltyStatus {

    @Test
    public void testIsApartOfProgram(){
        LoyaltyStatus member = new LoyaltyStatus(true);
        boolean expected = true;
        boolean actual = member.isApartOfProgram();;
        assertEquals(expected, actual);
    }

}
