package com.challenge.controlhub.service;

import java.math.BigInteger;

public interface FibonacciService {
	
	/**
	 * Calculates the Fibonacci number at the given index.
	 *
	 * @param n The index of the Fibonacci number to calculate.
	 * @return The Fibonacci number at the specified index.
	 */
	public BigInteger calculateFibonacci(int n);

}
