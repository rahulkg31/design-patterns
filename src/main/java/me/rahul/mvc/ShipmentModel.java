package me.rahul.mvc;

public class ShipmentModel {
    private String trackingNumber;
    private String status;
    private double cost;

    public ShipmentModel(String trackingNumber, String status, double cost) {
        this.setTrackingNumber(trackingNumber);
        this.setStatus(status);
        this.setCost(cost);
    }

	public String getTrackingNumber() {
		return trackingNumber;
	}

	public void setTrackingNumber(String trackingNumber) {
		this.trackingNumber = trackingNumber;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}
    
}