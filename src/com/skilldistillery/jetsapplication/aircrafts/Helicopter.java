package com.skilldistillery.jetsapplication.aircrafts;

public class Helicopter extends Aircraft implements ShootGun, TransportPeople{

	public Helicopter() {};
	
	public Helicopter(String category, String model, int inService, int speed, int range, int price) {
		super(category, model, inService, speed, range, price);
		// TODO Auto-generated constructor stub
	}
	
	public void schwarzeneggerCall() {
		System.out.println("GET TO THE CHOPPA");
	}

	@Override
	public void shootGun() {
		// TODO Auto-generated method stub
		
	}

//	@Override
//	public void fly() {
//		// TODO Auto-generated method stub
//		
//	}

	@Override
	public void transportPeople() {
		// TODO Auto-generated method stub
		
	}

}
