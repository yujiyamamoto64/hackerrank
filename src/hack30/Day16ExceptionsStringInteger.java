package hack30;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * https://www.hackerrank.com/challenges/30-exceptions-string-to-integer/problem
 */

public class Day16ExceptionsStringInteger {

	public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String S = bufferedReader.readLine();
     
        try {
        	System.out.println(Integer.parseInt(S));
        } catch (NumberFormatException e) {
        	System.out.println("Bad String");
        }
        
        bufferedReader.close();
    }
}
