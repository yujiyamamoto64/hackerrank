package hacknelio;

import java.util.Scanner;

public class SomaVetoresDSArray {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Quantos valores vai ter cada vetor?");
		int n = sc.nextInt();
		
		int[] arr1 = new int[n];
		int[] arr2 = new int[n];
		
		fillArray(arr1, sc);
		fillArray(arr2, sc);
		
		thirdArray(arr1, arr2);
	}
	
	private static void thirdArray(int[] arr1, int[] arr2) {
		int[] arr3 = new int[arr1.length];
		
		for (int i = 0; i < arr1.length; i++) {
			arr3[i] = arr1[i] + arr2[i];
		}
		
		for (int e : arr3) {
			System.out.println(e);
		}
	}

	public static void fillArray(int[] arr, Scanner sc) {
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
	}
	
}
