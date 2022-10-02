package hacknelio;

import java.util.Scanner;

public class MediaParesDSArray {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Quantos elementos vai ter o vetor?");
		int n = sc.nextInt();
		
		System.out.println(mediaPares(fillArray(n, sc)));
		
	}
	
	public static int[] fillArray(int n, Scanner sc) {
		int[] array = new int[n];
		
		for (int i = 0; i < n; i++) {
			array[i] = sc.nextInt();
		}
		
		return array;
	}
	
	public static double mediaPares(int[] arr) {
		double total = 0;
		int count = 0;
		for (int e : arr) {
			if (e % 2 == 0) {
				total = total + e;
				count++;
			}
		}
		if (total == 0) {
			System.out.print("NENHUM NUMERO PAR: ");
		} 
		return total / count;
	}
}
