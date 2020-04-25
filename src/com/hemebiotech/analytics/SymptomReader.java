package com.hemebiotech.analytics;

import java.io.*;
import java.util.*;

/**
 *Contains methods to read data inside a file.
 */
public class SymptomReader implements ISymptomReader {

	/**
	 * Constructor of SymptomReader
	 */
	public SymptomReader() {
		
	}
	
	/**
	 *{@inheritDoc}
	 */
	@Override
	public Map<String, Integer> symptomReader() {
		
		PropertiesFile properties = new PropertiesFile();
		
		Map<String,Integer> results = new TreeMap<String,Integer>();
		
		BufferedReader read = null;
			
		try {
			
			read = new BufferedReader(new FileReader(properties.getFileNameIn()));
			
			String line;
			
			do {
				
				line = read.readLine();
				
				if(line != null) {

					results.merge(line, 1, Integer::sum);
					
				}
				
			}while(line != null);

			System.out.println("Data put in a Map");
			
			
		}catch(IOException e){
			
			System.out.println("File doesn't exist");
			
		}finally {
			
			if(read != null) {
				
				try {
					
					read.close();
				
				}catch (IOException e) {
					
				}
				
			}
			
		}
		
		return results;
			
	}
	
}