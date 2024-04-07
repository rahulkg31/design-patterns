package me.rahul.facade;

public class ShippingFacade {
    private ShippingServiceInterface bluedartShippingService;
    private ShippingServiceInterface dtdcShippingService;

    public ShippingFacade() {
    	bluedartShippingService = new BluedartShippingService();
    	dtdcShippingService = new DTDCShippingService();
    }

    public double calculateShippingCost(String service, double weight) {
        if ("BLUEDART".equalsIgnoreCase(service)) {
            return bluedartShippingService.calculateShippingCost(weight);
        } else if ("DTDC".equalsIgnoreCase(service)) {
            return dtdcShippingService.calculateShippingCost(weight);
        } else {
            throw new IllegalArgumentException("Invalid shipping service");
        }
    }

    public String generateShippingLabel(String service, String recipient) {
        if ("BLUEDART".equalsIgnoreCase(service)) {
            return bluedartShippingService.generateShippingLabel(recipient);
        } else if ("DTDC".equalsIgnoreCase(service)) {
            return dtdcShippingService.generateShippingLabel(recipient);
        } else {
            throw new IllegalArgumentException("Invalid shipping service");
        }
    }

    public String trackShipment(String service, String trackingNumber) {
        if ("BLUEDART".equalsIgnoreCase(service)) {
            return bluedartShippingService.trackShipment(trackingNumber);
        } else if ("DTDC".equalsIgnoreCase(service)) {
            return dtdcShippingService.trackShipment(trackingNumber);
        } else {
            throw new IllegalArgumentException("Invalid shipping service");
        }
    }
}