package wrappers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class WrapperClassExample {

	public static void main(String[] args) {
		
		List<Integer> numbers = new ArrayList<Integer>();
		Integer a = 23;
		Integer b = 15;
		Integer c = 45;
		numbers.add(a);
		numbers.add(b);
		numbers.add(c);
		a = 34;
		numbers.add(a);
		System.out.println("------------------------------");
		displayList(numbers);
		numbers.sort(null);
		System.out.println("------------------------------");
		displayList(numbers);
		numbers.sort(Collections.reverseOrder());
		System.out.println("------------------------------");
		displayList(numbers);
		a = 68;
		System.out.println("------------------------------");
		displayList(numbers);
		
	}
	
	/*
	 * Display all the elements in the list.
	 */
	public static void displayList(List<Integer> aList) {
		/*
		 * Uses Iterator object to iterate through the entire list.
		 */
		Iterator<Integer> listIterator = aList.iterator();
		while (listIterator.hasNext()) {
			System.out.println(listIterator.next());
		}
		
		return;
	}
	


}
