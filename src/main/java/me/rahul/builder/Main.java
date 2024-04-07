package me.rahul.builder;

public class Main {
 public static void main(String[] args) {
     ShippingOrder order = new ShippingOrderBuilder("Mumbai", "New Delhi")
             .weight(3.5)
             .dimensions(15.0, 25.0, 35.0)
             .shippingMethod(new ExpressShipping())
             .build();

     System.out.println("Shipping Order: " + order);
 }
}
