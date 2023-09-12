package com.challenge.controlhub.web.api.impl;

import java.math.BigInteger;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.challenge.controlhub.service.FibonacciService;

import lombok.extern.slf4j.Slf4j;

/**
 * Controller for the Fibonacci API.
 */
@Slf4j
@RestController
@RequestMapping("/api")
public class FibonacciApiImpl {
	
	private static final Logger logger = LoggerFactory.getLogger(FibonacciApiImpl.class);
	
	@Autowired
	private FibonacciService fibonacciService;
	
	/**
     * Gets the Fibonacci number at the specified index 'n'.
     *
     * @param n The index of the Fibonacci number to retrieve.
     * @return ResponseEntity containing the Fibonacci number.
     */
	@GetMapping("/fibonacci/{n}")
	public ResponseEntity<BigInteger> getFibonacci(@PathVariable int n) {
		ResponseEntity<BigInteger> response = null;
		try{
			return new ResponseEntity<>(fibonacciService.calculateFibonacci(n), HttpStatus.OK);
								
		} catch(Exception ex) {
			logger.error(ex.getMessage());
			response = new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return response;
	}
}
