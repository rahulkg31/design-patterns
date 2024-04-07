package me.rahul.observer;

import java.util.ArrayList;
import java.util.List;

public class ShipmentTracker implements ShippingSubjectInterface {
    private String shipmentStatus;
    private List<ShippingObserverInterface> observers;

    public ShipmentTracker() {
        observers = new ArrayList<>();
    }

    public void setShipmentStatus(String shipmentStatus) {
        this.shipmentStatus = shipmentStatus;
        notifyObservers(shipmentStatus);
    }

    @Override
    public void registerObserver(ShippingObserverInterface observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(ShippingObserverInterface observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(String status) {
        for (ShippingObserverInterface observer : observers) {
            observer.update(status);
        }
    }
}
