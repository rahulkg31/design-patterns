package me.rahul.observer;

public class ShippingNotification implements ShippingObserverInterface {
	private String email;

	public ShippingNotification(String email) {
		this.email = email;
	}

	@Override
	public void update(String status) {
        System.out.println("Email sent to " + email + ": Shipment status changed to " + status);
    }
}