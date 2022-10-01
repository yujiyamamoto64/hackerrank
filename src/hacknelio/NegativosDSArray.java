package hacknelio;

import java.util.Scanner;

public class NegativosDSArray {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um n�mero inteiro positivo" 
				+ " de valor m�ximo igual a 10 e menor igual a -10." +
				" Este programa ir� mostrar os n�meros negativos digitados.");
		
		System.out.println("Quantos n�meros voc� pretende digitar?");
		
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		
		for (int i = 0; i < n; i++) {
			System.out.print("Digite um n�mero: ");
			arr[i] = sc.nextInt();
		}
		
		System.out.println("N�MEROS NEGATIVOS:");
		
		for (int i = 0; i < n; i++) {
			if (arr[i] < 0) {
				System.out.println(arr[i]);
			}
		}
		
	}
}
