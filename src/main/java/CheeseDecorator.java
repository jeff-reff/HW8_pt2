public class CheeseDecorator extends FoodDecorator{

    public CheeseDecorator(Food food){
        super(food);
    }

    @Override
    public double baseCost(){
        return super.baseCost() + 0.75;
    }

    @Override
    public String itemName(){
        return super.itemName();
    }
}

