package sport_shop.model;

public class Cap implements Item {
    private final String color;
    private final Manufacturer manufacturer;
    private final float price;

    public Cap(String color, Manufacturer manufacturer, float price) {
        this.color = color;
        this.manufacturer = manufacturer;
        this.price = price;
    }

    @Override
    public String getName() {
        return "Cap";
    }

    @Override
    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public float getPrice() {
        return price;
    }
}
