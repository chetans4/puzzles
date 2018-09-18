package org.chetan.main;

// Fibonacci Seriese > 1,1,2,3,5,8,13.....
public class FibonacciNumber {

	static int fib(int n) {
		if (n <= 1)
			return n;
		return fib(n - 1) + fib(n - 2);
	}

	public static void main(String args[]) {
		int index = 9;
		System.out.println(fib(index));
	}
}
