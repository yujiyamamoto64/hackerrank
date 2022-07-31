package hack;

import java.util.Scanner;

/* 
 * Instructions: 
 * Using interface, the program have to sum all the divisors 
 * user input number.
 * 
 * Sample input:
 * 6
 * 
 * Output:
 * I implemented: AdvancedArithmetic
 * 12
 * 
 * Explanation: 
 * 1 + 2 + 3 + 6 = 12
 */

interface AdvancedArithmetic {

	int divisor_sum(int n);
}

class MyCalculator implements AdvancedArithmetic{

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		MyCalculator calculator = new MyCalculator();
		System.out.println("I implemented: AdvancedArithmetic");
		System.out.println(calculator.divisor_sum(n));
		
		sc.close();
	}

	@Override
	public int divisor_sum(int n) {
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				sum = sum + i;
			}
		}
		return sum;
	}
}
