package hack;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedStack {

	private LinkedList<Employee> stack;
	
	public LinkedStack() {
		stack = new LinkedList<>();
	}
	
	public void push(Employee employee) {
		stack.push(employee);
	}
	
	public Employee pop() {
		return stack.pop();
	}
	
	public Employee peek() {
		return stack.peek();
	}
	
	public boolean isEmpty() {
		return stack.isEmpty();
	}
	
	public void printStack() {
		ListIterator<Employee> iterator = stack.listIterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
	
	public static void main(String[] args) {
		Employee janeJones = new Employee("Jane", "Jones", 123);
		Employee johnDoe = new Employee("John", "Doe", 4567);
		Employee marySmith = new Employee("Mary", "Smith", 22);
		Employee mikeWilson = new Employee("Mike", "Wilson", 3245);
		Employee billEnd = new Employee("Bill", "End", 78);
		
		LinkedStack stack = new LinkedStack();
		stack.push(janeJones);
		stack.push(johnDoe);
		stack.push(marySmith);
		stack.push(mikeWilson);
		stack.push(billEnd);
		
		stack.printStack();
		System.out.println();
		System.out.println(stack.peek());
		System.out.println();
		stack.printStack();
		
		System.out.println("Popped: " + stack.pop());
		System.out.println(stack.peek());
	}
}
