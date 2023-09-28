package edu.monmouth.inclass1;

public class Microwave {
	private int tValue = 0;
	private int pValue = 1;
	
	public int time() {
		tValue = tValue + 30;
		System.out.println("Time button was presed. Time is " + tValue + " seconds.");
		return tValue;
	}
	
	public int power() {
		if (pValue == 1) {pValue = 2;}
		else if (pValue == 2) {pValue = 1;}
		System.out.println("Power button was presed. Power level is " + pValue + ".");
		return pValue;
	}
	
	public void reset() {
		resettValue();
		resetpValue();
		System.out.println("Reset button was presed. Power level is " + pValue + ". Time is " + tValue + " seconds.");
	}
	
	public void start() {
		System.out.println("Cooking for " + tValue + " seconds at level " + pValue + ".");
	}
	
	public int resettValue() {
		tValue = 0;
		return tValue;
	}
	
	public int resetpValue() {
		pValue = 1;
		return pValue;
	}
	
	
	
	
	
	

}
