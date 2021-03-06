package com.skilldistillery.jetsapplication.aircrafts;

public abstract class Aircraft {
	protected String category;
	protected String model;
	protected int inService;
	protected int speed;
	protected int range;
	protected int price;

	public Aircraft() {}
	
	public Aircraft(String category, String model, int inService, int speed, int range, int price) {
		this.category = category;
		this.model = model;
		this.speed = speed;
		this.range = range;
		this.price = price;
		this.inService = inService;
	}
	
	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getModel() {
		return model;
	}

	@Override
	public String toString() {
		return "\n Aircraft [category=" + category + ", model=" + model + ", inService=" + inService + ", speed=" + speed
				+ ", range=" + range + ", price=" + price + "]";
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getInService() {
		return inService;
	}

	public void setInService(int inService) {
		this.inService = inService;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public int getRange() {
		return range;
	}

	public void setRange(int range) {
		this.range = range;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String fly() {
		double flightTimeLong = (double)range / (double)speed;
		double flightTime = (double) Math.round(flightTimeLong * 1000d) / 1000d;
		return "At " + speed + " mph the " + model + " can fly for " + flightTime + " hours given the range of " + range;
	}

}
