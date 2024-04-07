package me.rahul.decorator;

public class ShippingOrder extends ShippingDecorator {
 private boolean isExpress;

 public ShippingOrder(ShippingInterface decoratedShipping, boolean isExpress) {
     super(decoratedShipping);
     this.isExpress = isExpress;
 }

 @Override
 public double calculateCost() {
     double cost = super.calculateCost();
     if (isExpress()) {
         cost += 50.0;
     }
     return cost;
 }

 @Override
 public String getDescription() {
     return super.getDescription() + (isExpress ? " + with Express" : "");
 }

 public boolean isExpress() {
     return isExpress;
 }
}
