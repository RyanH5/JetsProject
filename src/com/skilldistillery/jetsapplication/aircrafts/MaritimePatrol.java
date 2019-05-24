package com.skilldistillery.jetsapplication.aircrafts;

public class MaritimePatrol extends Aircraft implements DropBomb{

	public MaritimePatrol() {
		// TODO Auto-generated constructor stub
	}
	
	public MaritimePatrol(String category, String model, int inService, int speed, int range, int price) {
		super(category, model, inService, speed, range, price);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dropBom() {
		// TODO Auto-generated method stub
		
	}
	
	public void findMines() {
		System.out.println("Great job detecting that mine.");
	}

}
