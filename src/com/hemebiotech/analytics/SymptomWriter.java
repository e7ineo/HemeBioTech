package com.hemebiotech.analytics;

import java.io.*;
import java.util.*;

/**
 *Contains methods to write symptoms data to a file.
 */
public class SymptomWriter implements ISymptomWriter {
	
	/**
	 * Constructor of SymptomWriter
	 */
	public SymptomWriter() {
		
	}
	
	/**
	 *{@inheritDoc}
	 */	
	@Override
	public void symptomWriter(Map<String, Integer> map) {
		
		PropertiesFile properties = new PropertiesFile();
		
		try{
			
			if(!map.entrySet().isEmpty()) {
				
				FileWriter writer = new FileWriter(properties.getFileNameOut());
				
				for(Map.Entry <String, Integer> e : map.entrySet()) {
					
					writer.write(e.getKey() + " : " + e.getValue() + "\n");
					
				}
				
				System.out.println("Data write to file : " + properties.getFileNameOut());
				
				writer.close();	
				
			}
			
			else System.out.println("Map is empty.No file created.");
		
		
		}catch(IOException e) {
			
			System.out.println("Impossible to write in the file");
			
		}
		
	}

}
