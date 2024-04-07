package me.rahul.strategy;

public class StandardShippingStrategy implements ShippingStrategyInterface {
    @Override
    public double calculateShippingCost(double weight) {
        return 100.0 * weight;
    }
}