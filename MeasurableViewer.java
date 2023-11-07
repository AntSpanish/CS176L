package edu.monmouth.Interface;

import java.util.Scanner;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MeasurableViewer {
	public static void main(String args[]) {
		final int FRAME_WIDTH = 200;
		final int FRAME_HEIGHT = 150;
		final int LOWER = 1;
		final int UPPER = 3;
		boolean valid = false;
		String metric = "";
		
		Scanner num = new Scanner(System.in);
		
		Measurable[] bank = new Measurable[3];
	    bank[0] = new BankAccount(176220);
	    bank[1] = new BankAccount(513120);
	    bank[2] = new BankAccount(30510);
	    
	    Measurable[] countries = new Measurable[3];
	    countries[0] = new Country("Uruguay", 176220);
	    countries[1] = new Country("Thailand", 513120);
	    countries[2] = new Country("Belgium", 30510);
	    
	    Measurable[] quiz = new Measurable[5];
	    quiz[0] = new Quiz(95);
	    quiz[1] = new Quiz(80);
	    quiz[2] = new Quiz(90);
	    quiz[3] = new Quiz(50);
	    quiz[4] = new Quiz(75);
	    
	    int choice = 0;
	    
	    while (valid == false) {
	    	System.out.print("Enter metric to use, 1 for maximum, 2 for minimum, 3 for average: ");
	    	choice = num.nextInt();
	    
	    	if (choice < LOWER || choice > UPPER) {
	    	valid = false;
	    	} else {valid = true;}
	    }
	    
	    num.close();

		JFrame frame = new JFrame();
	    JPanel panel = new JPanel();
	    
	    if (choice == 1) {metric = "Maximum";}
	    if (choice == 2) {metric = "Minimum";}
	    if (choice == 3) {metric = "Average";}
	    
	    JButton bankAccountButton = new JButton("Get " + metric + " Balance");
	    panel.add(bankAccountButton);
	    ActionListener listener1 = new ButtonListener(bank, metric);
	    bankAccountButton.addActionListener(listener1);
	    
	    JButton countryButton = new JButton("Get " + metric + " Area");
	    panel.add(countryButton);
	    ActionListener listener2 = new ButtonListener(countries, metric);
	    countryButton.addActionListener(listener2);
	    
	    JButton quizButton = new JButton("Get " + metric + " Score");
	    panel.add(quizButton);
	    ActionListener listener3 = new ButtonListener(quiz, metric);
	    quizButton.addActionListener(listener3);
	    
	    frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
	    frame.add(panel);
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.setVisible(true);
	}
}
