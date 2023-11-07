package edu.monmouth.Interface;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonListener implements ActionListener {
	Measurable[] objects;
	String metric;
	
	public ButtonListener(Measurable[] objects, String metric) {
		this.objects = objects;
		this.metric = metric;
	}
	
	public void actionPerformed(ActionEvent e) {
		double result = 0;
		
		if (metric == "Maximum") {
			result = Data.max(objects);
		}
		if (metric == "Minimum") {
			result = Data.min(objects);
		}
		if (metric == "Average") {
			result = Data.average(objects);
		}
		
		if (objects[0].getClass().getSimpleName().equals("BankAccount")) {
			System.out.println(metric + " Balance: " + result);
		}
		
		if (objects[0].getClass().getSimpleName().equals("Country")) {
			System.out.println(metric + " Area: " + result);
		}
		
		if (objects[0].getClass().getSimpleName().equals("Quiz")) {
			System.out.println(metric + " Score: " + result);
		}
	}

}
