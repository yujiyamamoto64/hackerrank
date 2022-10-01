package hacknelio;

import java.util.Scanner;

public class NegativosDSArray {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número inteiro positivo" 
				+ " de valor máximo igual a 10 e menor igual a -10." +
				" Este programa irá mostrar os números negativos digitados.");
		
		System.out.println("Quantos números você pretende digitar?");
		
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		
		for (int i = 0; i < n; i++) {
			System.out.print("Digite um número: ");
			arr[i] = sc.nextInt();
		}
		
		System.out.println("NÚMEROS NEGATIVOS:");
		
		for (int i = 0; i < n; i++) {
			if (arr[i] < 0) {
				System.out.println(arr[i]);
			}
		}
		
	}
}
