package me.rahul.factory;

public class Road implements ShippingInterface {
    @Override
    public void ship() {
        System.out.println("Shipping by Road");
    }
}
