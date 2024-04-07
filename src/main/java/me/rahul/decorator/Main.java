package me.rahul.decorator;

public class Main {
	public static void main(String[] args) {
		ShippingInterface shipping = new BaseShippingOrder();
		System.out.println("Cost: INR" + shipping.calculateCost() + ", Description: " + shipping.getDescription());

		shipping = new ShippingOrder(shipping, true);
		System.out.println("Cost: INR" + shipping.calculateCost() + ", Description: " + shipping.getDescription());
	}
}
