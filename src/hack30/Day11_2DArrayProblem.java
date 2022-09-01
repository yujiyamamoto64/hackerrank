package hack30;

import java.util.Scanner;

/*
 * https://www.hackerrank.com/challenges/30-2d-arrays/problem
 */

public class Day11_2DArrayProblem {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int vect[][] = new int[6][6];
		
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 6; j++) {
				vect[i][j] = sc.nextInt();
			}
		}
		
		int a, b, c, d, e, f, g;
		int count, max = 0;
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				a = vect[i][j];
				b = vect[i][j+1];
				c = vect[i][j+2];
				d = vect[i+1][j+1];
				e = vect[i+2][j];
				f = vect[i+2][j+1];
				g = vect[i+2][j+2];
				count = a+b+c+d+e+f+g;
				if (i==0 && j==0 ){
					max = count; 
				}
				if (count > max ) {
					max = count;
				}
			}
		}
		
		System.out.println(max);

	}

}
