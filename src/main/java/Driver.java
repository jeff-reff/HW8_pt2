public class Driver {

    public static void main(String[] args) {
        Food burger = new CheeseDecorator(new OnionDecorator(new Burger()));
        Food fries = new CheeseDecorator(new Fries());
        Food hotdog = new HotDogs();

        CustomerOrder order = new CustomerOrder();
        order.addItem(burger);
        order.addItem(fries);
        order.addItem(hotdog);

        double total = order.totalOrderCost();

        LoyaltyStatus member = new LoyaltyStatus(true);
        double discountedTotal = member.applyDiscount(total);

        System.out.println(order.orderedItems());
        System.out.printf("Total with discount: %.2f", discountedTotal);

    }

}
