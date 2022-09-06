package hack30;

import java.util.Scanner;

/*
 * https://www.hackerrank.com/challenges/30-running-time-and-complexity/problem
 */

public class Day25RunningTimeAndComplexity {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			if (n == 1 || n < 1)
				System.out.println("Not prime");
			else {
				boolean prime = true;
				for (int i = 2; i * i <= n; i++) {
					if (n % i == 0) {
						prime = false;
						break;
					}

				}
				if (prime)
					System.out.println("Prime");
				else
					System.out.println("Not prime");
			}
		}

	}

}
