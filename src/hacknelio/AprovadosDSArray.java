package hacknelio;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class AprovadosDSArray {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Quantos alunos serao digitados?");
		int n = sc.nextInt();
		
		for (String e : alunosAprovados(fillArray(n, sc))) {
			System.out.println(e);
		}
		
	}
	
	public static Aluno[] fillArray(int n, Scanner sc) {
		Aluno[] alunos = new Aluno[n];
		for (int i = 0; i < n; i++) {
			sc.nextLine();
			String name = sc.nextLine();
			Double firstGrade = sc.nextDouble();
			Double secondGrade = sc.nextDouble();
			alunos[i] = new Aluno(name, firstGrade, secondGrade);
		}
		return alunos;
	}
	
	public static List<String> alunosAprovados(Aluno[] alunos) {
		List<String> list = new ArrayList<>();
		double avg = 0;
		for (Aluno a : alunos) {
			avg = (a.getFirstGrade() + a.getSecondGrade()) / 2;
			if (avg >= 6) {
				list.add(a.getName());
			}
		}
		return list;
	}
}
