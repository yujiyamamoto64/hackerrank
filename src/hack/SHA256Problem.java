package hack;

import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

/*
 * https://www.hackerrank.com/challenges/sha-256/problem
 */

public class SHA256Problem {
	
	public static byte[] getSHA(String input) throws NoSuchAlgorithmException {
		MessageDigest md = MessageDigest.getInstance("SHA-256");
		return md.digest(input.getBytes(StandardCharsets.UTF_8));
	}
	
	public static String toHexString(byte[] hash) {
        BigInteger number = new BigInteger(1, hash);
        StringBuilder hexString = new StringBuilder(number.toString(16));
        while (hexString.length() < 64)
        {
            hexString.insert(0, '0');
        }
 
        return hexString.toString();
	}

	public static void main(String[] args) throws NoSuchAlgorithmException {
		
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		
		System.out.println(toHexString(getSHA(s)));
		
	}
}
