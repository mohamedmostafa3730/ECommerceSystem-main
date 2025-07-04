package models;

public class ExpiableProduct extends Product implements ShippingItem {
    int expiryDays;

    public ExpiableProduct(String name, double price, int quantity, double weight, boolean requireShipping,
            boolean expired, int expiryDays) {
        super(name, price, quantity, weight, requireShipping, expired);
        this.expiryDays = expiryDays;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public double getWeight() {
        return this.weight;
    }

    public int getExpiryDays() {
        return expiryDays;
    }

    public void setExpiryDays(int expiryDays) {
        this.expiryDays = expiryDays;
    }

}
