package hack;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
 * https://www.hackerrank.com/challenges/can-you-access/problem
 */

public class CanYouAccessProblem {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine().trim());
		Object o;// Must be used to hold the reference of the instance of the class
					// Solution.Inner.Private

		// Write your code here
		o = new Inner().new Private();
		System.out.println(num + " is " + ((CanYouAccessProblem.Inner.Private) o).powerof2(num));

		System.out.println("An instance of class: " + o.getClass().getCanonicalName() + " has been created");

	}// end of main

	static class Inner {
		private class Private {
			private String powerof2(int num) {
				return ((num & num - 1) == 0) ? "power of 2" : "not a power of 2";
			}
		}
	}// end of Inner

}// end of Solution
