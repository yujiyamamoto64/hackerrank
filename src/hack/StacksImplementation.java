package hack;

import java.util.EmptyStackException;

class ArrayStack {
	private Employee[] stack;
	private int top;
	
	public ArrayStack(int capacity) {
		stack = new Employee[capacity];
	}
	
	public void push(Employee employee) {
		if (top == stack.length) {
			Employee[] newArray = new Employee[2 * stack.length];
			System.arraycopy(stack, 0, newArray, 0, stack.length);
			stack = newArray;
		}
		
		stack[top++] = employee;
	}
	
	public Employee pop() {
		if (isEmpty()) throw new EmptyStackException();
		Employee employee = stack[--top];
		stack[top] = null;
		return employee;
	}
	
	public Employee peek() {
		if (isEmpty()) throw new EmptyStackException();
		return stack[top - 1];
	}
	
	public boolean isEmpty() {
		return top == 0;
	}
	
	public int size() {
		return top;
	}
	
	public void printStack() {
		for (int i = top - 1; i >= 0; i--) {
			System.out.println(stack[i]);
		}
	}
}

public class StacksImplementation {

	public static void main(String[] args) {
		ArrayStack stack = new ArrayStack(10);
		stack.push(new Employee("Jane", "Jones", 123));
		stack.push(new Employee("John", "Doe", 4567));
		stack.push(new Employee("Mary", "Smith", 22));
		stack.push(new Employee("Mike", "Wilson", 3245));
		stack.push(new Employee("Bill", "End", 78));
		
		stack.printStack();
		System.out.println();
		
		System.out.println(stack.peek());
		System.out.println();
		
		System.out.println("Popped: " + stack.pop());
		System.out.println();
		
		stack.printStack();
	}
}
