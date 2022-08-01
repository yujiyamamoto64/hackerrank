package hack;

import java.util.Scanner;

/*
 * Problem: 
 * Given an array of n integers, find and print its number
 * of negative subarrays on a new line.
 * 
 * Example:
 * Array = {1, 2, 3}
 * Subarrays: [1], [2], [3], [1,2], [2,3] and [1, 2, 3];
 * 
 * So, sample input:
 * 5
 * 1 -2 4 -5 1
 * 
 * Sample output:
 * 9
 * 
 * Explanation: 
 * [1:1] -> -2
 * [3:3] -> -5
 * [0:1] -> 1 - 2 = -1
 * [2:3] -> 4 -5 = -1
 * [3:4] -> -5 + 1 = -4
 * [1:3] -> -2 +4 -5 = -3
 * [0:3] -> 1 -2 +4 -5 +1 = -2
 * [1:4] -> -2 +4 -5 +1 = -2
 * [0:4] -> 1 -2 +4 -5 +1 = -1
 */

public class JavaNegativeSubarrays {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] array = new int[n];

		for (int i = 0; i < n; i++) {
			array[i] = sc.nextInt();
		}

		int count = 0;

		for (int i = 0; i < array.length; i++) {

			for (int j = i; j < array.length; j++) {

				int sum = 0;
				for (int k = i; k <= j; k++) {
					sum = sum + array[k];
				}
				if (sum < 0) {
					count++;
				}
			}
		}

		System.out.println(count);
		sc.close();
	}
}
