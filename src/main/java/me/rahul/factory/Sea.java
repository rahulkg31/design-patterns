package me.rahul.factory;

public class Sea implements ShippingInterface {
 @Override
 public void ship() {
     System.out.println("Shipping by Sea");
 }
}

