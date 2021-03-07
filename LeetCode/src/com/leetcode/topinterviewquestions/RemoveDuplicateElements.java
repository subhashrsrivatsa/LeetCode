/**
 * 
 */
package com.leetcode.topinterviewquestions;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * @author Subhash
 * 
 * Remove Duplicates from Sorted Array - Given a sorted array nums, remove the duplicates in-place such that each element appears only 
 * once and returns the new length.
 *
 */
public class RemoveDuplicateElements {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//sorted array
		int[] a = {1,2,3,3,4,5,6,6,7,8,8,8,9};
		
		int current = a[0];
		boolean found = false;
		
		for(int i=0;i<a.length;i++) {
			if(current == a[i] && !found) {
				found = true;
			}
			else if(current != a[i]) {
				System.out.print(" "+current);
				current = a[i];
				found = false;
			}
		}
		System.out.print(" "+current);
		
		usingSetCollection(a);
	}

	private static void usingSetCollection(int[] a) {
		System.out.println("\nUsing Set Collection");
		int end = a.length;
		Set<Integer> set = new HashSet<Integer>();
		for(int i=0;i<end;i++) {
			set.add(a[i]);
		}
				
		Iterator<Integer> it = set.iterator();
		while(it.hasNext()){
			System.out.print(" "+ it.next());
		}
	}
}
