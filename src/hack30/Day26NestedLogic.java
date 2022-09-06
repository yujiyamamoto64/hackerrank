package hack30;

import java.util.Scanner;

/*
 * https://www.hackerrank.com/challenges/30-nested-logic/problem
 */

public class Day26NestedLogic {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s[] = sc.nextLine().split(" ");
		int[] ret = new int [s.length];
		int[] due = new int [s.length];
		
		for (int i = 0; i < s.length; i++) {
			ret[i] = Integer.parseInt(s[i]);
		}
		
		s = sc.nextLine().split(" ");
		for (int i = 0; i < s.length; i++) {
			due[i] = Integer.parseInt(s[i]);
		}
		
		int fine;
		
		if (ret[2] > due[2]) fine = 10000;
		else if (ret[1] > due[1] && ret[2]==due[2]) fine = 500 * (ret[1] - due[1]);
		else if (ret[0] > due[0] && ret[1]==due[1] && ret[2]==due[2]) fine = 15 * (ret[0] - due[0]);
		else fine = 0;
		
		System.out.println(fine);
	}
}
