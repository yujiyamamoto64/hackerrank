package hack;

import java.util.NoSuchElementException;

public class ArrayQueue {
	private Employee[] queue;
	private int front;
	private int back;

	public ArrayQueue(int capacity) {
		queue = new Employee[capacity];
	}

	public void add(Employee employee) {
		if (size() == queue.length - 1) {
			int numItems = size();
			Employee[] newArray = new Employee[2 * queue.length];
			System.arraycopy(queue, front, newArray, 0, queue.length - front);
			System.arraycopy(queue, 0, newArray, queue.length - front, back);
			queue = newArray;
			front = 0;
			back = numItems;
		}

		queue[back] = employee;
		if (back < queue.length - 1) {
			back++;
		} else {
			back = 0;
		}
		
	}

	public Employee remove() {
		if (size() == 0)
			throw new NoSuchElementException();

		Employee employee = queue[front];
		queue[front] = null;
		front++;
		if (size() == 0) {
			front = 0;
			back = 0;
		} 
		else if (front == queue.length){
			front = 0;
		}

		return employee;
	}

	public Employee peek() {
		if (size() == 0)
			throw new NoSuchElementException();

		return queue[front];
	}

	public int size() {
		if (front <= back) {
			return back - front;
		} else {
			return back - front + queue.length;
		}
	}

	public void printQueue() {
		if (front <= back) { 
			for (int i = front; i < back; i++) {
				System.out.println(queue[i]);
			}
		} else {
			for (int i = front; i < queue.length; i++) {
				System.out.println(queue[i]);
			}
			for (int i = 0; i < back; i++) {
				System.out.println(queue[i]);
			}
		}
	}

	public static void main(String[] args) {
		Employee janeJones = new Employee("Jane", "Jones", 123);
		Employee johnDoe = new Employee("John", "Doe", 4567);
		Employee marySmith = new Employee("Mary", "Smith", 22);
		Employee mikeWilson = new Employee("Mike", "Wilson", 3245);
		Employee billEnd = new Employee("Bill", "End", 78);

		ArrayQueue queue = new ArrayQueue(5);
		
		queue.add(janeJones);
		queue.add(johnDoe);
		queue.remove();
		queue.add(marySmith);
		queue.remove();
		queue.add(mikeWilson);
		queue.remove();
		queue.add(billEnd);
		queue.remove();
		queue.add(janeJones);
		
		queue.printQueue();
		
		
		/*
		queue.add(janeJones);
		queue.add(johnDoe);
		queue.add(marySmith);
		queue.add(mikeWilson);
		queue.add(billEnd);
		queue.add(janeJones);
		
		queue.printQueue();
		*/
	}
}
