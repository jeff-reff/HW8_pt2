public class KetchupDecorator extends FoodDecorator{

    public KetchupDecorator(Food food){
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
