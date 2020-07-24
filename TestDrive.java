package edu.nyu.cs.jhp489;

import java.util.Scanner;
import java.util.Random;

/**
 * Program to drive a virtual Moped in NYC
 * @author jhp489
 *
 */
public class TestDrive {

/**
 * drive when the Moped is facing forward
 * @param direction - where is the Moped pointing at
 * @param input - command to decide what to do
 * @param moped - which moped object will be used
 */
	public static void driveForward(String direction, String input, Moped moped) {
		if (direction.equals("South")) {
			switch(input) {
			case "go left":
				if (moped.setAvenue(moped.getAvenue() - 1)) {				// check if the move is valid or not
				moped.setGas(moped.getGas() - 0.05);
				moped.setDirection("East");
				}
				break;
			case "go right":
				if (moped.setAvenue(moped.getAvenue() + 1)) {
				moped.setGas(moped.getGas() - 0.05);
				moped.setDirection("West");
				}
				break;
			case "straight on":
				if (moped.setStreet(moped.getStreet() - 1)) {
				moped.setGas(moped.getGas() - 0.05);
				moped.setIsBack(false);
				}
				break;
			case "back up":
				if(moped.setStreet(moped.getStreet() + 1)) {
				moped.setGas(moped.getGas() - 0.05);
				moped.setIsBack(true);
				}
				break;	
			}
			} else if (direction.equals("North")) {
				switch(input) {
				case "go left":
					if (moped.setAvenue(moped.getAvenue() + 1)) {
					moped.setGas(moped.getGas() - 0.05);
					moped.setDirection("West");
					}
					break;
				case "go right":
					if (moped.setAvenue(moped.getAvenue() - 1)) {
					moped.setGas(moped.getGas() - 0.05);
					moped.setDirection("East");
					}
					break;
				case "straight on":
					if (moped.setStreet(moped.getStreet() + 1)) {
					moped.setGas(moped.getGas() - 0.05);
					moped.setIsBack(false);
					}
					break;
				case "back up":
					if (moped.setStreet(moped.getStreet() - 1)) {
					moped.setGas(moped.getGas() - 0.05);
					moped.setIsBack(true);
					}
					break;	
			}
			} else if (direction.equals("East")) {
				switch(input) {
				case "go left":
					if (moped.setStreet(moped.getStreet() + 1)) {
					moped.setGas(moped.getGas() - 0.05);
					moped.setDirection("South");
					}
					break;
				case "go right":
					if (moped.setStreet(moped.getStreet() - 1)) {
					moped.setGas(moped.getGas() - 0.05);
					moped.setDirection("North");
					}
					break;
				case "straight on":
					if (moped.setAvenue(moped.getAvenue() - 1)) {
					moped.setGas(moped.getGas() - 0.05);
					moped.setIsBack(false);
					}
					break;
				case "back up":
					if (moped.setAvenue(moped.getAvenue() + 1)) {
					moped.setGas(moped.getGas() - 0.05);
					moped.setIsBack(true);
					}
					break;	
			
			}
			} else {
				switch(input) {
				case "go left":
					if (moped.setStreet(moped.getStreet() + 1)) {
					moped.setGas(moped.getGas() - 0.05);
					moped.setDirection("South");
					}
					break;
				case "go right":
					if (moped.setStreet(moped.getStreet() - 1)) {
					moped.setGas(moped.getGas() - 0.05);
					moped.setDirection("North");
					}
					break;
				case "straight on":
					if (moped.setAvenue(moped.getAvenue() + 1)) {
					moped.setGas(moped.getGas() - 0.05);
					moped.setIsBack(false);
					}
					break;
				case "back up":
					if (moped.setAvenue(moped.getAvenue() - 1)) {
					moped.setGas(moped.getGas() - 0.05);
					moped.setIsBack(true);
					}
					break;
				}
			}
		
	}
	
/**
 * method to drive when the moped is facing backwards
 * @param direction - where is the Moped pointing at
 * @param input - command to decide what to do
 * @param moped - which moped object will be used
 */
	public static void driveBackward(String direction, String input, Moped moped) {
		if (direction.equals("South")) {
			switch(input) {
			case "go left":
				if (moped.setAvenue(moped.getAvenue() - 1)) {				// check if the move is valid or not
				moped.setGas(moped.getGas() - 0.05);
				moped.setDirection("West");
				}
				break;
			case "go right":
				if (moped.setAvenue(moped.getAvenue() + 1)) {
				moped.setGas(moped.getGas() - 0.05);
				moped.setDirection("East");
				}
				break;
			case "straight on":
				if (moped.setStreet(moped.getStreet() - 1)) {
				moped.setGas(moped.getGas() - 0.05);
				moped.setIsBack(false);
				}
				break;
			case "back up":
				if (moped.setStreet(moped.getStreet() + 1)) {
				moped.setGas(moped.getGas() - 0.05);
				moped.setIsBack(true);
				}
				break;	
			}
			} else if (direction.equals("North")) {
				switch(input) {
				case "go left":
					if (moped.setAvenue(moped.getAvenue() + 1)) {
					moped.setGas(moped.getGas() - 0.05);
					moped.setDirection("East");
					}
					break;
				case "go right":
					if (moped.setAvenue(moped.getAvenue() - 1)) {
					moped.setGas(moped.getGas() - 0.05);
					moped.setDirection("West");
					}
					break;
				case "straight on":
					if (moped.setStreet(moped.getStreet() + 1)) {
					moped.setGas(moped.getGas() - 0.05);
					moped.setIsBack(false);
					}
					break;
				case "back up":
					if (moped.setStreet(moped.getStreet() - 1)) {
					moped.setGas(moped.getGas() - 0.05);
					moped.setIsBack(true);
					}
					break;	
			}
			} else if (direction.equals("East")) {
				switch(input) {
				case "go left":
					if (moped.setStreet(moped.getStreet() + 1)) {
					moped.setGas(moped.getGas() - 0.05);
					moped.setDirection("South");
					}
					break;
				case "go right":
					if (moped.setStreet(moped.getStreet() - 1)) {
					moped.setGas(moped.getGas() - 0.05);
					moped.setDirection("North");
					}
					break;
				case "straight on":
					if (moped.setAvenue(moped.getAvenue() - 1)) {
					moped.setGas(moped.getGas() - 0.05);
					moped.setIsBack(false);
					}
					break;
				case "back up":
					if (moped.setAvenue(moped.getAvenue() + 1)) {
					moped.setGas(moped.getGas() - 0.05);
					moped.setIsBack(true);
					}
					break;	
			
			}
			} else {
				switch(input) {
				case "go left":
					if (moped.setStreet(moped.getStreet() - 1)) {
					moped.setGas(moped.getGas() - 0.05);
					moped.setDirection("North");
					}
					break;
				case "go right":
					if (moped.setStreet(moped.getStreet() + 1)) {
					moped.setGas(moped.getGas() - 0.05);
					moped.setDirection("South");
					}
					break;
				case "straight on":
					if (moped.setAvenue(moped.getAvenue() + 1)) {
					moped.setGas(moped.getGas() - 0.05);
					moped.setIsBack(false);
					}
					break;
				case "back up":
					if (moped.setAvenue(moped.getAvenue() - 1)) {
					moped.setGas(moped.getGas() - 0.05);
					moped.setIsBack(true);
					}
					break;	
				}
			}
	}
	
/**
 * method used to automatically drive home
 * @param moped - which moped/ the user's moped in this program
 * @param drunkMoped1 - one of the drunk mopeds
 * @param drunkMoped2 - the other drunk moped
 */
	public static void driveHome(Moped moped, Moped drunkMoped1, Moped drunkMoped2) {
		// where Bluestone Lane is located
		int homeStreet = 8;
		int homeAve = 4;
		while (true) {
			String direction = moped.getDirection();
			int street = moped.getStreet();
			int ave = moped.getAvenue();
			
			if (street == homeStreet && ave == homeAve) {					// stop when the moped arrives 
				System.out.println("We have reached the Bluestone Lane."); 
				return;
			}
			if (moped.getGas() <= 0.05) {									// get gas automatically when its about to run out
				System.out.println("Filling up Gas");
				moped.setGas(1);
			}
			
			//the logic - compare moped street vs home street and moped avenue vs home avenue and keep updating the moped's street and avenue
			if (moped.getIsBack()) {
				if (direction.equals("South")) {
					if (street > homeStreet) {
						driveBackward(direction, "straight on", moped);
						System.out.println("Now at " + moped.getStreet() +"th street and " + moped.getAvenue() + "th avenue, facing " + direction);
						
						randDrive(drunkMoped1);
						randDrive(drunkMoped2);
						System.out.print(drunkMoped1.getType() + " is now at " + drunkMoped1.getStreet() + "th Street and " + drunkMoped1.getAvenue() + "th Avenue facing " + drunkMoped1.getDirection() + ". ");
						System.out.println("with " + (int) (drunkMoped1.getGas() / 1.0 * 100 + 0.001) +"% of gas remaining.");
						System.out.print(drunkMoped2.getType() + " is now at " + drunkMoped2.getStreet() + "th Street and " + drunkMoped2.getAvenue() + "th Avenue facing " + drunkMoped2.getDirection() + ". ");
						System.out.println("with " + (int) (drunkMoped2.getGas() / 1.0 * 100 + 0.001) +"% of gas remaining.");

					} else if (street < homeStreet) {
						driveBackward(direction, "back up", moped);
						System.out.println("Now at " + moped.getStreet() +"th street and " + moped.getAvenue() + "th avenue, facing " + direction);
						
						randDrive(drunkMoped1);
						randDrive(drunkMoped2);
						System.out.print(drunkMoped1.getType() + " is now at " + drunkMoped1.getStreet() + "th Street and " + drunkMoped1.getAvenue() + "th Avenue facing " + drunkMoped1.getDirection() + ". ");
						System.out.println("with " + (int) (drunkMoped1.getGas() / 1.0 * 100 + 0.001) +"% of gas remaining.");
						System.out.print(drunkMoped2.getType() + " is now at " + drunkMoped2.getStreet() + "th Street and " + drunkMoped2.getAvenue() + "th Avenue facing " + drunkMoped2.getDirection() + ". ");
						System.out.println("with " + (int) (drunkMoped2.getGas() / 1.0 * 100 + 0.001) +"% of gas remaining.");
					}
					if (ave > homeAve) {
						driveBackward(direction, "go left", moped);
						System.out.println("Now at " + moped.getStreet() +"th street and " + moped.getAvenue() + "th avenue, facing " + direction);
						
						randDrive(drunkMoped1);
						randDrive(drunkMoped2);
						System.out.print(drunkMoped1.getType() + " is now at " + drunkMoped1.getStreet() + "th Street and " + drunkMoped1.getAvenue() + "th Avenue facing " + drunkMoped1.getDirection() + ". ");
						System.out.println("with " + (int) (drunkMoped1.getGas() / 1.0 * 100 + 0.001) +"% of gas remaining.");
						System.out.print(drunkMoped2.getType() + " is now at " + drunkMoped2.getStreet() + "th Street and " + drunkMoped2.getAvenue() + "th Avenue facing " + drunkMoped2.getDirection() + ". ");
						System.out.println("with " + (int) (drunkMoped2.getGas() / 1.0 * 100 + 0.001) +"% of gas remaining.");

					} else if (ave < homeAve) {
						driveBackward(direction, "go right", moped);
						System.out.println("Now at " + moped.getStreet() +"th street and " + moped.getAvenue() + "th avenue, facing " + direction);
						
						randDrive(drunkMoped1);
						randDrive(drunkMoped2);
						System.out.print(drunkMoped1.getType() + " is now at " + drunkMoped1.getStreet() + "th Street and " + drunkMoped1.getAvenue() + "th Avenue facing " + drunkMoped1.getDirection() + ". ");
						System.out.println("with " + (int) (drunkMoped1.getGas() / 1.0 * 100 + 0.001) +"% of gas remaining.");
						System.out.print(drunkMoped2.getType() + " is now at " + drunkMoped2.getStreet() + "th Street and " + drunkMoped2.getAvenue() + "th Avenue facing " + drunkMoped2.getDirection() + ". ");
						System.out.println("with " + (int) (drunkMoped2.getGas() / 1.0 * 100 + 0.001) +"% of gas remaining.");

					}
				} else if (direction.equals("North")) {
					if (street > homeStreet) {
						driveBackward(direction, "back up", moped);
						System.out.println("Now at " + moped.getStreet() +"th street and " + moped.getAvenue() + "th avenue, facing " + direction);
						
						randDrive(drunkMoped1);
						randDrive(drunkMoped2);
						System.out.print(drunkMoped1.getType() + " is now at " + drunkMoped1.getStreet() + "th Street and " + drunkMoped1.getAvenue() + "th Avenue facing " + drunkMoped1.getDirection() + ". ");
						System.out.println("with " + (int) (drunkMoped1.getGas() / 1.0 * 100 + 0.001) +"% of gas remaining.");
						System.out.print(drunkMoped2.getType() + " is now at " + drunkMoped2.getStreet() + "th Street and " + drunkMoped2.getAvenue() + "th Avenue facing " + drunkMoped2.getDirection() + ". ");
						System.out.println("with " + (int) (drunkMoped2.getGas() / 1.0 * 100 + 0.001) +"% of gas remaining.");

					} else if (street < homeStreet) {
						driveBackward(direction, "straight on", moped);
						System.out.println("Now at " + moped.getStreet() +"th street and " + moped.getAvenue() + "th avenue, facing " + direction);
						
						randDrive(drunkMoped1);
						randDrive(drunkMoped2);
						System.out.print(drunkMoped1.getType() + " is now at " + drunkMoped1.getStreet() + "th Street and " + drunkMoped1.getAvenue() + "th Avenue facing " + drunkMoped1.getDirection() + ". ");
						System.out.println("with " + (int) (drunkMoped1.getGas() / 1.0 * 100 + 0.001) +"% of gas remaining.");
						System.out.print(drunkMoped2.getType() + " is now at " + drunkMoped2.getStreet() + "th Street and " + drunkMoped2.getAvenue() + "th Avenue facing " + drunkMoped2.getDirection() + ". ");
						System.out.println("with " + (int) (drunkMoped2.getGas() / 1.0 * 100 + 0.001) +"% of gas remaining.");

					}
					if (ave > homeAve) {
						driveBackward(direction, "go right", moped);
						System.out.println("Now at " + moped.getStreet() +"th street and " + moped.getAvenue() + "th avenue, facing " + direction);
						
						randDrive(drunkMoped1);
						randDrive(drunkMoped2);
						System.out.print(drunkMoped1.getType() + " is now at " + drunkMoped1.getStreet() + "th Street and " + drunkMoped1.getAvenue() + "th Avenue facing " + drunkMoped1.getDirection() + ". ");
						System.out.println("with " + (int) (drunkMoped1.getGas() / 1.0 * 100 + 0.001) +"% of gas remaining.");
						System.out.print(drunkMoped2.getType() + " is now at " + drunkMoped2.getStreet() + "th Street and " + drunkMoped2.getAvenue() + "th Avenue facing " + drunkMoped2.getDirection() + ". ");
						System.out.println("with " + (int) (drunkMoped2.getGas() / 1.0 * 100 + 0.001) +"% of gas remaining.");

					} else if (ave < homeAve) {
						driveBackward(direction, "go left", moped);
						System.out.println("Now at " + moped.getStreet() +"th street and " + moped.getAvenue() + "th avenue, facing " + direction);
						
						randDrive(drunkMoped1);
						randDrive(drunkMoped2);
						System.out.print(drunkMoped1.getType() + " is now at " + drunkMoped1.getStreet() + "th Street and " + drunkMoped1.getAvenue() + "th Avenue facing " + drunkMoped1.getDirection() + ". ");
						System.out.println("with " + (int) (drunkMoped1.getGas() / 1.0 * 100 + 0.001) +"% of gas remaining.");
						System.out.print(drunkMoped2.getType() + " is now at " + drunkMoped2.getStreet() + "th Street and " + drunkMoped2.getAvenue() + "th Avenue facing " + drunkMoped2.getDirection() + ". ");
						System.out.println("with " + (int) (drunkMoped2.getGas() / 1.0 * 100 + 0.001) +"% of gas remaining.");

					}
				} else if (direction.equals("East")) {
					if (street > homeStreet) {
						driveBackward(direction, "go right", moped);
						System.out.println("Now at " + moped.getStreet() +"th street and " + moped.getAvenue() + "th avenue, facing " + direction);
						
						randDrive(drunkMoped1);
						randDrive(drunkMoped2);
						System.out.print(drunkMoped1.getType() + " is now at " + drunkMoped1.getStreet() + "th Street and " + drunkMoped1.getAvenue() + "th Avenue facing " + drunkMoped1.getDirection() + ". ");
						System.out.println("with " + (int) (drunkMoped1.getGas() / 1.0 * 100 + 0.001) +"% of gas remaining.");
						System.out.print(drunkMoped2.getType() + " is now at " + drunkMoped2.getStreet() + "th Street and " + drunkMoped2.getAvenue() + "th Avenue facing " + drunkMoped2.getDirection() + ". ");
						System.out.println("with " + (int) (drunkMoped2.getGas() / 1.0 * 100 + 0.001) +"% of gas remaining.");

					} else if (street < homeStreet) {
						driveBackward(direction, "go left", moped);
						System.out.println("Now at " + moped.getStreet() +"th street and " + moped.getAvenue() + "th avenue, facing " + direction);
						
						randDrive(drunkMoped1);
						randDrive(drunkMoped2);
						System.out.print(drunkMoped1.getType() + " is now at " + drunkMoped1.getStreet() + "th Street and " + drunkMoped1.getAvenue() + "th Avenue facing " + drunkMoped1.getDirection() + ". ");
						System.out.println("with " + (int) (drunkMoped1.getGas() / 1.0 * 100 + 0.001) +"% of gas remaining.");
						System.out.print(drunkMoped2.getType() + " is now at " + drunkMoped2.getStreet() + "th Street and " + drunkMoped2.getAvenue() + "th Avenue facing " + drunkMoped2.getDirection() + ". ");
						System.out.println("with " + (int) (drunkMoped2.getGas() / 1.0 * 100 + 0.001) +"% of gas remaining.");
					}
					if (ave > homeAve) {
						driveBackward(direction, "straight on", moped);
						System.out.println("Now at " + moped.getStreet() +"th street and " + moped.getAvenue() + "th avenue, facing " + direction);
						
						randDrive(drunkMoped1);
						randDrive(drunkMoped2);
						System.out.print(drunkMoped1.getType() + " is now at " + drunkMoped1.getStreet() + "th Street and " + drunkMoped1.getAvenue() + "th Avenue facing " + drunkMoped1.getDirection() + ". ");
						System.out.println("with " + (int) (drunkMoped1.getGas() / 1.0 * 100 + 0.001) +"% of gas remaining.");
						System.out.print(drunkMoped2.getType() + " is now at " + drunkMoped2.getStreet() + "th Street and " + drunkMoped2.getAvenue() + "th Avenue facing " + drunkMoped2.getDirection() + ". ");
						System.out.println("with " + (int) (drunkMoped2.getGas() / 1.0 * 100 + 0.001) +"% of gas remaining.");

					} else if (ave < homeAve) {
						driveBackward(direction, "back up", moped);
						System.out.println("Now at " + moped.getStreet() +"th street and " + moped.getAvenue() + "th avenue, facing " + direction);
						
						randDrive(drunkMoped1);
						randDrive(drunkMoped2);
						System.out.print(drunkMoped1.getType() + " is now at " + drunkMoped1.getStreet() + "th Street and " + drunkMoped1.getAvenue() + "th Avenue facing " + drunkMoped1.getDirection() + ". ");
						System.out.println("with " + (int) (drunkMoped1.getGas() / 1.0 * 100 + 0.001) +"% of gas remaining.");
						System.out.print(drunkMoped2.getType() + " is now at " + drunkMoped2.getStreet() + "th Street and " + drunkMoped2.getAvenue() + "th Avenue facing " + drunkMoped2.getDirection() + ". ");
						System.out.println("with " + (int) (drunkMoped2.getGas() / 1.0 * 100 + 0.001) +"% of gas remaining.");
					}
				} else {
					if (street > homeStreet) {
						driveBackward(direction, "go left", moped);
						System.out.println("Now at " + moped.getStreet() +"th street and " + moped.getAvenue() + "th avenue, facing " + direction);
						
						randDrive(drunkMoped1);
						randDrive(drunkMoped2);
						System.out.print(drunkMoped1.getType() + " is now at " + drunkMoped1.getStreet() + "th Street and " + drunkMoped1.getAvenue() + "th Avenue facing " + drunkMoped1.getDirection() + ". ");
						System.out.println("with " + (int) (drunkMoped1.getGas() / 1.0 * 100 + 0.001) +"% of gas remaining.");
						System.out.print(drunkMoped2.getType() + " is now at " + drunkMoped2.getStreet() + "th Street and " + drunkMoped2.getAvenue() + "th Avenue facing " + drunkMoped2.getDirection() + ". ");
						System.out.println("with " + (int) (drunkMoped2.getGas() / 1.0 * 100 + 0.001) +"% of gas remaining.");
					} else if (street < homeStreet) {
						driveBackward(direction, "go right", moped);
						System.out.println("Now at " + moped.getStreet() +"th street and " + moped.getAvenue() + "th avenue, facing " + direction);
						
						randDrive(drunkMoped1);
						randDrive(drunkMoped2);
						System.out.print(drunkMoped1.getType() + " is now at " + drunkMoped1.getStreet() + "th Street and " + drunkMoped1.getAvenue() + "th Avenue facing " + drunkMoped1.getDirection() + ". ");
						System.out.println("with " + (int) (drunkMoped1.getGas() / 1.0 * 100 + 0.001) +"% of gas remaining.");
						System.out.print(drunkMoped2.getType() + " is now at " + drunkMoped2.getStreet() + "th Street and " + drunkMoped2.getAvenue() + "th Avenue facing " + drunkMoped2.getDirection() + ". ");
						System.out.println("with " + (int) (drunkMoped2.getGas() / 1.0 * 100 + 0.001) +"% of gas remaining.");

					}
					if (ave > homeAve) {
						driveBackward(direction, "back up", moped);
						System.out.println("Now at " + moped.getStreet() +"th street and " + moped.getAvenue() + "th avenue, facing " + direction);
						
						randDrive(drunkMoped1);
						randDrive(drunkMoped2);
						System.out.print(drunkMoped1.getType() + " is now at " + drunkMoped1.getStreet() + "th Street and " + drunkMoped1.getAvenue() + "th Avenue facing " + drunkMoped1.getDirection() + ". ");
						System.out.println("with " + (int) (drunkMoped1.getGas() / 1.0 * 100 + 0.001) +"% of gas remaining.");
						System.out.print(drunkMoped2.getType() + " is now at " + drunkMoped2.getStreet() + "th Street and " + drunkMoped2.getAvenue() + "th Avenue facing " + drunkMoped2.getDirection() + ". ");
						System.out.println("with " + (int) (drunkMoped2.getGas() / 1.0 * 100 + 0.001) +"% of gas remaining.");
					} else if (ave < homeAve) {
						driveBackward(direction, "straight on", moped);
						System.out.println("Now at " + moped.getStreet() +"th street and " + moped.getAvenue() + "th avenue, facing " + direction);
						
						randDrive(drunkMoped1);
						randDrive(drunkMoped2);
						System.out.print(drunkMoped1.getType() + " is now at " + drunkMoped1.getStreet() + "th Street and " + drunkMoped1.getAvenue() + "th Avenue facing " + drunkMoped1.getDirection() + ". ");
						System.out.println("with " + (int) (drunkMoped1.getGas() / 1.0 * 100 + 0.001) +"% of gas remaining.");
						System.out.print(drunkMoped2.getType() + " is now at " + drunkMoped2.getStreet() + "th Street and " + drunkMoped2.getAvenue() + "th Avenue facing " + drunkMoped2.getDirection() + ". ");
						System.out.println("with " + (int) (drunkMoped2.getGas() / 1.0 * 100 + 0.001) +"% of gas remaining.");
					}
				}
			} else {
				if (direction.equals("South")) {
					if (street > homeStreet) {
						driveForward(direction, "straight on", moped);
						System.out.println("Now at " + moped.getStreet() +"th street and " + moped.getAvenue() + "th avenue, facing " + direction);
						
						randDrive(drunkMoped1);
						randDrive(drunkMoped2);
						System.out.print(drunkMoped1.getType() + " is now at " + drunkMoped1.getStreet() + "th Street and " + drunkMoped1.getAvenue() + "th Avenue facing " + drunkMoped1.getDirection() + ". ");
						System.out.println("with " + (int) (drunkMoped1.getGas() / 1.0 * 100 + 0.001) +"% of gas remaining.");
						System.out.print(drunkMoped2.getType() + " is now at " + drunkMoped2.getStreet() + "th Street and " + drunkMoped2.getAvenue() + "th Avenue facing " + drunkMoped2.getDirection() + ". ");
						System.out.println("with " + (int) (drunkMoped2.getGas() / 1.0 * 100 + 0.001) +"% of gas remaining.");
					} else if (street < homeStreet) {
						driveForward(direction, "back up", moped);
						System.out.println("Now at " + moped.getStreet() +"th street and " + moped.getAvenue() + "th avenue, facing " + direction);
						
						randDrive(drunkMoped1);
						randDrive(drunkMoped2);
						System.out.print(drunkMoped1.getType() + " is now at " + drunkMoped1.getStreet() + "th Street and " + drunkMoped1.getAvenue() + "th Avenue facing " + drunkMoped1.getDirection() + ". ");
						System.out.println("with " + (int) (drunkMoped1.getGas() / 1.0 * 100 + 0.001) +"% of gas remaining.");
						System.out.print(drunkMoped2.getType() + " is now at " + drunkMoped2.getStreet() + "th Street and " + drunkMoped2.getAvenue() + "th Avenue facing " + drunkMoped2.getDirection() + ". ");
						System.out.println("with " + (int) (drunkMoped2.getGas() / 1.0 * 100 + 0.001) +"% of gas remaining.");
					}
					if (ave > homeAve) {
						driveForward(direction, "go left", moped);
						System.out.println("Now at " + moped.getStreet() +"th street and " + moped.getAvenue() + "th avenue, facing " + direction);
						
						randDrive(drunkMoped1);
						randDrive(drunkMoped2);
						System.out.print(drunkMoped1.getType() + " is now at " + drunkMoped1.getStreet() + "th Street and " + drunkMoped1.getAvenue() + "th Avenue facing " + drunkMoped1.getDirection() + ". ");
						System.out.println("with " + (int) (drunkMoped1.getGas() / 1.0 * 100 + 0.001) +"% of gas remaining.");
						System.out.print(drunkMoped2.getType() + " is now at " + drunkMoped2.getStreet() + "th Street and " + drunkMoped2.getAvenue() + "th Avenue facing " + drunkMoped2.getDirection() + ". ");
						System.out.println("with " + (int) (drunkMoped2.getGas() / 1.0 * 100 + 0.001) +"% of gas remaining.");
					} else if (ave < homeAve) {
						driveForward(direction, "go right", moped);
						System.out.println("Now at " + moped.getStreet() +"th street and " + moped.getAvenue() + "th avenue, facing " + direction);
						
						randDrive(drunkMoped1);
						randDrive(drunkMoped2);
						System.out.print(drunkMoped1.getType() + " is now at " + drunkMoped1.getStreet() + "th Street and " + drunkMoped1.getAvenue() + "th Avenue facing " + drunkMoped1.getDirection() + ". ");
						System.out.println("with " + (int) (drunkMoped1.getGas() / 1.0 * 100 + 0.001) +"% of gas remaining.");
						System.out.print(drunkMoped2.getType() + " is now at " + drunkMoped2.getStreet() + "th Street and " + drunkMoped2.getAvenue() + "th Avenue facing " + drunkMoped2.getDirection() + ". ");
						System.out.println("with " + (int) (drunkMoped2.getGas() / 1.0 * 100 + 0.001) +"% of gas remaining.");
					}
				} else if (direction.equals("North")) {
					if (street > homeStreet) {
						driveForward(direction, "back up", moped);
						System.out.println("Now at " + moped.getStreet() +"th street and " + moped.getAvenue() + "th avenue, facing " + direction);
						
						randDrive(drunkMoped1);
						randDrive(drunkMoped2);
						System.out.print(drunkMoped1.getType() + " is now at " + drunkMoped1.getStreet() + "th Street and " + drunkMoped1.getAvenue() + "th Avenue facing " + drunkMoped1.getDirection() + ". ");
						System.out.println("with " + (int) (drunkMoped1.getGas() / 1.0 * 100 + 0.001) +"% of gas remaining.");
						System.out.print(drunkMoped2.getType() + " is now at " + drunkMoped2.getStreet() + "th Street and " + drunkMoped2.getAvenue() + "th Avenue facing " + drunkMoped2.getDirection() + ". ");
						System.out.println("with " + (int) (drunkMoped2.getGas() / 1.0 * 100 + 0.001) +"% of gas remaining.");
					} else if (street < homeStreet) {
						driveForward(direction, "straight on", moped);
						System.out.println("Now at " + moped.getStreet() +"th street and " + moped.getAvenue() + "th avenue, facing " + direction);
						
						randDrive(drunkMoped1);
						randDrive(drunkMoped2);
						System.out.print(drunkMoped1.getType() + " is now at " + drunkMoped1.getStreet() + "th Street and " + drunkMoped1.getAvenue() + "th Avenue facing " + drunkMoped1.getDirection() + ". ");
						System.out.println("with " + (int) (drunkMoped1.getGas() / 1.0 * 100 + 0.001) +"% of gas remaining.");
						System.out.print(drunkMoped2.getType() + " is now at " + drunkMoped2.getStreet() + "th Street and " + drunkMoped2.getAvenue() + "th Avenue facing " + drunkMoped2.getDirection() + ". ");
						System.out.println("with " + (int) (drunkMoped2.getGas() / 1.0 * 100 + 0.001) +"% of gas remaining.");
					}
					if (ave > homeAve) {
						driveForward(direction, "go right", moped);
						System.out.println("Now at " + moped.getStreet() +"th street and " + moped.getAvenue() + "th avenue, facing " + direction);
						
						randDrive(drunkMoped1);
						randDrive(drunkMoped2);
						System.out.print(drunkMoped1.getType() + " is now at " + drunkMoped1.getStreet() + "th Street and " + drunkMoped1.getAvenue() + "th Avenue facing " + drunkMoped1.getDirection() + ". ");
						System.out.println("with " + (int) (drunkMoped1.getGas() / 1.0 * 100 + 0.001) +"% of gas remaining.");
						System.out.print(drunkMoped2.getType() + " is now at " + drunkMoped2.getStreet() + "th Street and " + drunkMoped2.getAvenue() + "th Avenue facing " + drunkMoped2.getDirection() + ". ");
						System.out.println("with " + (int) (drunkMoped2.getGas() / 1.0 * 100 + 0.001) +"% of gas remaining.");
					} else if (ave < homeAve) {
						driveForward(direction, "go left", moped);
						System.out.println("Now at " + moped.getStreet() +"th street and " + moped.getAvenue() + "th avenue, facing " + direction);
						
						randDrive(drunkMoped1);
						randDrive(drunkMoped2);
						System.out.print(drunkMoped1.getType() + " is now at " + drunkMoped1.getStreet() + "th Street and " + drunkMoped1.getAvenue() + "th Avenue facing " + drunkMoped1.getDirection() + ". ");
						System.out.println("with " + (int) (drunkMoped1.getGas() / 1.0 * 100 + 0.001) +"% of gas remaining.");
						System.out.print(drunkMoped2.getType() + " is now at " + drunkMoped2.getStreet() + "th Street and " + drunkMoped2.getAvenue() + "th Avenue facing " + drunkMoped2.getDirection() + ". ");
						System.out.println("with " + (int) (drunkMoped2.getGas() / 1.0 * 100 + 0.001) +"% of gas remaining.");
					}
				} else if (direction.equals("East")) {
					if (street > homeStreet) {
						driveForward(direction, "go right", moped);
						System.out.println("Now at " + moped.getStreet() +"th street and " + moped.getAvenue() + "th avenue, facing " + direction);
						
						randDrive(drunkMoped1);
						randDrive(drunkMoped2);
						System.out.print(drunkMoped1.getType() + " is now at " + drunkMoped1.getStreet() + "th Street and " + drunkMoped1.getAvenue() + "th Avenue facing " + drunkMoped1.getDirection() + ". ");
						System.out.println("with " + (int) (drunkMoped1.getGas() / 1.0 * 100 + 0.001) +"% of gas remaining.");
						System.out.print(drunkMoped2.getType() + " is now at " + drunkMoped2.getStreet() + "th Street and " + drunkMoped2.getAvenue() + "th Avenue facing " + drunkMoped2.getDirection() + ". ");
						System.out.println("with " + (int) (drunkMoped2.getGas() / 1.0 * 100 + 0.001) +"% of gas remaining.");
					} else if (street < homeStreet) {
						driveForward(direction, "go left", moped);
						System.out.println("Now at " + moped.getStreet() +"th street and " + moped.getAvenue() + "th avenue, facing " + direction);
						
						randDrive(drunkMoped1);
						randDrive(drunkMoped2);
						System.out.print(drunkMoped1.getType() + " is now at " + drunkMoped1.getStreet() + "th Street and " + drunkMoped1.getAvenue() + "th Avenue facing " + drunkMoped1.getDirection() + ". ");
						System.out.println("with " + (int) (drunkMoped1.getGas() / 1.0 * 100 + 0.001) +"% of gas remaining.");
						System.out.print(drunkMoped2.getType() + " is now at " + drunkMoped2.getStreet() + "th Street and " + drunkMoped2.getAvenue() + "th Avenue facing " + drunkMoped2.getDirection() + ". ");
						System.out.println("with " + (int) (drunkMoped2.getGas() / 1.0 * 100 + 0.001) +"% of gas remaining.");
					}
					if (ave > homeAve) {
						driveForward(direction, "straight on", moped);
						System.out.println("Now at " + moped.getStreet() +"th street and " + moped.getAvenue() + "th avenue, facing " + direction);
						
						randDrive(drunkMoped1);
						randDrive(drunkMoped2);
						System.out.print(drunkMoped1.getType() + " is now at " + drunkMoped1.getStreet() + "th Street and " + drunkMoped1.getAvenue() + "th Avenue facing " + drunkMoped1.getDirection() + ". ");
						System.out.println("with " + (int) (drunkMoped1.getGas() / 1.0 * 100 + 0.001) +"% of gas remaining.");
						System.out.print(drunkMoped2.getType() + " is now at " + drunkMoped2.getStreet() + "th Street and " + drunkMoped2.getAvenue() + "th Avenue facing " + drunkMoped2.getDirection() + ". ");
						System.out.println("with " + (int) (drunkMoped2.getGas() / 1.0 * 100 + 0.001) +"% of gas remaining.");
					} else if (ave < homeAve) {
						driveForward(direction, "back up", moped);
						System.out.println("Now at " + moped.getStreet() +"th street and " + moped.getAvenue() + "th avenue, facing " + direction);
						
						randDrive(drunkMoped1);
						randDrive(drunkMoped2);
						System.out.print(drunkMoped1.getType() + " is now at " + drunkMoped1.getStreet() + "th Street and " + drunkMoped1.getAvenue() + "th Avenue facing " + drunkMoped1.getDirection() + ". ");
						System.out.println("with " + (int) (drunkMoped1.getGas() / 1.0 * 100 + 0.001) +"% of gas remaining.");
						System.out.print(drunkMoped2.getType() + " is now at " + drunkMoped2.getStreet() + "th Street and " + drunkMoped2.getAvenue() + "th Avenue facing " + drunkMoped2.getDirection() + ". ");
						System.out.println("with " + (int) (drunkMoped2.getGas() / 1.0 * 100 + 0.001) +"% of gas remaining.");
					}
				} else {
					if (street > homeStreet) {
						driveForward(direction, "go left", moped);
						System.out.println("Now at " + moped.getStreet() +"th street and " + moped.getAvenue() + "th avenue, facing " + direction);
						
						randDrive(drunkMoped1);
						randDrive(drunkMoped2);
						System.out.print(drunkMoped1.getType() + " is now at " + drunkMoped1.getStreet() + "th Street and " + drunkMoped1.getAvenue() + "th Avenue facing " + drunkMoped1.getDirection() + ". ");
						System.out.println("with " + (int) (drunkMoped1.getGas() / 1.0 * 100 + 0.001) +"% of gas remaining.");
						System.out.print(drunkMoped2.getType() + " is now at " + drunkMoped2.getStreet() + "th Street and " + drunkMoped2.getAvenue() + "th Avenue facing " + drunkMoped2.getDirection() + ". ");
						System.out.println("with " + (int) (drunkMoped2.getGas() / 1.0 * 100 + 0.001) +"% of gas remaining.");
					} else if (street < homeStreet) {
						driveForward(direction, "go right", moped);
						System.out.println("Now at " + moped.getStreet() +"th street and " + moped.getAvenue() + "th avenue, facing " + direction);
						
						randDrive(drunkMoped1);
						randDrive(drunkMoped2);
						System.out.print(drunkMoped1.getType() + " is now at " + drunkMoped1.getStreet() + "th Street and " + drunkMoped1.getAvenue() + "th Avenue facing " + drunkMoped1.getDirection() + ". ");
						System.out.println("with " + (int) (drunkMoped1.getGas() / 1.0 * 100 + 0.001) +"% of gas remaining.");
						System.out.print(drunkMoped2.getType() + " is now at " + drunkMoped2.getStreet() + "th Street and " + drunkMoped2.getAvenue() + "th Avenue facing " + drunkMoped2.getDirection() + ". ");
						System.out.println("with " + (int) (drunkMoped2.getGas() / 1.0 * 100 + 0.001) +"% of gas remaining.");
					}
					if (ave > homeAve) {
						driveForward(direction, "back up", moped);
						System.out.println("Now at " + moped.getStreet() +"th street and " + moped.getAvenue() + "th avenue, facing " + direction);
						
						randDrive(drunkMoped1);
						randDrive(drunkMoped2);
						System.out.print(drunkMoped1.getType() + " is now at " + drunkMoped1.getStreet() + "th Street and " + drunkMoped1.getAvenue() + "th Avenue facing " + drunkMoped1.getDirection() + ". ");
						System.out.println("with " + (int) (drunkMoped1.getGas() / 1.0 * 100 + 0.001) +"% of gas remaining.");
						System.out.print(drunkMoped2.getType() + " is now at " + drunkMoped2.getStreet() + "th Street and " + drunkMoped2.getAvenue() + "th Avenue facing " + drunkMoped2.getDirection() + ". ");
						System.out.println("with " + (int) (drunkMoped2.getGas() / 1.0 * 100 + 0.001) +"% of gas remaining.");
					} else if (ave < homeAve) {
						driveForward(direction, "straight on", moped);
						System.out.println("Now at " + moped.getStreet() +"th street and " + moped.getAvenue() + "th avenue, facing " + direction);
						
						randDrive(drunkMoped1);
						randDrive(drunkMoped2);
						System.out.print(drunkMoped1.getType() + " is now at " + drunkMoped1.getStreet() + "th Street and " + drunkMoped1.getAvenue() + "th Avenue facing " + drunkMoped1.getDirection() + ". ");
						System.out.println("with " + (int) (drunkMoped1.getGas() / 1.0 * 100 + 0.001) +"% of gas remaining.");
						System.out.print(drunkMoped2.getType() + " is now at " + drunkMoped2.getStreet() + "th Street and " + drunkMoped2.getAvenue() + "th Avenue facing " + drunkMoped2.getDirection() + ". ");
						System.out.println("with " + (int) (drunkMoped2.getGas() / 1.0 * 100 + 0.001) +"% of gas remaining.");
					}
				}
				boolean bool1 = moped.getStreet() == drunkMoped1.getStreet() && moped.getAvenue() == drunkMoped1.getAvenue();
				boolean bool2 = moped.getStreet() == drunkMoped2.getStreet() && moped.getAvenue() == drunkMoped2.getAvenue();

				if (bool1 || bool2) {
					return;
				}
			}
		}
		
	}
	
/**
 * method for drunk mopeds to drive randomly
 * @param moped - drunk mopeds
 */
	public static void randDrive(Moped moped) {
		// automatically fill up gas when its about to run out
		if (moped.getGas() <= 0.05) {
			System.out.println(moped.getType() + " is filling up Gas.");
			moped.setGas(1);
		} else {
			Random rand = new Random();
			int first = rand.nextInt(2);		// to randomly select drive front or drive back
			int index = rand.nextInt(4);		// to randomly select the commands
			String[] commands = {"go left", "go right", "back up", "straight on"};
			
			if (first == 0) {
				driveForward(moped.getDirection(), commands[index], moped);
			} else {
				driveBackward(moped.getDirection(), commands[index], moped);
			}
		}
		
	}
	
/**
 * main method to control the flow of the entire program
 * @param args
 */
	
