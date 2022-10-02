package hacknelio;

import java.util.Scanner;

public class MaisVelhoDSArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Quantas pessoas vc vai digitar?");
		int n = sc.nextInt();
		
		System.out.println(pessoaMaisVelha(fillArray(n, sc)));
	}
	
	public static Pessoa[] fillArray(int n, Scanner sc) {
		Pessoa[] pessoas = new Pessoa[n];
		
		for (int i = 0; i < n; i++) {
			sc.nextLine();
			String nome = sc.nextLine();
			Integer idade = sc.nextInt();
			pessoas[i] = new Pessoa(nome, idade);
		}
		return pessoas;
	}
	
	public static String pessoaMaisVelha(Pessoa[] pessoas) {
		int greater = 0;
		String nome = null;
		for (Pessoa p : pessoas) {
			if (p.getIdade() > greater) {
				greater = p.getIdade();
				nome = p.getName();
			}
		}
		return nome;
	}
	
}
