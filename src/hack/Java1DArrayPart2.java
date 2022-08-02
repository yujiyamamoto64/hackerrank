package hack;

import java.util.Scanner;

/*
 * https://www.hackerrank.com/challenges/java-1d-array/problem
 */

public class Java1DArrayPart2 {

	public static boolean canWin(int leap, int[] game) {

		return isSolvable(leap, game, 0);
	}

	public static boolean isSolvable(int leap, int[] game, int i) {
		if (i >= game.length)
			return true;
		if (i < 0 || game[i] == 1)
			return false;
		game[i] = 1;

		return isSolvable(leap, game, i + leap) 
				|| isSolvable(leap, game, i + 1) 
				|| isSolvable(leap, game, i - 1);
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int q = sc.nextInt();

		while (q-- > 0) {
			int n = sc.nextInt();
			int leap = sc.nextInt();
			int[] game = new int[n];

			for (int i = 0; i < n; i++) {
				game[i] = sc.nextInt();
			}

			System.out.println((canWin(leap, game)) ? "YES" : "NO");

		}
		sc.close();
	}
}
