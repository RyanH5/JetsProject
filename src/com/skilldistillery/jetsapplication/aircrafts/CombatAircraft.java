package com.skilldistillery.jetsapplication.aircrafts;

public class CombatAircraft extends Aircraft implements ShootGun, DropBomb{

	public CombatAircraft() {
		// TODO Auto-generated constructor stub
	}
	public CombatAircraft(String category, String model, int inService, int speed, int range, int price) {
		super(category, model, inService, speed, range, price);
		// TODO Auto-generated constructor stub
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
