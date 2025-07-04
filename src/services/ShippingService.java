package services;
import java.util.List;
import models.ShippingItem;

public class ShippingService {
    public static void shipItems(List<ShippingItem> items) {
        System.out.println("Shipping the following items:");
        for (ShippingItem item : items) {
            System.out.println("- " + item.getName() + " (Weight: " + item.getWeight() + "kg)");
        }
    }
}
