package leetcode;

public class TwoSumLeetCode {

	public static int[] twoSum(int[] nums, int target) {
		int[] arr = new int[2];
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] + nums[j] == target) {
					arr[0] = i;
					arr[1] = j;
					i = nums.length;
					j = nums.length;
				}
			}
		}
		return arr;
	}
	
	public static void main(String[] args) {
		
		int[] input1 = {2, 7, 11, 15};
		int[] input2 = {3, 2, 4};
		int[] input3 = {3, 3};
		int[] input4 = {2, 5, 5, 11};
		
		for (int e : twoSum(input1, 9)) {
			System.out.print(e + " ");
		}
		System.out.println();
		
		for (int e : twoSum(input2, 6)) {
			System.out.print(e + " ");
		}
		System.out.println();
		
		for (int e : twoSum(input3, 6)) {
			System.out.print(e + " ");
		}
		System.out.println();
		
		for (int e : twoSum(input4, 10)) {
			System.out.print(e + " ");
		}
	}
}
