package me.rahul.adapter;

public class BluedartAdapter implements NewShippingInterface {
    private Bluedart bluedart;

    public BluedartAdapter(Bluedart bluedart) {
        this.bluedart = bluedart;
    }

    @Override
    public double calculateShippingCost(double weight, String destination, double discount) {
        return bluedart.calculateShippingCost(weight, destination) * ((100.0 - discount)/100.0);
    }
}