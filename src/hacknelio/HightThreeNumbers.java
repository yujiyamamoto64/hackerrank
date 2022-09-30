package hacknelio;

import java.util.Scanner;

public class HightThreeNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		System.out.println(higher(a, b, c));
		
		sc.close();
	}

	public static int higher(int a, int b, int c) {

		if (a > b && a > c) {
			return a;
		} else if (b > c) {
			return b;
		} else {
			return c;
		}
	}
}
