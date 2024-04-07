package me.rahul.facade;

public interface ShippingServiceInterface {
    public double calculateShippingCost(double weight);
    public String generateShippingLabel(String recipient);
    public String trackShipment(String trackingNumber);
}