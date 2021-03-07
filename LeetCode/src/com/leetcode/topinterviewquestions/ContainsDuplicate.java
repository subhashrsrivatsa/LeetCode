/**
 * 
 */
package com.leetcode.topinterviewquestions;

import java.util.Arrays;

/**
 * @author Subhash
 * 
 * Contains Duplicate - Given an integer array nums, 
 * return true if any value appears at least twice in the array, and return false if every element is distinct.
 *
 */
public class ContainsDuplicate {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int a[] = {1,3,5,7,9,2,4,6,8,0,0};
		if(containsDuplicate(a) == true) {
			System.out.println("The array contains any value at least twice");
		}
		else
			System.out.println("The array does not contains any value at least twice");
	}

	private static boolean containsDuplicate(int[] a) {
		Arrays.sort(a);
		for(int i=0;i<a.length-1;i++) {
			if(a[i]==a[i+1])
				return true;
		}
		return false;	
	}

}
