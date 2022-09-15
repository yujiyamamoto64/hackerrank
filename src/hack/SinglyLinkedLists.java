package hack;

import java.util.Objects;

class Employee {
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
		
		if (head == null) tail = node;
		else head.setPrevious(node);
		
		head = node;
		size++;
	}
	
	public void addToEnd(Employee employee) {
		EmployeeNode node = new EmployeeNode(employee);
		if (tail == null) head = node;
		else {
			tail.setNext(node);
			node.setPrevious(tail);
		}
		tail = node;
		size++;
	}
	
	public EmployeeNode removeFromFront() {
		if (isEmpty()) return null;
		
		EmployeeNode removedNode = head;
		
		if (head.getNext() == null) tail = null;
		else head.getNext().setPrevious(null);
		
		head = head.getNext();
		size--;
		removedNode.setNext(null);
		return removedNode;
	}
	
	public EmployeeNode removeFromEnd() {
		if (isEmpty()) return null;
		
		EmployeeNode removedNode = tail;
		
		if (tail.getPrevious() == null) head = null;
		else tail.getPrevious().setNext(null);
		
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

public class SinglyLinkedLists {

	public static void main(String[] args) {
		var janeJones = new Employee("Jane", "Jones", 123);
		var johnDoe = new Employee("John", "Doe", 4567);
		var marySmith = new Employee("Mary", "Smith", 22);
		var mikeWilson = new Employee("Mike", "Wilson", 3245);

		var list = new EmployeeLinkedList();
		
		list.addToFront(janeJones);
		list.addToFront(johnDoe);
		list.addToFront(marySmith);
		list.addToFront(mikeWilson);
		
		list.printList();
		System.out.println(list.getSize());
		
		Employee billEnd = new Employee("Bill", "End", 78);
		list.addToEnd(billEnd);
		
		list.printList();
		System.out.println(list.getSize());
		
		list.removeFromFront();
		list.printList();
		System.out.println(list.getSize());
		
		list.removeFromEnd();
		list.printList();
		System.out.println(list.getSize());
	}

}
