package hack;

import java.util.Scanner;

/*
 * https://www.hackerrank.com/challenges/java-exception-handling/problem
 */

class MyCalculator2 {
	
	public long power(int n, int p) throws Exception{
		
		if (n == 0 && p == 0) {
			throw new Exception("n and p should not be zero.");
		}
		if (n < 0 || p < 0) {
			throw new Exception("n or p should not be negative.");
		}
		else {
			return (long) Math.pow(n, p);
		}
	}
}

public class JavaExceptionHandlingProblem {

	public static final MyCalculator2 my_calculator = new MyCalculator2();
    public static final Scanner in = new Scanner(System.in);
    
    public static void main(String[] args) {
        while (in .hasNextInt()) {
            int n = in .nextInt();
            int p = in .nextInt();
            
            try {
                System.out.println(my_calculator.power(n, p));
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}
