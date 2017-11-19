package uebung3;

import static org.junit.Assert.*;

import org.junit.Test;

import uebung3.Fibonacci;

public class FibonacciTest {
	
	
	
	@Test
	public void testFibonacci0(){
		Fibonacci f = new Fibonacci();
		int n = 0;
		int[] b = new int[n];
		b = f.calcFibonacci(n);
		assertEquals("0 is ok", b[0], 0);
	}
	
	@Test
	public void testFibonacci9(){
		Fibonacci f = new Fibonacci();
		int n = 9;
		int[] b = new int[n];
		int[] result = {0,1,1,2,3,5,8,13,21,34};
		b = f.calcFibonacci(n);
		assertArrayEquals("0 is ok", b, result);
	}
	
}
