package hack;

import java.util.BitSet;
import java.util.Scanner;

/*
 * https://www.hackerrank.com/challenges/java-bitset/problem
 */

public class JavaBitSetProblem {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		BitSet b1 = new BitSet(n);
		BitSet b2 = new BitSet(n);

		for (int i = 0; i < m; i++) {
			String msg = sc.next();
			// first operation
			int fo = sc.nextInt();
			// second operation
			int so = sc.nextInt();

			switch (msg) {
			case "AND":
				if (fo == 1 && so == 2) {
					b1.and(b2);
				} else if (fo == 2 && so == 1) {
					b2.and(b1);
				} else if (fo == 1 && so == 1) {
					b1.and(b1);
				} else if (fo == 2 && so == 2) {
					b2.and(b2);
				}
				break;
				
			case "OR":
				if (fo == 1 && so == 2) {
					b1.or(b2);
				} else if (fo == 2 && so == 1) {
					b2.or(b1);
				} else if (fo == 1 && so == 1) {
					b1.or(b1);
				} else if (fo == 2 && so == 2) {
					b2.or(b2);
				}
				break;
				
			case "XOR":
				if (fo == 1 && so == 2) {
					b1.xor(b2);
				} else if (fo == 2 && so == 1) {
					b2.xor(b1);
				} else if (fo == 1 && so == 1) {
					b1.xor(b1);
				} else if (fo == 2 && so == 2) {
					b2.xor(b2);
				}
				break;
				
			case "FLIP":
				if (fo == 1) {
					b1.flip(so);
				} else if (fo == 2){
					b2.flip(so);
				}
				break;
				
			case "SET":
				if (fo == 1) {
					b1.set(so);
				} else if (fo == 2){
					b2.set(so);
				}
				break;
			}
			
			System.out.println(b1.cardinality() + " " + b2.cardinality());

		}
	}

}
