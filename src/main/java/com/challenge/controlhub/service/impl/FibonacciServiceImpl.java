package com.challenge.controlhub.service.impl;

import java.math.BigInteger;

import org.springframework.stereotype.Service;

import com.challenge.controlhub.service.FibonacciService;

import lombok.extern.slf4j.Slf4j;

/**
 * Service for calculating the Fibonacci number at a specified index.
 */
@Slf4j
@Service
public class FibonacciServiceImpl implements FibonacciService {

	@Override
	public BigInteger calculateFibonacci(int n) {
		if (n <= 0) {
            return BigInteger.ZERO;
        }

        BigInteger[][] matrix = {{BigInteger.ONE, BigInteger.ONE}, {BigInteger.ONE, BigInteger.ZERO}};
        power(matrix, n - 1);

        return matrix[0][0];
    }

	/**
	 * Raises the matrix to the power of 'n' using a recursive divide-and-conquer approach.
	 *
	 * @param matrix The matrix to be raised to the power.
	 * @param n The exponent.
	 */
    private static void power(BigInteger[][] matrix, int n) {
        if (n <= 1) {
            return;
        }

        BigInteger[][] temp = {{BigInteger.ONE, BigInteger.ONE}, {BigInteger.ONE, BigInteger.ZERO}};
        power(matrix, n / 2);
        multiply(matrix, matrix);

        if (n % 2 != 0) {
            multiply(matrix, temp);
        }
    }

    /**
     * Multiplies two matrices and stores the result in the first matrix.
     *
     * @param matrix1 The first matrix to be multiplied.
     * @param matrix2 The second matrix to be multiplied.
     */
    private static void multiply(BigInteger[][] matrix1, BigInteger[][] matrix2) {
        BigInteger a = matrix1[0][0].multiply(matrix2[0][0]).add(matrix1[0][1].multiply(matrix2[1][0]));
        BigInteger b = matrix1[0][0].multiply(matrix2[0][1]).add(matrix1[0][1].multiply(matrix2[1][1]));
        BigInteger c = matrix1[1][0].multiply(matrix2[0][0]).add(matrix1[1][1].multiply(matrix2[1][0]));
        BigInteger d = matrix1[1][0].multiply(matrix2[0][1]).add(matrix1[1][1].multiply(matrix2[1][1]));

        matrix1[0][0] = a;
        matrix1[0][1] = b;
        matrix1[1][0] = c;
        matrix1[1][1] = d;
    }
}
