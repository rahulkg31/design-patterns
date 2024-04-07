package me.rahul.observer;

public class Main {
    public static void main(String[] args) {
        ShipmentTracker shipmentTracker = new ShipmentTracker();
        ShippingNotification observer1 = new ShippingNotification("123@gmail.com");
        shipmentTracker.registerObserver(observer1);
        ShippingNotification observer2 = new ShippingNotification("abc@gmail.com");
        shipmentTracker.registerObserver(observer2);
        shipmentTracker.setShipmentStatus("In Transit");
    }
}