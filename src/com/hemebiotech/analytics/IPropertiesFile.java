package com.hemebiotech.analytics;

/**
 * <p>Contains method to access the properties inside the file.</p>
 */
public interface IPropertiesFile {
		
	
	/**
	 * <p>Get, from the properties file, the name of a file to read.</p>
	 * @return String containing the name of the file.
	 */
	String getFileNameIn();
	
	
	/**
	 * <p>Get, from the properties file, the name of a file to write.</p>
	 * @return String containing the name of the file.
	 */
	String getFileNameOut();

}
