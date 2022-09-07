package hack30;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

/*
 * https://www.hackerrank.com/challenges/30-regex-patterns/problem
 */

public class Day28RegexPD {

	public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());

        List<String> list = new ArrayList<>();
        
        IntStream.range(0, N).forEach(NItr -> {
            try {
                String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

                String firstName = firstMultipleInput[0];

                String emailID = firstMultipleInput[1];
                
                if (firstMultipleInput[1].contains("@gmail")) list.add(firstName);
                
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });
        
        Collections.sort(list);
        
        for (String e : list) {
        	System.out.println(e);
        }

        bufferedReader.close();
    }
}
