package hack30;

import java.io.*;
import java.util.*;

/*
 * https://www.hackerrank.com/challenges/30-linked-list-deletion/problem
 */

class D24Node {
	int data;
	D24Node next;

	D24Node(int d) {
		data = d;
		next = null;
	}

}

class Solution {

	public static D24Node removeDuplicates(D24Node head) {
		// Write your code here
		if (head == null) {
			return null;
		}
		D24Node temp = head;
		while (temp.next != null) {
			if (temp.data != temp.next.data) {
				temp = temp.next;
			} else {
				temp.next = temp.next.next;
			}
		}
		return head;
	}

	public static D24Node insert(D24Node head, int data) {
		D24Node p = new D24Node(data);
		if (head == null)
			head = p;
		else if (head.next == null)
			head.next = p;
		else {
			D24Node start = head;
			while (start.next != null)
				start = start.next;
			start.next = p;

		}
		return head;
	}

	public static void display(D24Node head) {
		D24Node start = head;
		while (start != null) {
			System.out.print(start.data + " ");
			start = start.next;
		}
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		D24Node head = null;
		int T = sc.nextInt();
		while (T-- > 0) {
			int ele = sc.nextInt();
			head = insert(head, ele);
		}
		head = removeDuplicates(head);
		display(head);
	}
}