package hack;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * https://www.hackerrank.com/challenges/java-exception-handling-try-catch/problem
 */

public class ExceptionHandlingTryCatchProblem {

	public static void main(String[] args) {
		
		var sc = new Scanner(System.in);
		
		try {
			int x = sc.nextInt();
			int y = sc.nextInt();
			
			System.out.println(x / y);
		} catch (InputMismatchException e) {
			System.out.println("java.util.InputMismatchException");
		} catch (ArithmeticException e) {
			System.out.println("java.lang.ArithmeticException: / by zero");
		}
	}
}
