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
	 * This problem was asked by Microsoft.
	 * 
	 * A number is considered perfect if its digits sum up to exactly 10.
	 * Given a positive integer n, return the n-th perfect number.
	 * 
	 * For example, given 1, you should return 19. Given 2, you should return 28.
	 */
	public int perfectNumber(int n) {
		if (get_sum(n) != 10 && n < 10) {
			n *= 10;
			for (int i = 1; i < 10; i++) {
				n += i;
				if (get_sum(n) == 10) {
					return n;
				}
				else {
					n -= i;
				}
			}
		}
		return n;
	}
	
	// helper function for perfectNumber
	private int get_sum(int n) {
		int sum = 0;
		while (n > 0) {
			sum += n % 10;
			n /= 10;
		}
		return sum;
	}
	
	/*
	 * This problem was asked by Google.
	 * You are given an N by M 2D matrix of lowercase letters. Determine the minimum number of columns that can be removed to ensure that each row is ordered from top to bottom lexicographically. That is, the letter at each column is lexicographically later as you go down each row. It does not matter whether each row itself is ordered lexicographically.
	 * For example, given the following table:
	 * cba
	 * daf
	 * ghi
	 * 
	 * This is not ordered because of the a in the center. We can remove the second column to make it ordered:
	 * ca
	 * df
	 * gi
	 * 
	 * So your function should return 1, since we only needed to remove 1 column.
	 * 
	 * As another example, given the following table:
	 * 
	 * abcdef
	 * 
	 * Your function should return 0, since the rows are already ordered (there's only one row).
	 * 
	 * As another example, given the following table:
	 * 
	 * zyx
	 * wvu
	 * tsr
	 * 
	 * Your function should return 3, since we would need to remove all the columns to order it.
	 * 
	 * Sample input { { 'c', 'b', 'a' }, { 'd', 'a', 'f' }, { 'g', 'h', 'i' } }
	 */
	public int changesForVerticalOrder(char[][] ch) {
		if (ch[0].length == 1) {
			return 0;
		}
		else {
			int count = 0;
			for (int i = 0; i < ch[0].length; i++) {
				for (int j = 0; j < ch.length - 1; j++) {
					if (ch[j][i] > ch[j+1][i]) {
						count++;
						break;
					}
				}
			}
			
			return count;
		}
	}
}
