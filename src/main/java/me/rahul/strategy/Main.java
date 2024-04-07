package me.rahul.strategy;

public class Main {
    public static void main(String[] args) {
        ShippingContext shippingContext = new ShippingContext(new StandardShippingStrategy());
        double standardShippingCost = shippingContext.calculateShippingCost(2.0);
        System.out.println("Standard shipping cost: INR " + standardShippingCost);

        shippingContext.setShippingStrategy(new ExpressShippingStrategy());
        double expressShippingCost = shippingContext.calculateShippingCost(2.0);
        System.out.println("Express shipping cost: INR " + expressShippingCost);
    }
}