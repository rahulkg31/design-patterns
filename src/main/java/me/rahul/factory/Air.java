package me.rahul.factory;

public class Air implements ShippingInterface {
    @Override
    public void ship() {
        System.out.println("Shipping by Air");
    }
}
