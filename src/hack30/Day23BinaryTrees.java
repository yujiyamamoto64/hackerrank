package hack30;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/*
 * https://www.hackerrank.com/challenges/30-binary-trees/problem
 */

class D23Node {
	D23Node left, right;
	int data;

	D23Node(int data) {
		this.data = data;
		left = right = null;
	}
}

public class Day23BinaryTrees {

	static void levelOrder(D23Node root) {
		// Write your code here
		Queue<D23Node> queue = new LinkedList<>();
	      queue.add(root);
	      
	      while (!queue.isEmpty()) {
	          D23Node removedNode = queue.poll();
	          System.out.print(removedNode.data + " ");
	          
	          if (removedNode.left != null) {
	              queue.add(removedNode.left);
	          }
	          if (removedNode.right != null) {
	              queue.add(removedNode.right);
	          }
	      }
	}

	public static D23Node insert(D23Node root, int data) {
		if (root == null) {
			return new D23Node(data);
		} else {
			D23Node cur;
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
		D23Node root = null;
		while (T-- > 0) {
			int data = sc.nextInt();
			root = insert(root, data);
		}
		levelOrder(root);
	}
}
