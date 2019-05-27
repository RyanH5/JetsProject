package com.skilldistillery.jetsapplication.aircrafts;

import java.util.*;

public class Airfield {

	private List<Aircraft> aircrafts = new ArrayList<>();

	public Airfield(List<Aircraft> aircrafts) {
		// TODO Auto-generated constructor stub
		this.aircrafts = aircrafts;
	}
	
	public Airfield() {}

	public List<Aircraft> getAircrafts() {
		return aircrafts;
	}

	public void setAircrafts(List<Aircraft> aircrafts) {
		this.aircrafts = aircrafts;
	}

	@Override
	public String toString() {
		return "Airfield [aircrafts=" + aircrafts + "]";
	}

}
