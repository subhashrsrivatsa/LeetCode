/**
 * 
 */
package com.leetcode.topinterviewquestions;

/**
 * @author Subhash
 * 
 * Best Time to Buy and Sell Stock - You are given an array prices where prices[i] is the price of a given stock on the ith day. 
 * Find the maximum profit you can achieve. 
 * You may complete as many transactions as you like (i.e., buy one and sell one share of the stock multiple times).
 *
 */
public class BestTimeToBuyStocksAndSell {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] prices = {7,1,5,3,6,4};
		int fee = 2;
		
		System.out.println(maxProfit(prices,fee));
	}

	private static int maxProfit(int[] prices, int fee) {
		int cash = 0;
		int hold = -prices[0];
		for(int i=0;i<prices.length;i++) {
			cash = Math.max(cash, hold+prices[i]-fee);
			hold = Math.max(hold, cash-prices[i]);
		}
		return cash;		
	}

}
