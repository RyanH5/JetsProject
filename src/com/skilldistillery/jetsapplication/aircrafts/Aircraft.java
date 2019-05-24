package com.skilldistillery.jetsapplication.aircrafts;

public abstract class Aircraft {
	protected String category;
	protected String model;
	protected int inService;
	protected int speed;
	protected int range;
	protected int price;

	public Aircraft() {
		// TODO Auto-generated constructor stub
	}
	
	public Aircraft(String category, String model, int inService, int speed, int range, int price) {
		this.category = category;
		this.model = model;
		this.speed = speed;
		this.range = range;
		this.price = price;
		this.inService = inService;
	}
	
	public abstract void fly();

}
