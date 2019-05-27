package com.skilldistillery.jetsapplication;

import java.io.*;
//import java.util.*;

import com.skilldistillery.jetsapplication.aircrafts.*;

public class JetsApplication {
	Airfield airfield = new Airfield();
	public JetsApplication() {
	}

	public static void main(String[] args) {
		JetsApplication app = new JetsApplication();
		String fileName = "./aircrafts.txt";
		app.launch(fileName);

	}

	public void launch(String fileName) {
		readAircraftData(fileName);
	}

	public void readAircraftData(String fileName) {
		BufferedReader br = null;
		String[] aircraftData = null;
		String line;
		try {
			Airfield airfield = new Airfield();
			br = new BufferedReader(new FileReader(fileName));
			while ((line = br.readLine()) != null) {
				aircraftData = line.split(", ");
				Aircraft ac = createAircrafts(aircraftData);
				airfield.getAircrafts().add(ac);
				
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public Aircraft createAircrafts(String[] aircraft) {
		String category = aircraft[0];
		String model = aircraft[1];
		int inServiceQuant = Integer.parseInt(aircraft[2]);
		int speed = Integer.parseInt(aircraft[3]);
		int range = Integer.parseInt(aircraft[4]);
		int price = Integer.parseInt(aircraft[5]);
		Aircraft craft = null;
			switch(category) {
			case "Combat Aircraft":
				craft = new CombatAircraft(category, model, inServiceQuant, speed, range, price);
				break;
			case "Airborne early warning and control":
				craft = new AirbornEarlyWarningControl(category, model, inServiceQuant, speed, range, price);
				break;
			case "Maritime Patrol":
			craft = new MaritimePatrol(category, model, inServiceQuant, speed, range, price);
			break;
			case "Electronic Warfare":
				craft = new ElectronicWarfare(category, model, inServiceQuant, speed, range, price);
				break;
			case "Trainer":
				craft = new Trainer(category, model, inServiceQuant, speed, range, price);
				break;
			case "Transport":
			craft = new Transport(category, model, inServiceQuant, speed, range, price);
			break;
			case "Helicopter":
				craft = new Helicopter(category, model, inServiceQuant, speed, range, price);
				break;
				
			}
		return craft;
	}
	

	public void presentMenu() {
		System.out.println("1. List fleet");
		System.out.println("2. Fly all aircrafts");
		System.out.println("3. View aircraft with longest range");
		System.out.println("4. Load all Cargo aircrafts");
		System.out.println("5. Shoot gun");
		System.out.println("6. Add an aircraft to the fleet");
		System.out.println("7. Remove an aircraft from the fleet");
		System.out.println("8. Drop bom");
		System.out.println("9. Quit");
		System.out.println("10. Dogfight!");
	}



}
