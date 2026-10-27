public class OnionDecorator extends FoodDecorator{

    public OnionDecorator(Food food){
        super(food);
    }

    @Override
    public double baseCost(){
        return super.baseCost() + 0.25;
    }

    @Override
    public String itemName(){
        return super.itemName();
    }
}
