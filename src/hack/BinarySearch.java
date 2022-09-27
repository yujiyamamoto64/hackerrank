package hack;

public class BinarySearch {

	public static void main(String[] args) {
		int[] intArray = { -22, -15, 1, 7, 20, 35, 55 };
		
		System.out.println(iterativeBinarySearch(intArray, -15));
		System.out.println(iterativeBinarySearch(intArray, 35));
		System.out.println(iterativeBinarySearch(intArray, 8888));
		System.out.println(iterativeBinarySearch(intArray, 1));

	}
	
	public static int iterativeBinarySearch (int[] input, int value) {
		int start = 0;
		int end = input.length;
		
		while (start < end) {
			int midpoint = (start + end) / 2;
			System.out.println("midpoint = " + midpoint);
			if (input[midpoint] == value) {
				return midpoint;
			}
			else if (input[midpoint] < value) {
				start = midpoint + 1;
			}
			else {
				end = midpoint;
			}
		}
		
		return -1;
	}
}
