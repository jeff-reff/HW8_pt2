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
        String receipt = "";
        for (Food item : order){
            receipt = receipt.concat(item.itemName());
            if (order.indexOf(item) < order.size() - 1) {
                receipt = receipt.concat(" & ");
            }

        }
        return receipt;
    }


}
