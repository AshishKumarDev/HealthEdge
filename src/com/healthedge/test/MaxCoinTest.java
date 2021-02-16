package com.healthedge.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Before;
import org.junit.Test;


import com.healthedge.interview.MaxCoin;



public class MaxCoinTest {
	
	private MaxCoin maxCoin;
	
	  @Before                                        
	    public void setUp() throws Exception {
		  maxCoin = new MaxCoin();
	    }

	@Test
	public void maxSumOfCointest() {
		
		int expectedSum=16;
		int[][] matrix = { { 0, 3, 1, 1 }, { 2, 4, 4, 4 }, { 1, 5, 3, 1 } };
		
		int actualSum=maxCoin.maxSumOfCoin(matrix);
		assertEquals(expectedSum, actualSum);
	}
	
	@Test
	public void maxSumOfCointestDefault() {
		
		int expectedSum=12;
		int[][] matrix = { { 0, 3, 1, 1 }, { 2, 0, 0, 0 }, { 1, 5, 3, 1 } };
		
		int actualSum=maxCoin.maxSumOfCoin(matrix);
		assertEquals(expectedSum, actualSum);
	}
	
	@Test
	public void maxSumOfCointestWhenMatrixEmpty() {
		
		int expectedSum=0;
		int[][] matrix = {};
		
		int actualSum=maxCoin.maxSumOfCoin(matrix);
		assertEquals(expectedSum, actualSum);
	}
}
