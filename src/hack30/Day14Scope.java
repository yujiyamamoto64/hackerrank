package hack30;

import java.util.Scanner;

/*
 * https://www.hackerrank.com/challenges/30-scope/problem
 */

class Difference {
  	private int[] elements;
  	public int maximumDifference;

	// Add your code here
  	
  	public Difference(int[] a) {
  		this.elements = a;
  		for (int i = 0; i < a.length; i++) {
  			if (a[i] < 0 ) a[i] = a[i] * -1;
  		}
  	}
  	
  	public void computeDifference () {
  		int sum;
  		for (int i =0; i<elements.length-1; i++) {
  			for (int j=i+1; j < elements.length; j++) {
  				sum = elements[i] - elements[j];
  				if (sum < 0) sum = sum * -1;
  				if (i==0 && j==1) maximumDifference = sum;
  				if (sum > maximumDifference) maximumDifference = sum;
  			}
  		}
  	}

}

public class Day14Scope {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }
}
