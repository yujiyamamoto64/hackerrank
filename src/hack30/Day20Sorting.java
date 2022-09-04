package hack30;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
 * https://www.hackerrank.com/challenges/30-sorting/problem
 */

public class Day20Sorting {
	
	static int count = 0;
	
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(bufferedReader.readLine().trim());

		List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
	            .map(Integer::parseInt)
	            .collect(Collectors.toList());
		
		int vect[] = new int[n];

		for (int i = 0; i < n; i++) {
			vect[i] = a.get(i);
		}

		for (int i = vect.length-1; i>0; i--) {
			for (int j=0; j<i; j++) {
				if (vect[j] > vect[j+1])
					swap(vect, j, j+1);
			}
		}
		
		System.out.println("Array is sorted in " + count + " swaps.");
		System.out.println("First Element: " + vect[0]);
		System.out.println("Last Element: " + vect[vect.length-1]);

		bufferedReader.close();
	}

	private static void swap(int[] vect, int i, int j) {
		if (i == j) return;
		int temp = vect[i];
		vect[i] = vect[j];
		vect[j] = temp;
		count++;
	}
}
