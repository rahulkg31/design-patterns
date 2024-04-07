package me.rahul.facade;

public class Main {
	 public static void main(String[] args) {
	        ShippingFacade shippingFacade = new ShippingFacade();

	        double shippingCost = shippingFacade.calculateShippingCost("BLUEDART", 2.5);
	        System.out.println("Bluedart Shipping Cost: INR " + shippingCost);

	        String shippingLabel = shippingFacade.generateShippingLabel("DTDC", "Rahul");
	        System.out.println("DTDC Shipping Label: " + shippingLabel);


	        String trackingInfo = shippingFacade.trackShipment("BLUEDART", "123456789");
	        System.out.println("Bluedart Tracking Information: " + trackingInfo);
	    }
}