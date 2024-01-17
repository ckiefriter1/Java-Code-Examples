package strings;

public class StringBuilderExample {
	public static void main(String[] args) {
	
		String firstName = "Bob";
		String lastName = "Brown";
		String middleInitial = "B";
		String space = " ";
		
		String fullName = firstName + space + middleInitial + space + lastName;
		
		System.out.println(firstName);
		System.out.println(lastName);
		System.out.println(fullName);
		
		StringBuilder sb = new StringBuilder();
		
		// use append() to dynamically create a String using StringBuilder 
		sb.append(firstName);
		sb.append(space);
		sb.append(lastName);
		System.out.println(sb.toString());
		
		// Add a middle Initial
		sb.insert(firstName.length() + 1, middleInitial + space);
		System.out.println(sb.toString());
	}
}
