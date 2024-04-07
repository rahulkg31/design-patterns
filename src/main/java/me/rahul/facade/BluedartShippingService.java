package me.rahul.facade;

public class BluedartShippingService implements ShippingServiceInterface {
    @Override
    public double calculateShippingCost(double weight) {
        return 200.0 * weight;
    }

    @Override
    public String generateShippingLabel(String recipient) {
        return "Bluedart Shipping Label for " + recipient;
    }

    @Override
    public String trackShipment(String trackingNumber) {
        return "Bluedart Tracking Information for " + trackingNumber;
    }
}