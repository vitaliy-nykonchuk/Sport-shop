package sport_shop.demo;

import sport_shop.order.Order;
import sport_shop.order.OrderBuilder;

public class SportShopDemo {
    public static void main(String[] args) {
        OrderBuilder orderBuilder = new OrderBuilder();

        Order orderA = orderBuilder.prepareOrderA();
        System.out.println("Order A");
        orderA.showItems();
        System.out.println("Total Cost: " + orderA.getTotalCost());

        Order orderB = orderBuilder.prepareOrderB();
        System.out.println("\nOrder B");
        orderB.showItems();
        System.out.println("Total Cost: " + orderB.getTotalCost());
    }
}
