package models;
import services.cart;

public class Customer {
    public double balance;
    public cart cart;

    public Customer(double balance) {
        this.balance = balance;
        this.cart = new cart();
    }
}
