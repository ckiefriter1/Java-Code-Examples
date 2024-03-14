package debugging;

import java.util.List;
import java.util.ArrayList;

public class DebuggingExample {

	public static void main(String[] args) {
		
		List<String> names = new ArrayList<String>();
		addNames(names);
		
		/*
		 * Search for a name that is in the list.
		 */
		String nameToSearch = "Joan";
		int index = findIndexOfName(names, nameToSearch); 
		
		/*
		 * Search for a name that is NOT in the list.
		 */
		nameToSearch = "Chuck";
		index = findIndexOfName(names, nameToSearch); 
	}

	private static void addNames(List<String> names) {
		names.add("Sam");
		names.add("Tommy");
		names.add("Hillary");
		names.add("Joan");
	}
	
	private static int findIndexOfName(List<String> names, String name) {
		int index = -1;
		
		for (int i = 0; i < names.size(); i++) {
			if (names.get(i).equals(name)) {
				index = i;
				break;
			}
		}
		
		if (index == -1) {
			System.out.println(index + " Name " + name + " not found");
		} else {
			System.out.println("Name " + name + " found at index " + index);
		}
		
		return index;
	}
}
