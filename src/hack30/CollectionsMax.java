package hack30;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*
 * Como retornar um objeto de maior valor
 */

class Productzzz {
	private String name;
	private Double price;

	public Productzzz(String name, Double price) {
		super();
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Productzzz [name=" + name + ", price=" + price + "]";
	}
}

public class CollectionsMax {
	
	

	public static void main(String[] args) {
		Productzzz p1 = new Productzzz("a", 5.0);
		Productzzz p2 = new Productzzz("b", 10.0);
		Productzzz p3 = new Productzzz("c", -5.0);
		Productzzz p4 = new Productzzz("d", 15.00);
		
		List<Productzzz> plist = new ArrayList<>();
		
		plist.addAll(Arrays.asList(p1, p2, p3, p4));
		
		Collections.max(plist, Comparator.comparing(Productzzz::getPrice));
		
		// Retornar o objeto com o maior preço
		System.out.println(Collections.max(plist, Comparator.comparing(Productzzz::getPrice)));
		
	}
}
