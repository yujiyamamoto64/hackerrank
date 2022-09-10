package hack;

public class CountingSort {

	public static void main(String[] args) {
		int[] arr = {2, 5, 9, 8, 2, 8, 7, 10, 4, 3};
		
		countingSort(arr, 1, 10);
		
		for (int e : arr) {
			System.out.println(e);
		}
	}

	private static void countingSort(int[] input, int min, int max) {
		
		int[] arr = new int[(max - min) +1];
		
		for (int i = 0; i < input.length; i++) {
			arr[input[i] - min]++;
		}
		
		int j = 0;
		for (int i = min; i <= max; i++) {
			while (arr[i - min] > 0) {
				input[j++] = i;
				arr[i - min]--;
			}
		}
		
	}
}
