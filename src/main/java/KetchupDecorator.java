public class KetchupDecorator extends FoodDecorator{

    public KetchupDecorator(Food food){
        super(food);
    }

    @Override
    public double baseCost(){
        return super.baseCost() + 0.50;
    }

    @Override
    public String itemName(){
        return super.itemName() + ", with ketchup";
    }

}
