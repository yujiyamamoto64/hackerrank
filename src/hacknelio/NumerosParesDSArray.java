package hacknelio;

import java.util.Arrays;
import java.util.Scanner;

public class NumerosParesDSArray {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Quantos numeros voce vai digitar?");
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println(Arrays.toString(numerosPares(arr)));
		
		System.out.println(quantidadePares(numerosPares(arr)));
	}
	
	public static int[] numerosPares(int[] arr) {
		int count = 0;
		
		for (int e : arr) {
			if (e % 2 == 0) {
				count++;
			}
		}
		int[] vect = new int[count];
		
		int j = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				vect[j] = arr[i];
				j++;
			} 
		}
		
		return vect;
	}
	
	public static int quantidadePares(int[] arr) {
		return arr.length;
	}
}
