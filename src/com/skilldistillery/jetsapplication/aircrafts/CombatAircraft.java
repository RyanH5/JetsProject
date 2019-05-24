package com.skilldistillery.jetsapplication.aircrafts;

public class CombatAircraft extends Aircraft implements ShootGun, DropBomb{

	public CombatAircraft() {
		// TODO Auto-generated constructor stub
	}
	public CombatAircraft(String category, String model, int speed, int range, int price, int inService) {
		this.category = category;
		this.model = model;
		this.speed = speed;
		this.range = range;
		this.price = price;
		this.inService = inService;
	}
	@Override
	public void dropBom() {
		// TODO Auto-generated method stub
		
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
