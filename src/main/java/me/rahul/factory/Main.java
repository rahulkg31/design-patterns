package me.rahul.factory;

public class Main {
    public static void main(String[] args) {
        ShippingFactory factory = new ShippingFactory();

        ShippingInterface road = factory.ship("ROAD");
        road.ship();

        ShippingInterface sea = factory.ship("SEA");
        sea.ship();

        ShippingInterface air = factory.ship("AIR");
        air.ship();
    }
}
