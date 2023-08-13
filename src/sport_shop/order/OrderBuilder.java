package sport_shop.order;

import sport_shop.model.Brand;
import sport_shop.model.Cap;
import sport_shop.model.TShirt;

public class OrderBuilder {
    public Order prepareOrderA() {
        Order order = new Order();
        order.addItem(new TShirt("Red", new Brand(), 20.0f));
        order.addItem(new Cap("White", new Brand(), 10.0f));
        return order;
    }

    public Order prepareOrderB() {
        Order order = new Order();
        order.addItem(new TShirt("Blue", new Brand(), 25.0f));
        order.addItem(new Cap("Black", new Brand(), 15.0f));
        return order;
    }
}
