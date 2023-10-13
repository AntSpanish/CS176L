package edu.monmouth.donations;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class DonationsTester {

	public static void main(String[] args) throws FileNotFoundException {
		File inputFile = new File("C:\\Users\\17326\\eclipse-workspace\\Donations\\src\\Donations.txt");
		Scanner console = new Scanner(System.in);
		System.out.print("Would you like to process donations now? (Print \"Yes\" to continue.): ");
		String keep_going = console.next();
		Donations giveToMe = new Donations();
		
		if (keep_going.equals("Yes")) {
			
			Scanner in = new Scanner(inputFile);
			while (in.hasNextLine()) {
				String what = in.nextLine();
				if (what.equals("<EOF>")) {break;} else {
					what = what.replaceAll("donation>","");
					what = what.replaceAll("<","");
					String[] whatSplit = what.split(" ", 0);
					String cat = whatSplit[0];
					double donations = Double.parseDouble(whatSplit[1]);
					giveToMe.processDonation(cat, donations);
				}
			}
			giveToMe.getStatistics();
			
		} else {System.out.println("Ending now without processing donations.");
		console.close();
		
		}
	}
	
}