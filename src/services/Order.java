package services;

import models.Customer;

public class Order {
    public static void checkout(Customer customer) {
        if (customer.cart.isEmpty()) {
            System.out.println("Error: Cart is empty. Please add items before checkout.");
            return;
        }
        double subtotal = customer.cart.getOrderSubtotal();
        double shippingFees = customer.cart.getShippingFees();
        double total = subtotal + shippingFees;

        if (customer.balance < total) {
            System.out.println("Error: Insufficient balance.");
            return;
        }

        customer.balance -= total;
        System.out.println("Checkout Details:");
        System.out.println("Order Subtotal: EGP " + subtotal);
        System.out.println("Shipping Fees: EGP " + shippingFees);
        System.out.println("Paid Amount: EGP " + total);
        System.out.println("Remaining Balance: EGP " + customer.balance);

        ShippingService.shipItems(customer.cart.getShippingItems());
    }
}
