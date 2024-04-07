package me.rahul.strategy;

public class ExpressShippingStrategy implements ShippingStrategyInterface {
    @Override
    public double calculateShippingCost(double weight) {
        return 150.0 * weight;
    }
}