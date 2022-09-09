package hack;

public class QuickSort {

	public static void main(String[] args) {
		int[] arr = {20, 35, -15, 7, 55, 1, -22};
		
		quickSort(arr, 0, arr.length);
		
		for (int e : arr) {
			System.out.println(e);
		}
	}
	
	public static void quickSort(int[] input, int start, int end) {
		if (end - start < 2) return;
		
		int pivotIndex = partition(input, start, end);
		quickSort(input, start, pivotIndex);
		quickSort(input, pivotIndex + 1, end);
	}
	
	public static int partition(int[] input, int start, int end) {
		int pivot = input[start];
		int i = start;
		int j = end;
		
		while (i < j) {
			while (i < j && input[--j] >= pivot);	
				if (i < j) input[i] = input[j];
			
			while (i < j && input[++i] <= pivot);
				if (i < j) input[j] = input[i];
		}
		
		input[j] = pivot;
		return j;
	}
}
