package com.hemebiotech.analytics;

import java.io.*;
import java.util.*;

/**
 *<p>Contains method to access the properties inside the properties file.</p>
 */
public class PropertiesFile implements IPropertiesFile {
	

	
	/**
	 * <p>Will contain the name of the file to read or write</p>
	 */
	private String fileName;
	
	/**
	 * Constructor of PropertiesFile
	 */
	public PropertiesFile() {
		
	}
	
	/**
	 * {@inheritDoc}
	 */
	public String getFileNameIn() {
		
		try {
			
			Properties propertie = new Properties();
			propertie.load(new FileInputStream("symptoms.properties"));
			fileName = propertie.getProperty("nomFichierLire");
			
		}catch (FileNotFoundException e) {
			

		}catch (IOException e) {
		
		}

		return fileName;

	}
	

	/**
	 * {@inheritDoc}
	 */	
	public String getFileNameOut() {
		
		try {
			Properties propertie = new Properties();
			propertie.load(new FileInputStream("symptoms.properties"));
			fileName = propertie.getProperty("nomFichierEcrire");
			
		}catch (FileNotFoundException e) {

		}catch (IOException e) {
		
		}

		return fileName;
	}

	

}

