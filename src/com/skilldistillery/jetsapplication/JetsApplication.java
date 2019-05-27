package com.skilldistillery.jetsapplication;

import java.io.*;
import java.util.*;

import com.skilldistillery.jetsapplication.aircrafts.*;

public class JetsApplication {
	private Airfield airfield = new Airfield();
	private boolean gameOver = false;

	public JetsApplication() {
	}

	public static void main(String[] args) {
		JetsApplication app = new JetsApplication();
		String fileName = "./aircrafts.txt";
		app.launch(fileName);
		Scanner kb = new Scanner(System.in);
		while (!app.gameOver) {
			app.userInteraction(kb);
		}
		kb.close();
	}

	public void launch(String fileName) {
		readAircraftData(fileName);
	}

	public void readAircraftData(String fileName) {
		BufferedReader br = null;
		String[] aircraftData = null;
		String line;
		try {
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
		switch (category) {
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
		case "Transport":
			craft = new Transport(category, model, inServiceQuant, speed, range, price);
			break;
		case "Helicopter":
			craft = new Helicopter(category, model, inServiceQuant, speed, range, price);
			break;

		}
		return craft;
	}

	public void userInteraction(Scanner kb) {
		presentMenu();
		int userChoice = kb.nextInt();
		runUserSelectedMethod(userChoice, kb);
	}

	public void presentMenu() {
		spaceForMenu();
		System.out.println("1. List fleet");
		System.out.println("2. Fly all aircrafts");
		System.out.println("3. View aircraft with longest range");
		System.out.println("4. View the fastest aircraft");
		System.out.println("5. Shoot gun");
		System.out.println("6. Add an aircraft to the fleet");
		System.out.println("7. Remove an aircraft from the fleet");
		System.out.println("8. Drop bom");
		System.out.println("9. Load all Cargo aircrafts");
		System.out.println("10. Quit");
	}
	
	public void spaceForMenu() {
		System.out.println();
		System.out.println();
	}

	public void runUserSelectedMethod(int userChoice, Scanner kb) {
		switch (userChoice) {
		case 1:
			System.out.println(airfield.toString());
			break;
		case 2:
			flyAllJets();
			break;
		case 3:
			longestRangeAircraft();
			break;
		case 4:
			fastestAircraft();
			break;
		case 7: 
			removeAnAircraft(kb);
			break;
		}
	}

	public void flyAllJets() {
		for (Aircraft ac : airfield.getAircrafts()) {
			System.out.println(ac.fly());
		}
	}

	public void fastestAircraft() {
		int fastest = 0;
		for (Aircraft ac : airfield.getAircrafts()) {
			fastest = Math.max(fastest, ac.getSpeed());
		}
		String fastestJet = "";
		for (Aircraft ac : airfield.getAircrafts()) {
			if (ac.getSpeed() == fastest) {
				fastestJet = ac.toString();
			}

		}
		System.out.println("Fastest jet specs:");
		System.out.println(fastestJet);
	}

	public void longestRangeAircraft() {
		int longest = 0;
		for (Aircraft ac : airfield.getAircrafts()) {
			longest = Math.max(longest, ac.getRange());
		}
		String longestJet = "";
		for (Aircraft ac : airfield.getAircrafts()) {
			if (ac.getRange() == longest) {
				longestJet = ac.toString();
			}

		}
		System.out.println("Longest range jet specs:");
		System.out.println(longestJet);
	}
	
//	NOT WORKING YET *********************************************
	public void shootEmIfYaGotEm() {
		for (Aircraft ac : airfield.getAircrafts()) {
			if (ac.getCategory() == "Helicopter") {
				
			}
		}
	}
//	***************************************************************
	
	public void removeAnAircraft(Scanner kb) {
		System.out.println("Which aircraft do you wish to remove?");
		for (int i = 0; i < airfield.getAircrafts().size(); i++) {
			System.out.println(i + ": " + airfield.getAircrafts().get(i).getModel());
		}
		int aircraftToRemove = kb.nextInt();
		airfield.getAircrafts().remove(aircraftToRemove);
	}
	
}
