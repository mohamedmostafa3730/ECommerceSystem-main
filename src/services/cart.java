package services;
import java.util.ArrayList;
import java.util.List;

import models.Product;
import models.ShippingItem;

public class cart {
    List<Product> products = new ArrayList<>();
    List<Integer> quantities = new ArrayList<>();

    public void addProduct(Product product, int quantity) {
        if (product.expired) {
            System.out.println("Error: Product " + product.name + " is expired and cannot be added to the cart.");
            return;
        }
        if (quantity > product.quantity) {
            System.out.println("Error: Not enough stock available for " + product.name);
            return;
        }
        products.add(product);
        quantities.add(quantity);
        product.quantity -= quantity; // Reduce stock

    }

    public double getOrderSubtotal() {
        double subtotal = 0;
        for (int i = 0; i < products.size(); i++) {
            subtotal += products.get(i).price * quantities.get(i);
        }
        return subtotal;
    }

    public double getShippingFees() {
        double shippingTotal = 0;
        for (Product product : products) {
            shippingTotal += product.getShippingFees();
        }
        return shippingTotal;
    }

    public double getTotal() {
        return getOrderSubtotal() + getShippingFees();
    }

    public List<ShippingItem> getShippingItems() {
        List<ShippingItem> shippingItems = new ArrayList<>();
        for (Product product : products) {
            if (product.requireShipping && product instanceof ShippingItem) {
                shippingItems.add((ShippingItem) product);
            }
        }
        return shippingItems;
    }

    public boolean isEmpty() {
        return products.isEmpty();
    }
}
