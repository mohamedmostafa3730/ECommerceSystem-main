package models;

public class NonExpiableProduct extends Product implements ShippingItem {

    public NonExpiableProduct(String name, double price, int quantity, double weight, boolean requireShipping,
            boolean expired) {
        super(name, price, quantity, weight, requireShipping, expired);
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public double getWeight() {
        return this.weight;
    }

}
