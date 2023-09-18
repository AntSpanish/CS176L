package edu.monmouth.exercise1;

import java.util.Scanner;
public class HousePainting {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	//Input
	System.out.print("Please enter the cost per square foot: ");
	double costPerSQFT = sc.nextDouble();
	
	System.out.print("Please enter the length of the house (in feet): ");
	double lenHouse = sc.nextDouble();
	
	System.out.print("Please enter the width of the house (in feet): ");
	double widHouse = sc.nextDouble();
	
	System.out.print("Please enter the height of the house (in feet): ");
	double heightHouse = sc.nextDouble();
	
	System.out.print("Please enter the number of windows: ");
	int numWindows = sc.nextInt();
	
	System.out.print("Please enter the length of the windows (in feet): ");
	double lenWindows = sc.nextDouble();
	
	System.out.print("Please enter the width of the windows (in feet): ");
	double widWindows = sc.nextDouble();
	
	System.out.print("Please enter the number of doors: ");
	int numDoors = sc.nextInt();
	
	System.out.print("Please enter the length of the doors (in feet): ");
	double lenDoors = sc.nextDouble();
	
	System.out.print("Please enter the width of the doors (in feet): ");
	double widDoors = sc.nextDouble();
	
	//Processing
	
	double normalSQFT = lenHouse * widHouse;
	double roofSQFT = 0.5 * (lenHouse * (heightHouse - widHouse));
	double peakSQFT = normalSQFT + roofSQFT;
	double windowSQFT = numWindows * (lenWindows * widWindows);
	double doorSQFT = numDoors * (lenDoors * widDoors);
	double paintSA = 2 * (peakSQFT + normalSQFT) - (windowSQFT + doorSQFT);
	double totalCost = paintSA * costPerSQFT;
	
	//Output
	
	System.out.println("Your total paintable surface area is "+ paintSA + " square feet.");
	System.out.print(String.format("%s$%,.2f", "Your estimate is ", totalCost));

	}

}
