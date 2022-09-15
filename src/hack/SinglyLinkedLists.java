package hack;

import java.util.Objects;

final class Employee {
	private String firstName;
	private String lastName;
	private int id;

	public Employee(String firstName, String lastName, int id) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public int hashCode() {
		return Objects.hash(firstName, id, lastName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return Objects.equals(firstName, other.firstName) && id == other.id && Objects.equals(lastName, other.lastName);
	}

	@Override
	public String toString() {
		return "Employee [firstName=" + firstName + ", lastName=" + lastName + ", id=" + id + "]";
	}

}

class EmployeeNode {
	private Employee employee;
	private EmployeeNode next;
	private EmployeeNode previous;

	public EmployeeNode(Employee employee) {
		this.employee = employee;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public EmployeeNode getNext() {
		return next;
	}

	public void setNext(EmployeeNode next) {
		this.next = next;
	}

	public EmployeeNode getPrevious() {
		return previous;
	}

	public void setPrevious(EmployeeNode previous) {
		this.previous = previous;
	}

	public String toString() {
		return employee.toString();
	}
}

class EmployeeLinkedList {
	private EmployeeNode head;
	private EmployeeNode tail;
	private int size;

	public void addToFront(Employee employee) {
		EmployeeNode node = new EmployeeNode(employee);
		node.setNext(head);

		if (head == null)
			tail = node;
		else
			head.setPrevious(node);

		head = node;
		size++;
	}

	public void addToEnd(Employee employee) {
		EmployeeNode node = new EmployeeNode(employee);
		if (tail == null)
			head = node;
		else {
			tail.setNext(node);
			node.setPrevious(tail);
		}
		tail = node;
		size++;
	}

	public boolean addBefore(Employee newEmployee, Employee existingEmployee) {

		if (head == null)
			return false;

		EmployeeNode current = head;
		while (current != null && !current.getEmployee().equals(existingEmployee)) {
			current = current.getNext();
		}

		if (current == null)
			return false;

		EmployeeNode newNode = new EmployeeNode(newEmployee);
		newNode.setPrevious(current.getPrevious());
		newNode.setNext(current);
		current.setPrevious(newNode);

		if (head == current)
			head = newNode;
		else
			newNode.getPrevious().setNext(newNode);

		size++;

		return true;
	}

	public EmployeeNode removeFromFront() {
		if (isEmpty())
			return null;

		EmployeeNode removedNode = head;

		if (head.getNext() == null)
			tail = null;
		else
			head.getNext().setPrevious(null);

		head = head.getNext();
		size--;
		removedNode.setNext(null);
		return removedNode;
	}

	public EmployeeNode removeFromEnd() {
		if (isEmpty())
			return null;

		EmployeeNode removedNode = tail;

		if (tail.getPrevious() == null)
			head = null;
		else
			tail.getPrevious().setNext(null);

		tail = tail.getPrevious();
		size--;
		removedNode.setPrevious(null);
		return removedNode;
	}

	public int getSize() {
		return size;
	}

	public boolean isEmpty() {
		return head == null;
	}

	public void printList() {
		EmployeeNode current = head;
		System.out.print("HEAD -> ");
		while (current != null) {
			System.out.print(current);
			System.out.println(" <=> ");
			current = current.getNext();
		}
		System.out.println("null");
	}
}

class IntegerNode {
	private int value;
	private IntegerNode next;
	private IntegerNode previous;
	
	public IntegerNode(int value) {
		super();
		this.value = value;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public IntegerNode getNext() {
		return next;
	}

	public void setNext(IntegerNode next) {
		this.next = next;
	}

	public IntegerNode getPrevious() {
		return previous;
	}

	public void setPrevious(IntegerNode previous) {
		this.previous = previous;
	}

	@Override
	public String toString() {
		return value + "";
	}
}

class IntegerLinkedList {
	private IntegerNode head;
	private int size;

	public void addToFront(Integer value) {
		IntegerNode node = new IntegerNode(value);
		node.setNext(head);
		head = node;
		size++;
	}

	public IntegerNode removeFromFront() {
		if (isEmpty())
			return null;

		IntegerNode removedNode = head;

		head = head.getNext();
		size--;
		removedNode.setNext(null);
		return removedNode;
	}

	public void insertSorted(Integer value) {
		if (head == null || head.getValue() >= value) {
			addToFront(value);
			return;
		}
		
		IntegerNode current = head.getNext();
		IntegerNode previous = head;
		while (current != null && current.getValue() < value) {
			previous = current;
			current = current.getNext();
		}
		
		IntegerNode newNode = new IntegerNode(value);
		newNode.setNext(current);
		previous.setNext(newNode);
		
		size++;
	}

	public int getSize() {
		return size;
	}

	public boolean isEmpty() {
		return head == null;
	}

	public void printList() {
		IntegerNode current = head;
		System.out.print("HEAD -> ");
		while (current != null) {
			System.out.print(current);
			System.out.print(" -> ");
			current = current.getNext();
		}
		System.out.println("null");
	}
}

public class SinglyLinkedLists {

	public static void main(String[] args) {
		Integer one = 1;
		Integer two = 2;
		Integer three = 3;
		Integer four = 4;
		
		IntegerLinkedList list = new IntegerLinkedList();
		list.insertSorted(three);
		list.printList();
		list.insertSorted(two);
		list.printList();
		list.insertSorted(one);
		list.printList();
		list.insertSorted(four);
		list.printList();

	}
}
