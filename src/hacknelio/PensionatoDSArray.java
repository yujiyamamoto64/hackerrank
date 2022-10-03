package hacknelio;

import java.util.Scanner;

public class PensionatoDSArray {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("How many rooms will be rented?");
		int n = sc.nextInt();

		Aluno[] rooms = new Aluno[10];

		for (int i = 0; i < n; i++) {
			System.out.println("Rent #" + (i + 1) + ":");
			System.out.println("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.println("Email: ");
			String email = sc.nextLine();
			System.out.println("Room: ");
			int room = sc.nextInt();
			rooms[room - 1] = new Aluno(name, email);
		}

		int index = 0;
		System.out.println("Busy rooms:");
		for (Aluno a : rooms) {
			index++;
			if (a != null) {
				System.out.print(index);
				System.out.println(a);
			}
		}
	}
}
