package com.challenge.controlhub;

import java.math.BigInteger;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.challenge.controlhub.service.impl.FibonacciServiceImpl;
import com.challenge.controlhub.service.FibonacciService;

@SpringBootTest
class FibonacciApplicationTests {

	@Test
    void testCalculateFibonacciForIndex3() {
		FibonacciService fibonacciService = new FibonacciServiceImpl();
        BigInteger result = fibonacciService.calculateFibonacci(3);

        BigInteger expectedResult = BigInteger.valueOf(2);

        Assertions.assertEquals(expectedResult, result);
    }

    @Test
    void testCalculateFibonacciForIndex6() {
    	FibonacciService fibonacciService = new FibonacciServiceImpl();
        BigInteger result = fibonacciService.calculateFibonacci(6);

        BigInteger expectedResult = BigInteger.valueOf(8);

        Assertions.assertEquals(expectedResult, result);
    }

}
