package hack;

import java.util.Scanner;

/*
 * Problem: 
 * You are given a 6 * 6 2d Array. An hourglass in an array
 * is a portion shaped like this:
 * 
 * a b c
 *   d  
 * e f g
 * 
 * In this problem you have to print the largest sum among
 * all the hourglasses in the array.
 * 
 * Input format:
 * There will be exactly 6 lines, each containing 6 integers
 * separated by spaces. Each integer will be between -9 and 9 inclusive.
 * 
 * Output formart:
 * Print the answer to this problem in a single line.
 * 
 * Sample output: 
 * 1 1 1 0 0 0
 * 0 1 0 0 0 0
 * 1 1 1 0 0 0
 * 0 0 2 4 4 0
 * 0 0 0 2 0 0
 * 0 0 1 2 4 0
 * 
 * Sample output:
 * 19
 * 
 * Explanation:
 * 2 4 4 
 *   4  
 * 1 2 4
 * 
 * That is 2 + 4 + 4 + 2 + 1 + 2 + 4 = 19;
 */

public class Java2DArrayHourglass {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] hourglass = new int[6][6];

		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 6; j++) {
				hourglass[i][j] = sc.nextInt();
			}
		}

		int a, b, c, d, e, f, g;
		int sum = 0;
		int total = 0;

		for (int x = 1; x <= 4; x++) {
			for (int y = 1; y <= 4; y++) {
				a = hourglass[x - 1][y - 1];
				b = hourglass[x - 1][y];
				c = hourglass[x - 1][y + 1];
				d = hourglass[x][y];
				e = hourglass[x + 1][y - 1];
				f = hourglass[x + 1][y];
				g = hourglass[x + 1][y + 1];
				sum = a + b + c + d + e + f + g;
				if (x == 1 && y == 1) {
					total = sum;
				}
				if (sum > total) {
					total = sum;
				}
			}
		}
		
		System.out.println(total);

		sc.close();
	}
}
