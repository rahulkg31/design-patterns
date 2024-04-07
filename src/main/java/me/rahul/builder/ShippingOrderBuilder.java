package me.rahul.builder;

public class ShippingOrderBuilder {
    private String from;
    private String to;
    private double weight;
    private double width;
    private double height;
    private double depth;
    private ShippingMethodInterface shippingMethod;

    public ShippingOrderBuilder(String from, String to) {
        this.setFrom(from);
        this.setTo(to);
    }

    public ShippingOrderBuilder weight(double weight) {
        this.setWeight(weight);
        return this;
    }

    public ShippingOrderBuilder dimensions(double width, double height, double depth) {
        this.setWidth(width);
        this.setHeight(height);
        this.setDepth(depth);
        return this;
    }

    public ShippingOrderBuilder shippingMethod(ShippingMethodInterface shippingMethod) {
        this.setShippingMethod(shippingMethod);
        return this;
    }

    public ShippingOrder build() {
        return new ShippingOrder(this);
    }

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getDepth() {
		return depth;
	}

	public void setDepth(double depth) {
		this.depth = depth;
	}

	public ShippingMethodInterface getShippingMethod() {
		return shippingMethod;
	}

	public void setShippingMethod(ShippingMethodInterface shippingMethod) {
		this.shippingMethod = shippingMethod;
	}
}