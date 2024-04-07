package me.rahul.mvc;

import java.util.List;

public class ShippingController {
    private List<ShipmentModel> shipments;
    private ShippingView view;

    public ShippingController(List<ShipmentModel> shipments, ShippingView view) {
        this.shipments = shipments;
        this.view = view;
    }

    public void addShipment(String trackingNumber, String status, double cost) {
    	ShipmentModel shipment = new ShipmentModel(trackingNumber, status, cost);
        shipments.add(shipment);
    }

    public void updateShipmentStatus(int index, String newStatus) {
        if (index >= 0 && index < shipments.size()) {
        	ShipmentModel shipment = shipments.get(index);
            shipment.setStatus(newStatus);
        }
    }

    public void displayShipmentDetails(int index) {
        if (index >= 0 && index < shipments.size()) {
        	ShipmentModel shipment = shipments.get(index);
            view.displayShipmentDetails(shipment);
        } else {
            System.out.println("Invalid shipment index.");
        }
    }
}