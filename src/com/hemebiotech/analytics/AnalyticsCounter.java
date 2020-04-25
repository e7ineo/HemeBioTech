package com.hemebiotech.analytics;

public class AnalyticsCounter {
	
	public static void main(String [] args) {
		
		SymptomWriter sw = new SymptomWriter();
		SymptomReader sr = new SymptomReader();
		
		sw.symptomWriter(sr.symptomReader());
		
	}
}
