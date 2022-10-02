package hacknelio;

import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class DadosPessoasDSArray {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Quantas pessoas serao digitadas?");
		int n = sc.nextInt();
		Pessoa[] pessoas = new Pessoa[n];
		for (int i = 0; i < n; i++) {
			Double altura = sc.nextDouble();
			sc.nextLine();
			String genero = sc.nextLine();
			pessoas[i] = new Pessoa(altura, genero);
		}
		
	
		System.out.println(menorAltura(pessoas));	
		System.out.println(maiorAltura(pessoas));	
		System.out.println(mediaDasAlturasDasMulheres(pessoas));	
		System.out.println(numeroDeHomens(pessoas));	
		
	}

	public static int numeroDeHomens(Pessoa[] pessoas) {
		int total = 0;
		for (Pessoa p : pessoas) {
			if (p.getGenero().contains("M")) {
				total++;
			}
		}
		return total;
		
	}

	public static Double mediaDasAlturasDasMulheres(Pessoa[] pessoas) {
		Double total = 0.0;
		int count = 0;
		for (Pessoa p : pessoas) {
			if (p.getGenero().contains("F")) {
				total = total + p.getAltura();
				count++;
			}
		}
		Double avg = total / count;
		DecimalFormat format = new DecimalFormat("#.##");
		
		return Double.valueOf(format.format(avg));
	}

	public static double maiorAltura(Pessoa[] pessoas) {
		double maior = 1;
		for (Pessoa p : pessoas) {
			if (p.getAltura() > maior) {
				maior = p.getAltura();
			}
		}
		return maior;
	}

	public static double menorAltura(Pessoa[] pessoas) {
		double menor = 10;
		for (Pessoa p : pessoas) {
			if (p.getAltura() < menor) {
				menor = p.getAltura();
			}
		}
		return menor;
	}
	
	
}
