package hack30;

import java.util.Scanner;

/*
 * https://www.hackerrank.com/challenges/30-binary-search-trees/problem
 */

class D22Node {
	D22Node left, right;
	int data;

	D22Node(int data) {
		this.data = data;
		left = right = null;
	}
}

public class Day22BinarySearch {

	public static int getHeight(D22Node root) {
		// Write your code here
		if (root == null) return -1;
        return Math.max(getHeight(root.left), getHeight(root.right)) + 1;
	}

	public static D22Node insert(D22Node root, int data) {
		if (root == null) {
			return new D22Node(data);
		} else {
			D22Node cur;
			if (data <= root.data) {
				cur = insert(root.left, data);
				root.left = cur;
			} else {
				cur = insert(root.right, data);
				root.right = cur;
			}
			return root;
		}
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		D22Node root = null;
		while (T-- > 0) {
			int data = sc.nextInt();
			root = insert(root, data);
		}
		int height = getHeight(root);
		System.out.println(height);
	}
}
