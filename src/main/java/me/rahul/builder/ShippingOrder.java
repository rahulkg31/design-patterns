package me.rahul.builder;

public class ShippingOrder {
 private String from;
 private String to;
 private double weight;
 private double width;
 private double height;
 private double depth;
 private ShippingMethodInterface shippingMethod;

 public ShippingOrder(ShippingOrderBuilder builder) {
     this.from = builder.getFrom();
     this.to = builder.getTo();
     this.weight = builder.getWeight();
     this.width = builder.getWidth();
     this.height = builder.getHeight();
     this.depth = builder.getDepth();
     this.shippingMethod = builder.getShippingMethod();
 }

 @Override
 public String toString() {
     return "ShippingOrder{" +
             "from='" + from + '\'' +
             ", to='" + to + '\'' +
             ", weight=" + weight +
             ", width=" + width +
             ", height=" + height +
             ", depth=" + depth +
             ", shippingMethod=" + shippingMethod +
             '}';
 }
}
