package collections;

import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class ListExample {

	public static void main(String[] args) {
		List<String> myInstruments = new ArrayList<String>();
		
		List<String> mi2 = myInstruments;
		
		myInstruments.add("Tuba");
		myInstruments.add("Trombone");
		myInstruments.add("Trumpet");
		myInstruments.add("Triangle");
		myInstruments.add("Flute");
		myInstruments.add("Clarinet");
		myInstruments.add("Oboe");
		mi2.add("Guitar");
		
		/*
		 * Display current instrument list.
		 */
		System.out.println("---------------------------------------");
		System.out.println("*** Current Instruments List ***");
		displayList(myInstruments);
		
		/*
		 * Display index location of the "Trumpet" element in the list.
		 */
		System.out.println("*** Trumpet found at index: " + myInstruments.indexOf("Trumpet") + " in the Instruments List ***");
				
		/*
		 * Add "Drums" instrument to List, but check if it exist in the list already.
		 */
		searchAndAdd(myInstruments, "Drums");
		System.out.println("---------------------------------------");
		System.out.println("*** Updated Instruments List ***");
		displayList(myInstruments);
		searchAndAdd(myInstruments, "Drums");
		
		/*
		 * Sort and display the sorted list.
		 */
		System.out.println("---------------------------------------");
		System.out.println("*** Sorted Instruments List - Ascending Order ***");
		myInstruments.sort(null);
		displayList(myInstruments);
		
		System.out.println("---------------------------------------");
		System.out.println("*** Sorted Instruments List - Descending Order ***");
		//Collections.sort(myInstruments, Collections.reverseOrder());
		myInstruments.sort(Collections.reverseOrder());
		displayList(myInstruments);
		
	}
	
	
	/*
	 * Display all the elements in the list.
	 */
	public static void displayList(List<String> aList) {
		/*
		 * Uses Iterator object to iterate through the entire list.
		 */
		Iterator<String> listIterator = aList.iterator();
		while (listIterator.hasNext()) {
			System.out.println(listIterator.next());
		}
		
		return;
	}
	
	/*
	 * Check if List contains the value in aNewElement as duplicates are allowed in List objects 
	 *    if true, then display "Drums found in list"
	 *    Otherwise add "Drums" to the list and display "Adding Drums to list"
	 */
	public static void searchAndAdd(List<String> aList, String aNewElement) {
		if (aList.contains(aNewElement)) {
			System.out.println("*** " + aNewElement + " found in list");		
		} else {
			aList.add(aNewElement);
			System.out.println("*** Adding " + aNewElement + " to list");
		}
		
		return;
		
	}
	
}