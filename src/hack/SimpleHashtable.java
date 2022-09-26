package hack;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Map;

class ChainedHashtable {
	
	private LinkedList<StoredEmployee>[] hashtable;
	
	public ChainedHashtable() {
		hashtable = new LinkedList[10];
		for (int i = 0; i < hashtable.length; i++) {
			hashtable[i] = new LinkedList<StoredEmployee>();
		}
	}
	
	public void put (String key, Employee employee) {
		int hashedKey = hashKey(key);
		hashtable[hashedKey].add(new StoredEmployee(key, employee));
	}
	
	public Employee get(String key) {
		int hashedKey = hashKey(key);
		ListIterator<StoredEmployee> iterator = hashtable[hashedKey].listIterator();
		StoredEmployee employee = null;
		while (iterator.hasNext()) {
			employee = iterator.next();
			if (employee.key.equals(key)) {
				return employee.employee;
			}
		}
		return null;
	}
	
	public Employee remove (String key) {
		int hashedKey = hashKey(key);
		ListIterator<StoredEmployee> iterator = hashtable[hashedKey].listIterator();
		StoredEmployee employee = null;
		int index = -1;
		while (iterator.hasNext()) {
			employee = iterator.next();
			index++;
			if (employee.key.equals(key)) {
				break;
			}
		}
		if (employee == null) {
			return null;
		} else {
			hashtable[hashedKey].remove(index);
			return employee.employee;
		}
	}

	private int hashKey(String key) {
		//return key.length() % hashtable.length;
		return Math.abs(key.hashCode() % hashtable.length);
	}
	
	public void printHashtable() {
		for (int i = 0; i < hashtable.length; i++) {
			if (hashtable[i].isEmpty()) {
				System.out.println("Position " + i + ": empty");
			} else {
				System.out.print("Position " + i + ": ");
				ListIterator<StoredEmployee> iterator = hashtable[i].listIterator();
				while (iterator.hasNext()) {
					System.out.print(iterator.next().employee);
					System.out.print("->");
				}
				System.out.println("null");
			}
		}
	}
}

class StoredEmployee {

	public String key;
	public Employee employee;

	public StoredEmployee(String key, Employee employee) {
		super();
		this.key = key;
		this.employee = employee;
	}
}

public class SimpleHashtable {

	private StoredEmployee[] hashtable;

	public SimpleHashtable() {
		hashtable = new StoredEmployee[10];
	}

	public void put(String key, Employee employee) {
		int hashedKey = hashKey(key);
		if (occupied(hashedKey)) {
			int stopIndex = hashedKey;
			if (hashedKey == hashtable.length - 1) {
				hashedKey = 0;
			} else {
				hashedKey++;
			}

			while (occupied(hashedKey) && hashedKey != stopIndex) {
				hashedKey = (hashedKey + 1) % hashtable.length;
			}
		}
		if (occupied(hashedKey)) {
			System.out.println("Sorry, there's already an employee at position " + hashedKey);
		} else {
			hashtable[hashedKey] = new StoredEmployee(key, employee);
		}
	}

	public Employee get(String key) {
		int hashedKey = findKey(key);
		if (hashedKey == -1) {
			return null;
		} 
		return hashtable[hashedKey].employee;
	}
	
	public Employee remove (String key) {
		int hashedKey = findKey(key);
		if (hashedKey == -1) {
			return null;
		}
		
		Employee employee = hashtable[hashedKey].employee;
		hashtable[hashedKey] = null;
		StoredEmployee[] oldHashtable = hashtable;
		hashtable = new StoredEmployee[oldHashtable.length];
		for (int i = 0; i < oldHashtable.length; i++) {
			if (oldHashtable[i] != null) {
				put (oldHashtable[i].key, oldHashtable[i].employee);
			}
		}
		return employee;
	}

	private int hashKey(String key) {
		return key.length() % hashtable.length;
	}

	private int findKey(String key) {
		int hashedKey = hashKey(key);
		if (hashtable[hashedKey] != null && hashtable[hashedKey].key.equals(key)) {
			return hashedKey;
		}

		int stopIndex = hashedKey;
		if (hashedKey == hashtable.length - 1) {
			hashedKey = 0;
		} else {
			hashedKey++;
		}

		while (hashedKey != stopIndex && 
				hashtable[hashedKey] != null &&
				!hashtable[hashedKey].key.equals(key)) {
			hashedKey = (hashedKey + 1) % hashtable.length;
		}
		
		if (hashtable[hashedKey] != null && 
				hashtable[hashedKey].key.equals(key) ) {
			return hashedKey;
		} else {
			return -1;
		}
		
	}

	private boolean occupied(int index) {
		return hashtable[index] != null;
	}

	public void printHashtable() {
		for (int i = 0; i < hashtable.length; i++) {
			if (hashtable[i] == null) {
				System.out.println("empty");
			} else {
				System.out.println("Position " + i + ": " + hashtable[i].employee);
			}
		}
	}

	public static void main(String[] args) {

		Employee janeJones = new Employee("Jane", "Jones", 123);
		Employee johnDoe = new Employee("John", "Doe", 4567);
		Employee marySmith = new Employee("Mary", "Smith", 22);
		Employee mikeWilson = new Employee("Mike", "Wilson", 3245);

		/*
		SimpleHashtable ht = new SimpleHashtable();
		ChainedHashtable ht = new ChainedHashtable();
		ht.put("Jones", janeJones);
		ht.put("Doe", johnDoe);
		ht.put("Wilson", mikeWilson);
		ht.put("Smith", marySmith);

		ht.printHashtable();
		
		System.out.println("Retrieve key Smith: " + ht.get("Smith"));

		ht.remove("Jones");
		ht.printHashtable();
		
		System.out.println("Retrieve key Smith: " + ht.get("Smith"));
		*/
		
		Map<String, Employee> hashMap = new HashMap<String, Employee>();
		hashMap.put("Jones", janeJones);
		hashMap.put("Doe", johnDoe);
		hashMap.put("Smith", marySmith);
		//Employee employee = hashMap.put("Doe", mikeWilson);
		Employee employee = hashMap.putIfAbsent("Doe", mikeWilson);
		System.out.println(employee);
		
		System.out.println(hashMap.getOrDefault("someone", mikeWilson));
		System.out.println(hashMap.remove("Jones"));
		//System.out.println(hashMap.containsKey("Doe"));
		//System.out.println(hashMap.containsValue(janeJones));
		
		/*
		Iterator<Employee> iterator = hashMap.values().iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		*/
		
		hashMap.forEach((k, v) -> System.out.println("Key = " + k + "Employee = " + v));
		
	}
}
