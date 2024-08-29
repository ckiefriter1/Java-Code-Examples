package collections;

import java.util.Set;
import java.util.HashSet;

public class SetExample {

	public static void main(String[] args) {
		Set<String> vegetables = new HashSet<String>();

		vegetables.add("Carrot");
		System.out.println(vegetables);
		
		vegetables.add("Onion");
		System.out.println(vegetables);
		
		vegetables.add("Broccoli");
		System.out.println(vegetables);
		
		vegetables.add("Asparagus");
		System.out.println(vegetables);
		
		vegetables.add("Carrot");
		System.out.println(vegetables);

		vegetables.add(null);
		System.out.println(vegetables);

		vegetables.add(null);
		System.out.println(vegetables);
		
		System.out.println("The size of our set is: " + vegetables.size());

	}

}
