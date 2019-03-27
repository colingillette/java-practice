package com.colingillette.practice;

import java.util.*;

public class AP {
	
	/*
	 * wordsWithout -> return an array list of strings excluding any of the given length
	 * Input: words -> the array of strings to parse, len -> any strings of this length are removed
	 * Output: an array list of strings without entries of length len
	 */
	public List<String> wordsWithoutList(String[] words, int len) {
		ArrayList<String> out = new ArrayList<String>();
		for (int i = 0; i < words.length; i++) {
			if (words[i].length() != len) {
				out.add(words[i]);
			}
		}
		Collections.sort(out);
		
		return out;
	}
	
	/*
	 * dividesSelf -> returns true if every digit in a number divides evenly into the number
	 * Input: n -> the number we are checking
	 * Output: boolean result
	 */
	public boolean dividesSelf(int n) {
		int i;
		while (n > 0) {
			i = n % 10;
			if (n % i != 0) {
				return false;
			}
			n /= 10;
		}
		return true;
	}
}
