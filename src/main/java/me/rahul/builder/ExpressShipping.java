package me.rahul.builder;

public class ExpressShipping implements ShippingMethodInterface {
    @Override
    public double calculateCost(double weight, double width, double height, double depth) {
        return 100.0 * weight + 20 * (width + height + depth); // INR 100 per KG + 20 per cubic inch
    }
}