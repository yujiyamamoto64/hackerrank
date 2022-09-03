package hack30;

import java.util.Scanner;

/*
 * https://www.hackerrank.com/challenges/30-interfaces/problem
 */

interface AdvancedArithmetic {
	int divisorSum(int n);
}

class D19Calculator implements AdvancedArithmetic {
	public int divisorSum(int n) {
		int sum = 0;
		for (int i = n; i>=1; i--) {
			if (n % i == 0) sum = sum + i;
		}
		return sum;
	}
}

public class Day19Interfaces {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.close();

		AdvancedArithmetic myCalculator = new D19Calculator();
		int sum = myCalculator.divisorSum(n);
		System.out.println("I implemented: " + myCalculator.getClass().getInterfaces()[0].getName());
		System.out.println(sum);
	}
}
