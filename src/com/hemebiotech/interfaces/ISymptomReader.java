package com.hemebiotech.interfaces;

import java.util.*;

/**
 *<p> Anything that will read symptom data from a source
 * The important part is, the return value from the operation, which is a list of strings,
 * that may contain many duplications.</p>
 * <p>The implementation does not need to order the list.</p>
 * 
 */
public interface ISymptomReader {
	
	/**
	 * <p>Reader of symptoms</p>
	 * <p>Read data from a file of symptoms line by line and put it in a map</p>
	 * @return Map of symptoms and their counts
	 */	
	Map<String, Integer> symptomReader() ;

}
