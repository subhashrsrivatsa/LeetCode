/**
 * 
 */
package com.leetcode.topinterviewquestions;

/**
 * @author Subhash
 * 
 * Rotate Array - Given an array, rotate the array to the right by k steps, where k is non-negative.
 *
 */
public class RotateArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int a[] = {1,2,3,4,5,6,7,8,9};
		int k = 3;
		rotateArray(a,k);
	}

	private static void rotateArray(int[] a, int k) {
		k = k%a.length;
		int temp, previous;
		for(int i=0;i<a.length;i++) {
			previous = a[a.length-1];
			for(int j=0;j<a.length;j++) {
				temp = a[j];
				a[j]=previous;
				previous=temp;
			}
		}
	}
}
