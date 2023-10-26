package edu.monmouth.Interface;

public class Quiz implements Measurable {
	private double score;
	public final double LOWER = 0;
	public final double UPPER = 100;
	
	public double getMeasure() {
		return score;
	}
	
	public Quiz() {
		score = 0;
	}
	
	public Quiz(double inputScore) {
		if (inputScore < LOWER) {
			score = LOWER;
		} else if (inputScore > UPPER) {
			score = UPPER;
		} else {
			score = inputScore;
		}
	}

}
