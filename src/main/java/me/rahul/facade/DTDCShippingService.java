package me.rahul.facade;

public class DTDCShippingService implements ShippingServiceInterface {
    @Override
    public double calculateShippingCost(double weight) {
        return 250.0 * weight;
    }

    @Override
    public String generateShippingLabel(String recipient) {
        return "DTDC Shipping Label for " + recipient;
    }

    @Override
    public String trackShipment(String trackingNumber) {
        return "DTDC Tracking Information for " + trackingNumber;
    }
}