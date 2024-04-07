package me.rahul.strategy;

public class ShippingContext {
    private ShippingStrategyInterface shippingStrategy;

    public ShippingContext(ShippingStrategyInterface shippingStrategy) {
        this.shippingStrategy = shippingStrategy;
    }

    public void setShippingStrategy(ShippingStrategyInterface shippingStrategy) {
        this.shippingStrategy = shippingStrategy;
    }

    public double calculateShippingCost(double weight) {
        return shippingStrategy.calculateShippingCost(weight);
    }
}