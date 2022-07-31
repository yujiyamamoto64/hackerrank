package hack;

import java.math.BigInteger;
import java.util.Scanner;

/*
 * Instructions:
 * Sample input:
 * 1234
 * 20
 * 
 * Output:
 * 1254
 * 24680
 * 
 * Explanation: 
 * 1234 + 20 = 1254
 * 1234 * 20 = 24680
 */

public class BigIntegerSumAndMultiply {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BigInteger a = sc.nextBigInteger();
		BigInteger b = sc.nextBigInteger();
		
		System.out.println(a.add(b));
		System.out.println(a.multiply(b));
		sc.close();
	}
	
}
