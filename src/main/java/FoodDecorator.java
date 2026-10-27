public abstract class FoodDecorator implements Food{
    protected Food decoratedFood;

    public FoodDecorator(Food food){
        this.decoratedFood = food;
    }

    @Override
    public double baseCost(){
        return decoratedFood.baseCost();
    }

    @Override
    public String itemName(){
        return decoratedFood.itemName();
    }

}
