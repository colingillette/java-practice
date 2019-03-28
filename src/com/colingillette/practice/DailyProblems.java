package com.colingillette.practice;

import java.util.*;

public class DailyProblems {
	
	/*
	 * This problem was asked by Facebook.

		Given a list of integers, return the largest product that can be made by multiplying any three integers.
		For example, if the list is [-10, -10, 5, 2], we should return 500, since that's -10 * -10 * 5.
		You can assume the list has at least three integers.
	 */
	public int largestProduct(List<Integer> n) {
		int max = 0;
		
		for (int i : n) {
			for (int j : n) {
				for (int k : n) {
					if( k * j * i > max ) {
						max = k * j * i;
					}
				}
			}
		}
		
		return max;
	}
	
	/*
	 * This problem was asked by Facebook.

		Given a array of numbers representing the stock prices of a company in chronological order, 
		write a function that calculates the maximum profit you could have made from buying and selling 
		that stock once. You must buy before you can sell it.

		For example, given [9, 11, 8, 5, 7, 10], you should return 5, since you could buy the stock at 
		5 dollars and sell it at 10 dollars.
	 */
	public int stockMax(int[] n) {
		int max = 0;
		
		for (int i = 0; i < n.length - 1; i++) {
			for (int j = i + 1; j < n.length; j++) {
				if (n[j] - n[i] > max) {
					max = n[j] - n[i];
				}
			}
		}
		
		return max;
	}
	
	/*
	 * This problem was asked by Google.
	 * 
	 * Given an array of integers where every integer occurs three times except for one integer, 
	 * which only occurs once, find and return the non-duplicated integer.
	 * 
	 * For example, given [6, 1, 3, 3, 3, 6, 6], return 1. Given [13, 19, 13, 13], return 19.
	 */
	public int nonDuplicated(int[] n) {
		Arrays.sort(n);
		for (int i = 0; i < n.length - 2; i += 3) {
			if (n[i] != n[i + 1]) {
				return n[i];
			}
		}
		return n[n.length - 1];
	}
	
	/*
	 * This problem was asked by Jane Street.
	 * 
	 * Given a 2d array representing currency exchange rates, 
	 * see if there is any arbitrage.
	 */
	public boolean arbitrage(double[][] currency) {
		
		
		return false;
	}
}
