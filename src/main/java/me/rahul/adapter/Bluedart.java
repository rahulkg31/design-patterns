package me.rahul.adapter;

public class Bluedart implements ExistingShippingInterface {
    @Override
    public double calculateShippingCost(double weight, String destination) {
        return 100.0 * weight; // INR 100 per KG
    }
}