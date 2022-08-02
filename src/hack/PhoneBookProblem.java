package hack;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
 * https://www.hackerrank.com/challenges/phone-book/problem
 */

public class PhoneBookProblem {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		in.nextLine();
		Map map = new HashMap<>();
		for (int i = 0; i < n; i++) {
			String name = in.nextLine();
			int phone = in.nextInt();
			in.nextLine();
			map.put(name, phone);
		}
		while (in.hasNext()) {
			String s = in.nextLine();
			if (map.get(s) == null) {
				System.out.println("Not found");
			} else {
				System.out.println(s + "=" + map.get(s));
			}
		}
	}
}
