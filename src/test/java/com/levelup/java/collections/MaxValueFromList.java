package com.levelup.java.collections;

import static org.junit.Assert.assertEquals;

import java.util.Collections;
import java.util.List;

import org.junit.Test;

import com.google.common.collect.Lists;
import com.google.common.collect.Ordering;
import com.google.common.primitives.Ints;

/**
 * This java snippet will demonstrate getting max value of a list
 * of integers and strings.
 * 
 * @author Justin Musgrove
 * @see <a href='http://www.leveluplunch.com/java/'></a>
 * 
 */
public class MaxValueFromList {
	
	private static List<Integer> CENTERS_ROOKIE_YEAR = Lists.newArrayList(
			1946, 1988, 1970, 1931, 1940, 1920, 1980, 1953, 1960, 1974, 1987
			);
	
	@Test
	public void find_max_value_from_list_of_integers_java () {

		Integer maxElement = Collections.max(CENTERS_ROOKIE_YEAR);
		
		assertEquals(new Integer (1988), maxElement);
	}

	
	@Test
	public void find_max_value_from_list_of_integers_guava_ordering() {

		Ordering<Integer> byYear = new Ordering<Integer>() {
		    @Override
		    public int compare(Integer left, Integer right) {
		        return Ints.compare(left, right);
		    }
		};		
		
		assertEquals(new Integer (1988), byYear.max(CENTERS_ROOKIE_YEAR));
	}
	
	@Test
	public void find_max_value_from_list_of_integers_guava_ordering_shorthand () {

		Integer maxElement = Ordering.natural().max(CENTERS_ROOKIE_YEAR);
		
		assertEquals(new Integer (1988), maxElement);
	}
	
}