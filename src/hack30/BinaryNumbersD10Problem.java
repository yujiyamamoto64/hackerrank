package hack30;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BinaryNumbersD10Problem {

	public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        int count=0; 
        int max=0;
        
        while (n > 0) {
        	if (n % 2 == 1) {
        		count ++;
        		if (count >= max) {
        			max = count;
        		}
        	}
        	else {
        		count = 0;
        	}
        	n = n / 2;
        }
        
        System.out.println(max);
        	
        bufferedReader.close();
    }
}
