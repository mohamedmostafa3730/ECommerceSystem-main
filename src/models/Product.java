package models;
public abstract class Product {
    public String name;
    public double price;
    public int quantity;
    double weight;
    public boolean requireShipping;
    public boolean expired;

    public Product(String name, double price, int quantity, double weight, boolean requireShipping, boolean expired) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.weight = weight;
        this.requireShipping = requireShipping;
        this.expired = expired;
    }

    public double getShippingFees() {
        if (requireShipping) {
            return 30.00;
        } else {
            return 0.00;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public boolean isExpired() {
        return expired;
    }

    public void setExpired(boolean expired) {
        this.expired = expired;
    }

}