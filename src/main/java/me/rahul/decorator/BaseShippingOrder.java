package me.rahul.decorator;

public class BaseShippingOrder implements ShippingInterface{
	@Override
    public double calculateCost() {
        return 100.0;
    }

    @Override
    public String getDescription() {
        return "Normal shipping charges";
    }
}
