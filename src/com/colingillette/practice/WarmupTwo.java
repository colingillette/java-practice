// Practice Problems from Coding Bat: Warmup 2

package com.colingillette.practice;

public class WarmupTwo {
	
	/*
	 * stringTimes(String s, int k)
	 * Input: String s --> Thing to repeat; Integer k --> Number of times to repeat String s
	 * Output: String of s repeated k times
	 */
	public String stringTimes(String s, int k) {
		String output = "";
		
		for (int i = 0; i < k; i++) {
			output += s;
		}
		
		return output;
	}
	
	/*
	 * doubleX(String s)
	 * Input: String s --> The thing we are parsing
	 * Output: Boolean ? the first instance of 'x' has another 'x' after it : it does not 
	 */
	public boolean doubleX(String s) {
		s = s.toLowerCase();
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'x' && i < s.length() - 1) {
				if (s.charAt(i + 1) == 'x') {
					return true;
				}
			}
		}
		
		return false;
	}
	
	/*
	 * stringYak(String s)
	 * Input: String s --> The string we are parsing for "yak"
	 * Output: A String minus the phrase "yak" if it is present
	 */
	public String stringYak(String s) {
		String keyword = "yak";
		s = s.toLowerCase();
		
		if (s.contains(keyword)) {
			String before = s.substring(0, s.indexOf(keyword));
			String after = s.substring(s.indexOf(keyword) + keyword.length());
			return before + after;
		}
		else {
			return s;
		}
	}
}
