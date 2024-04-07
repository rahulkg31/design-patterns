package me.rahul.adapter;

public class Main {
    public static void main(String[] args) {
        Bluedart bluedart = new Bluedart();
        BluedartAdapter bluedartAdapter = new BluedartAdapter(bluedart);

        double cost = bluedartAdapter.calculateShippingCost(10.0, "New Delhi", 10.0);
        System.out.println("Shipping cost via Bluedart: INR " + cost);
    }
}