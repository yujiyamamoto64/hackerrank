package hack;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * https://www.hackerrank.com/challenges/java-list/problem
 */

public class JavaList {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < N; i++) {
			list.add(sc.nextInt());
		}
		int queries = sc.nextInt();

		for (int i = 0; i < queries; i++) {
			String msg = sc.next();
			if (msg.contains("Insert")) {
				int a = sc.nextInt();
				int b = sc.nextInt();
				list.add(a, b);
			}
			if (msg.contains("Delete")) {
				int a = sc.nextInt();
				list.remove(a);
			}
		}

		for (Integer elements : list) {
			System.out.print(elements + " ");
		}
		sc.close();
	}
}
