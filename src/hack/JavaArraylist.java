package hack;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * https://www.hackerrank.com/challenges/java-arraylist/problem
 */

public class JavaArraylist {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();

		List<List<Integer>> lists = new ArrayList<>();
		for (int i = 0; i < a; i++) {
			List<Integer> list = new ArrayList<>();
			lists.add(list);
		}

		for (int i = 0; i < a; i++) {
			int b = sc.nextInt();

			for (int j = 0; j < b; j++) {
				lists.get(i).add(sc.nextInt());
			}
		}

		int query = sc.nextInt();
		int[] line = new int[query];
		int[] colum = new int[query];
		for (int i = 0; i < query; i++) {
			line[i] = sc.nextInt() - 1;
			colum[i] = sc.nextInt() - 1;
		}
		
		for (int i=0; i<query; i++) {
			if (colum[i]+1 <= lists.get(line[i]).size())  {
				System.out.println(lists.get(line[i]).get(colum[i]));
			}
			else {
				System.out.println("ERROR!");
			}
		}

		sc.close();
	}
}
