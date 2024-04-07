package me.rahul.mvc;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<ShipmentModel> shipments = new ArrayList<>();

        ShippingView view = new ShippingView();

        ShippingController controller = new ShippingController(shipments, view);

        controller.addShipment("123456", "In Transit", 100.0);
        controller.addShipment("789012", "Delivered", 150.0);

        controller.displayShipmentDetails(0);
        controller.displayShipmentDetails(1);

        controller.updateShipmentStatus(0, "Delivered");
        controller.displayShipmentDetails(0);
	}
}
