package user.input;

/* The Java Scanner class is a simple, versatile, easy-to-use class 
 * that makes user input in Java relatively straightforward.
 */
import java.util.Scanner;

public class ScannerUserInput {
	
	public static void main(String[] args) {
		// Java Scanner String input example
	    System.out.println("What is your name?");
	    Scanner scanner = new Scanner(System.in);
	    String name = scanner.nextLine();
	    System.out.println(name + " is a nice name!");

	    System.out.println("What is your first name?");
	    String firstName = scanner.next();
	    System.out.println("What is your last name?");
	    String lastName = scanner.next();
	    System.out.println(firstName + " " + lastName + " is a nice name!");
	    scanner.close();

	}

}
