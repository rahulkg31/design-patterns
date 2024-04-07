package me.rahul.observer;

public interface ShippingSubjectInterface {
	public void registerObserver(ShippingObserverInterface observer);
	public void removeObserver(ShippingObserverInterface observer);
	public void notifyObservers(String status);
}
