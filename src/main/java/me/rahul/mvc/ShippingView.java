package me.rahul.mvc;

public class ShippingView {
    public void displayShipmentDetails(ShipmentModel shipment) {
        System.out.println("Shipment Details:");
        System.out.println("Tracking Number: " + shipment.getTrackingNumber());
        System.out.println("Status: " + shipment.getStatus());
        System.out.println("Cost: INR" + shipment.getCost());
    }
}