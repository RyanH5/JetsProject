package com.skilldistillery.jetsapplication.aircrafts;

public class Helicopter extends Aircraft implements ShootGun{

	public Helicopter() {};
	
	public Helicopter(String category, String model, int speed, int range, int price, int inService) {
		this.category = category;
		this.model = model;
		this.speed = speed;
		this.range = range;
		this.price = price;
		this.inService = inService;
	}
	
	public void schwarzeneggerCall() {
		System.out.println("GET TO THE CHOPPA");
	}

	@Override
	public void shootGun() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		
	}

}
