package hack;

import java.util.Scanner;

public class Java1DArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		
		for (int number : a) {
			System.out.println(number);
		}
		
		sc.close();
	}
}
