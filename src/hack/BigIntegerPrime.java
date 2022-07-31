package hack;

import java.math.BigInteger;
import java.util.Scanner;

public class BigIntegerPrime {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		BigInteger big1 = sc.nextBigInteger();
		
		Boolean bool1 = big1.isProbablePrime(1);

		if (bool1) 
			System.out.println("prime");
		else 
			System.out.println("not prime");
		
		sc.close();
	}
	
}
