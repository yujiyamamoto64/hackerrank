package hacknelio;

import java.util.Locale;
import java.util.Scanner;

public class AlturaDSArray {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantas pessoas serao digitadas?");
		
		int n = sc.nextInt();
		
		Pessoa[] pessoas = new Pessoa[n];
		
		for (int i = 0; i < pessoas.length; i++ ) {
			
			System.out.println("Dados da " + (i+1) + "a Pessoa:");
			
			System.out.println("Nome:");
			sc.nextLine();
			String name = sc.nextLine();
			
			
			System.out.println("Idade:");
			Integer idade = sc.nextInt();
			
			System.out.println("Altura:");
			Double altura = sc.nextDouble();
			
			pessoas[i] = new Pessoa(name, idade, altura);
		}
		
		System.out.println(alturaMedia(pessoas));
		
		System.out.println(menorDe16Anos(pessoas));
		
		for (Pessoa p : pessoas) {
			if (p.getIdade() < 16) {
				System.out.println(p);
			}
		}
	}

	public static double alturaMedia(Pessoa[] pessoas) {
		double media = 0;
		
		for (int i = 0; i < pessoas.length; i++) {
			media = media + pessoas[i].getAltura();
		}
		
		return media / pessoas.length;
	}
	
	public static double menorDe16Anos(Pessoa[] pessoas) {
		int n = 0;
		
		for (int i = 0; i < pessoas.length; i++) {
			if (pessoas[i].getIdade() < 16) {
				n++;
			}
		}
		
		return n * 100 / pessoas.length;
	}
}
