package hacknelio;

import java.util.Arrays;
import java.util.Scanner;

public class SomaVetorDSArray {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos números voce vai digitar?");
		
		int n = sc.nextInt();
		
		double[] arr = new double[n];
		
		for (int i = 0; i < n; i++) {
			System.out.print("Digite um número: ");
			arr[i] = sc.nextInt();
		}
		
		System.out.println(valores(arr));
		System.out.println(soma(arr));
		System.out.println(media(soma(arr), arr));
		
	}
	
	public static String valores(double[] arr) {
		String intArray = Arrays.toString(arr);
		return intArray;
	}
	
	public static double soma(double[] arr) {
		double soma = 0;
		for (int i = 0; i < arr.length; i++) {
			soma = soma + arr[i];
		}
		return soma;
	}
	
	public static double media(double soma, double[] arr) {
		return soma / arr.length;
	}
}
