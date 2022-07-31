package hack;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/*
 * Instructions: 
 * Sample input: 
 * 5
 * john tom
 * john mary
 * john tom
 * mary anna
 * mary anna
 * 
 * Sample output: 
 * 1
 * 2
 * 2
 * 3
 * 3
 */

public class JavaHashSet {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		String[] pair_left = new String[n];
		String[] pair_right = new String[n];
		
		for (int i = 0; i < n; i++) {
			pair_left[i] = sc.next();
			pair_right[i] = sc.next();
		}
		
		Set<String> s = new HashSet<>(n);
		
		for (int i = 0; i < n; i++) {
			s.add(pair_left[i] + " " + pair_right[i]);
			System.out.println(s.size());
		}
	
		
		sc.close();
		
	}
}
