package hacknelio;

import java.util.Scanner;

public class SwitchCaseDiaDaSemana {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Sendo 1=domingo, 2=segunda, " + "e assim por diante, escolha um n�mero da semana: ");
		int dia = sc.nextInt();

		switch (dia) {
		case 1:
			System.out.println("Dia da semana: Domingo");
			break;
		case 2:
			System.out.println("Dia da semana: Segunda");
			break;
		case 3:
			System.out.println("Dia da semana: Ter�a");
			break;
		case 4:
			System.out.println("Dia da semana: Quarta");
			break;
		case 5:
			System.out.println("Dia da semana: Quinta");
			break;
		case 6:
			System.out.println("Dia da semana: Sexta");
			break;
		case 7:
			System.out.println("Dia da semana: S�bado");
			break;
		default:
			System.out.println("Valor inv�lido");
		}
	}
}
