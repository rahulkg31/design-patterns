package me.rahul.factory;


public class ShippingFactory {

 public ShippingInterface ship(String type) {
     if (type == null) {
         return null;
     }
     if (type.equalsIgnoreCase("ROAD")) {
         return new Road();
     } else if (type.equalsIgnoreCase("SEA")) {
         return new Sea();
     } else if (type.equalsIgnoreCase("AIR")) {
         return new Air();
     }
     return null;
 }
}
