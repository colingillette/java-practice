package com.colingillette.practice;

import java.util.*;

public class Solution {
	public static void main(String[] args) {
		WarmupTwo w2 = new WarmupTwo();
		AP ap = new AP();
		DailyProblems dp = new DailyProblems();
		
		System.out.println(w2.stringTimes("Hi", 3));
		System.out.println(w2.doubleX("axcxcsx"));
		System.out.println(w2.doubleX("axxxcsx"));
		System.out.println(w2.doubleX("axcxcs"));
		System.out.println(w2.stringYak("asdyak"));
		System.out.println(w2.stringYak("yakasd"));
		System.out.println(w2.stringYak("asdfwer"));
		System.out.println();
		
		String[] ar = { "aa",  "bbb", "ccc", "a" };
		System.out.println(ap.wordsWithoutList(ar, 1));
		System.out.println(ap.dividesSelf(128));
		System.out.println(ap.dividesSelf(129));
		System.out.println();
		
		ArrayList<Integer> l = new ArrayList<Integer>();
		l.add(-10);
		l.add(-10);
		l.add(5);
		l.add(2);
		System.out.println(dp.largestProduct(l));
		int[] n = { 9, 11, 8, 5, 7, 10 };
		System.out.println(dp.stockMax(n));
		int[] n1 = { 6, 5, 5, 5, 3 };
		System.out.println(dp.stockMax(n1));
		int[] n2 = { 6, 1, 3, 3, 3, 6, 6 };
		System.out.println(dp.nonDuplicated(n2));
		int[] n3 = { 13, 19, 13, 13 };
		System.out.println(dp.nonDuplicated(n3));
		int[] n4 = { 6, 4, 3, 3, 3, 6, 6, };
		System.out.println(dp.nonDuplicated(n4));
		
		
	}
}
