import java.util.ArrayList;
import java.util.List;

public class CustomerOrder {

    private List<Food> order = new ArrayList<>();

    public void addItem(Food food) {
        order.add(food);
    }

    public double totalOrderCost(){
        double total = 0.00;

        for (Food item : order){
            total += item.baseCost();
        }

        return total;
    }

    public String orderedItems(){
        return "";
    }

}
