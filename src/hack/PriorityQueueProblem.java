package hack;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

/*
 * https://www.hackerrank.com/challenges/java-priority-queue/problem
 */

class Student2 implements Comparable<Student2> {

	String name = new String();
	double cgpa;
	int id;
	
	public Student2() {
	}

	public Student2(String name, double cgpa, int id) {
		super();
		this.id = id;
		this.name = name;
		this.cgpa = cgpa;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getCgpa() {
		return cgpa;
	}

	public void setCgpa(Double cgpa) {
		this.cgpa = cgpa;
	}
	
	public int compareTo(Student2 s) {
		if (cgpa == s.cgpa) {
			if (name.compareTo(s.name) == 0) {
				if (id == s.id)
					return 0;
				else if (id > s.id)
					return 1;
				else
					return -1;
			}
			else
				return name.compareTo(s.name);
		}
		else if (cgpa > s.cgpa)
			return -1;
		else return 1;
	}

}

class Priorities {
	public ArrayList<Student2> getStudent2s(List<String> events) {
		int n = events.size();
		PriorityQueue<Student2> pq = new PriorityQueue<Student2>();
		for (String i : events) {
			String[] s = new String[4];
			s = i.split("\\s");
			if (s.length > 1) {
				pq.add(new Student2(s[1], Double.valueOf(s[2]), Integer.valueOf(s[3])));
			}
			else {
				pq.poll();
			}
		}
		while (pq.size() > 1) {
			System.out.println(pq.poll().name);
		}
		return new ArrayList<Student2>(pq);
	}
}

public class PriorityQueueProblem {

	private final static Scanner scan = new Scanner(System.in);
	private final static Priorities priorities = new Priorities();

	public static void main(String[] args) {
		int totalEvents = Integer.parseInt(scan.nextLine());
		List<String> events = new ArrayList<>();

		while (totalEvents-- != 0) {
			String event = scan.nextLine();
			events.add(event);
		}

		List<Student2> students = priorities.getStudent2s(events);

		if (students.isEmpty()) {
			System.out.println("EMPTY");
		} else {
			for (Student2 st : students) {
				System.out.println(st.getName());
			}
		}
	}
}
