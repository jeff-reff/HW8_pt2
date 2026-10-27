public class Burger implements Food{

    @Override
    public double baseCost(){
        return 5.00;
    }

    @Override
    public String itemName(){
        return "burger";
    }

}
