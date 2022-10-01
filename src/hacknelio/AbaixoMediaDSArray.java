package hacknelio;

import java.util.Locale;
import java.util.Scanner;

public class AbaixoMediaDSArray {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos elementos vai ter o vetor?");
		int n = sc.nextInt();
		double[] arr = new double[n];
		
		fillArray(n, arr, sc);
		
		System.out.println(average(arr));
		
		elementLessThanAvg(arr, average(arr));
	}

	private static void elementLessThanAvg(double[] arr, double d) {
		for (double e : arr) {
			if (e < d) {
				System.out.println(e);
			}
		}
	}

	private static double average(double[] arr) {
		double sum = 0;
		for (double e : arr) {
			sum = sum + e;
		}
		return sum / arr.length;
	}

	private static void fillArray(int n, double[] arr, Scanner sc) {
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextDouble();
		}
	}
}
