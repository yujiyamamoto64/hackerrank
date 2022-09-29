package hacknelio;

import java.util.Scanner;

public class OperadoraDeTelefonia {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos minutos foram consumidos?");
		int min = sc.nextInt();
		int value = 50;
		
		if (min > 100) {
			value = 50 + (min - 100) * 2;
		}
		
		System.out.println("Valor a pagar: R$" + value + ".00");
	}
}
