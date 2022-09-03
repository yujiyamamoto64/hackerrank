package hack30;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

/*
 * https://www.hackerrank.com/challenges/30-queues-stacks/problem
 */

public class Day18QueuesStacks {
	
	// Write your code here.
	Stack<Character> stack = new Stack<>();
	LinkedList<Character> linked = new LinkedList<>();
	
	public void pushCharacter(char ch) {
		stack.push(ch);
	}
	
	public void enqueueCharacter(char ch) {
		linked.offer(ch);
	}
	
	public char popCharacter() {
		return stack.pop();
	}
	
	public char dequeueCharacter() {
		return linked.poll();
	}

	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        scan.close();

        // Convert input String to an array of characters:
        char[] s = input.toCharArray();

        // Create a Solution object:
        Day18QueuesStacks p = new Day18QueuesStacks();

        // Enqueue/Push all chars to their respective data structures:
        for (char c : s) {
            p.pushCharacter(c);
            p.enqueueCharacter(c);
        }

        // Pop/Dequeue the chars at the head of both data structures and compare them:
        boolean isPalindrome = true;
        for (int i = 0; i < s.length/2; i++) {
            if (p.popCharacter() != p.dequeueCharacter()) {
                isPalindrome = false;                
                break;
            }
        }

        //Finally, print whether string s is palindrome or not.
        System.out.println( "The word, " + input + ", is " 
                           + ( (!isPalindrome) ? "not a palindrome." : "a palindrome." ) );
    }
}
