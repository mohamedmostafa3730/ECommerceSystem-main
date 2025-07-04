import models.Customer;
import models.ExpiableProduct;
import models.NonExpiableProduct;
import services.Order;

public class ECommerceSystem {
    public static void main(String[] args) throws Exception {
        System.out.println("\n");
        ExpiableProduct cheese = new ExpiableProduct("Cheese", 10.0, 5, 200, true, false, 20);
        ExpiableProduct expiredBiscuits = new ExpiableProduct("Expired Biscuits", 5.0, 20, 100, true, true, 10);
        NonExpiableProduct tv = new NonExpiableProduct("tv", 10000.00, 20, 50000, true, false);
        NonExpiableProduct mobile = new NonExpiableProduct("mobile", 7000.00, 10, 500, true, false);

        Customer customer = new Customer(1000000);

        customer.cart.addProduct(cheese, 2);
        // customer.cart.addProduct(tv, 1);

        Order.checkout(customer);
    }
}
