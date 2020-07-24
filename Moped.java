package edu.nyu.cs.jhp489;

/**
 * Moped class that contains moped objects
 * @author jhp489
 *
 */
public class Moped {
	private double gas = 1;
	private String direction;
	private int street;
	private int avenue;
	private boolean isBack = false;
	private String type;
	
/**
 * constructor for moped objects
 * @param type - to classify whether the moped is user's or drunk
 * @param direction - starting direction
 * @param street - starting street
 * @param avenue - starting avenue
 */
	public Moped(String type,String direction, int street, int avenue) {
		this.type = type;
		this.direction = direction;
		this.street = street;
		this.avenue = avenue;
	}
	
/**
 * getter for gas
 * @return gas
 */
	public double getGas() {
		return this.gas;
	}
	
/**
 * setter method for gas
 * @param newGas - updated gas amount
 */
	public void setGas(double newGas) {
		this.gas = newGas;
		}

/**
 * getter for direction
 * @return direction
 */
	public String getDirection() {
		return this.direction;
	}

/**
 * setter for direction
 * @param newDirection - updated direction
 */
	public void setDirection(String newDirection) {
		this.direction = newDirection;
	}

/**
 * getter for street
 * @return street
 */
	public int getStreet() {
		return this.street;
	}
	
/**
 * setter for street
 * @param newStreet
 * @return whether it is off the grid
 */
	public boolean setStreet(int newStreet) {
		if (newStreet > 0 && newStreet <= 200) {
			this.street = newStreet;
			return true;
		}
		else {
			System.out.println(this.type + " - Not a valid move");
			return false;
		}
	}

/**
 * getter for avenue
 * @return avenue
 */
	public int getAvenue() {
		return this.avenue;
	}
	
/**
 * setter for avenue
 * @param newAvenue - updated avenue
 * @return whether it is off the grid
 */	
	public boolean setAvenue(int newAvenue) {
		if (newAvenue > 0 && newAvenue <= 10) {
			this.avenue = newAvenue;
			return true;
		}
		else {
			System.out.println(this.type + " - Not a valid move");
			return false;
		}
	}
	
/**
 * getter for if the moped is facing back or front
 * @return if it is back or not
 */
	public boolean getIsBack() {
		return this.isBack;
	}
	
/**
 * setter for moped facing back or not
 * @param newIsBack - updated isBack
 */
	public void setIsBack(boolean newIsBack) {
		this.isBack = newIsBack;
	}
	
/**
 * getter for moped's type
 * @return moped's type - user or drunk1 or drunk2
 */
	public String getType() {
		return this.type; 
	}
		
}

