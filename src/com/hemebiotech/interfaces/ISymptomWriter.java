package com.hemebiotech.interfaces;

import java.util.*;

/**
 *<p> Anything that will write symptoms data to a file</p>
 */
public interface ISymptomWriter {
	
	/**
	 * <p>Writer of symptoms to a file.</p>
	 * <p>Loop in the Map and put all values in a file</p>
	 * @param map Map&lt;String, Integer&gt;
	 */
	void symptomWriter(Map<String, Integer> map);
	
}
