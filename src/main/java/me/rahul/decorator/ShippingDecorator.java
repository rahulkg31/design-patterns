package me.rahul.decorator;

public abstract class ShippingDecorator implements ShippingInterface {
    protected ShippingInterface decoratedShipping;

    public ShippingDecorator(ShippingInterface decoratedShipping) {
        this.decoratedShipping = decoratedShipping;
    }

    @Override
    public double calculateCost() {
        return decoratedShipping.calculateCost();
    }

    @Override
    public String getDescription() {
        return decoratedShipping.getDescription();
    }
}