package edu.monmouth.donations;

public class Donations {
	private int numIndividual;
	private double amtIndividual;
	private int numBusiness;
	private double amtBusiness;
	private int numOther;
	private double amtOther;
	
	public void processDonation(String cat, double donation) {
		if (cat.startsWith("individual")) {
			this.amtIndividual += donation;
			
			if (donation >= 0) {
				this.numIndividual += 1;
			} else {
				this.numIndividual -= 1;
			}
		}
		else if (cat.startsWith("business")) {
			this.amtBusiness += donation;
			if (donation >= 0) {
				this.numBusiness += 1;
			} else {
				this.numBusiness -= 1;
			}
		}
		else if (cat.startsWith("other")) {
			this.amtOther += donation;
			if (donation >= 0) {
				this.numOther += 1;
			} else {
				this.numOther -= 1;
			}
		}
		System.out.println(cat + " donation amount: " + donation);
	}
	
	public void getStatistics()	{
		System.out.println("");
		System.out.println("Individual: #:" + this.numIndividual + " $" + this.amtIndividual);
		System.out.println("Business: #:" + this.numBusiness + " $" + this.amtBusiness);
		System.out.println("Other: #:" + this.numOther + " $" + this.amtOther);
	}
}



