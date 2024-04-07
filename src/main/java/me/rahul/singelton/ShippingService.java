package me.rahul.singelton;

public class ShippingService {
    private static ShippingService instance;

    private ShippingService() {
    }
    
    public static ShippingService getInstance() {
        if (instance == null) {
            instance = new ShippingService();
        }
        return instance;
    }

    public double calculateShippingCost(String destination, double weight) {
        return 10.0;
    }
}
