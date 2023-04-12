package debugging;

import java.util.List;
import java.util.ArrayList;

public class DebuggingExample {

	public static void main(String[] args) {
		
		List<String> names = new ArrayList<String>();
		addNames(names);
		int index = findIndexOfName(names, "Sam"); 
		
		if (index == -1) {
			System.out.println(index + " Name not found");
		} else {
			System.out.println("Name found at index " + index);
		}
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
		
		return index;
	}
}