	public static void main(String[] args) {
		// instantiate all the mopeds needed
		Moped myMoped = new Moped("Your Moped", "South", 10 , 5);
		Moped drunkMoped1 = new Moped("Drunk Moped1", "East", 20, 3);
		Moped drunkMoped2 = new Moped("Drunk Moped2", "North", 15, 7);
		System.out.println("Thanks for jumping on the Moped. Currently at 10th St. and 5th Ave, facing South");
		System.out.println("What would you like to do?  At any time, say \"help\" for assistance.");
		Scanner scn = new Scanner(System.in);
		while (true) {
			String input = scn.nextLine();
			switch (input) {
			case "how we doin'?": 
				int percent = (int) (myMoped.getGas() / 1.0 * 100 + 0.001);			// 0.001 was added since java was calculating the number weirdly...
				System.out.println("The gas is currently " + percent + "% full.");
				randDrive(drunkMoped1);			// take drunk mopeds to random directions
				randDrive(drunkMoped2);
				// show the user drunk mopeds' status
				System.out.print(drunkMoped1.getType() + " is now at " + drunkMoped1.getStreet() + "th Street and " + drunkMoped1.getAvenue() + "th Avenue facing " + drunkMoped1.getDirection() + ". ");
				System.out.println("with " + (int) (drunkMoped1.getGas() / 1.0 * 100 + 0.001) +"% of gas remaining."); 	
				System.out.print(drunkMoped2.getType() + " is now at " + drunkMoped2.getStreet() + "th Street and " + drunkMoped2.getAvenue() + "th Avenue facing " + drunkMoped2.getDirection() + ". ");
				System.out.println("with " + (int) (drunkMoped2.getGas() / 1.0 * 100 + 0.001) +"% of gas remaining.");
				break;
			case "fill 'er up":
				System.out.println("Filling up the tank...");
				myMoped.setGas(1);		// refill the gas tank fully
				randDrive(drunkMoped1);			// drunk mopeds still drive around
				randDrive(drunkMoped2);
				System.out.print(drunkMoped1.getType() + " is now at " + drunkMoped1.getStreet() + "th Street and " + drunkMoped1.getAvenue() + "th Avenue facing " + drunkMoped1.getDirection() + ". ");
				System.out.println("with " + (int) (drunkMoped1.getGas() / 1.0 * 100 + 0.001) +"% of gas remaining.");
				System.out.print(drunkMoped2.getType() + " is now at " + drunkMoped2.getStreet() + "th Street and " + drunkMoped2.getAvenue() + "th Avenue facing " + drunkMoped2.getDirection() + ". ");
				System.out.println("with " + (int) (drunkMoped2.getGas() / 1.0 * 100 + 0.001) +"% of gas remaining.");
				break;
			case "park":
				System.out.println("Parking at " + myMoped.getStreet() + "th Street and " + myMoped.getAvenue() + "th Avenue.");
				return; // park and end the program
			case "go to Bluestone Lane":
				driveHome(myMoped, drunkMoped1, drunkMoped2);		// drive automatically to Bluestone Lane
				break;
			case "help":
				// print out all the valid commands
				System.out.println("go left \n" + 
						"go right\n" + 
						"straight on\n" + 
						"back up\n" + 
						"how we doin'?\n" + 
						"fill 'er up\n" + 
						"park\n" + 
						"go to Bluestone Lane\n" + 
						"help");
				break;
			default:
				// all the driving actions
				String direction = myMoped.getDirection();
				
				if (myMoped.getIsBack()) {
					driveBackward(direction, input, myMoped);		// drive back
				} else {
					driveForward(direction, input, myMoped); 		// drive forward
				}
				int street = myMoped.getStreet();
				int ave = myMoped.getAvenue();
				System.out.println("Now at " + street +"th Street and " + ave + "th Avenue, facing " + myMoped.getDirection() +".");
				// put up advertisements
				if (street == 79 && ave == 8) {
					System.out.println("Welcome to American Museum of Natural History!");
				} else if (street == 74 && ave == 1) {
					System.out.println("Welcome to Memorial Sloan Kettering!");
				} else if (street == 12 && ave == 4) {
					System.out.println("Welcome to The Strand Book Shop!");
				} else if (street == 3 && ave == 6) {
					System.out.println("Welcome to Fayada Coffee Tea Cookies Cake Shop!");
				}
				// drunk mopeds drive too
				randDrive(drunkMoped1);
				randDrive(drunkMoped2);
				System.out.print(drunkMoped1.getType() + " is now at " + drunkMoped1.getStreet() + "th Street and " + drunkMoped1.getAvenue() + "th Avenue facing " + drunkMoped1.getDirection() + ". ");
				System.out.println("with " + (int) (drunkMoped1.getGas() / 1.0 * 100 + 0.001) +"% of gas remaining.");
				System.out.print(drunkMoped2.getType() + " is now at " + drunkMoped2.getStreet() + "th Street and " + drunkMoped2.getAvenue() + "th Avenue facing " + drunkMoped2.getDirection() + ". ");
				System.out.println("with " + (int) (drunkMoped2.getGas() / 1.0 * 100 + 0.001) +"% of gas remaining.");
				break;
			}
			if (myMoped.getGas() <= 0) {
				System.out.println("No more gas left.");		//if user's gas runs out program terminates
				return;
			}
			
			//to check if the the user's moped crashed
			boolean bool1 = myMoped.getStreet() == drunkMoped1.getStreet() && myMoped.getAvenue() == drunkMoped1.getAvenue();
			boolean bool2 = myMoped.getStreet() == drunkMoped2.getStreet() && myMoped.getAvenue() == drunkMoped2.getAvenue();

			if (bool1 || bool2) {
				System.out.println("Your moped crashed with another moped and is done...");
				return;
			}
			}
	}


}
