public class CheeseDecorator extends FoodDecorator{

    public CheeseDecorator(Food food){
        super(food);
    }

    @Override
    public double baseCost(){
        return super.baseCost();
    }

    @Override
    public String itemName(){
        return super.itemName();
    }
}

