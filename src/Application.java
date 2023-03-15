// Basic class structure.
public class Application {
	
	// Required to make this class an executable program.  This method 
	// is the entry point for this program.
	public static void main(String[] args) {
		
		// You write code in between the curly braces {}
		
		// Single line comment
		
		/*
		 * Multi-line comment
		 */
		
		// Code that executes when this class is run as a program.
		System.out.println("*** My first Java program ***");
		System.out.println("-----------------------------");
		
		
		// System properties accessible in Java language in System class
		// https://docs.oracle.com/javase/tutorial/essential/environment/sysprop.html
		System.out.println("  Java Version: " + System.getProperty("java.version"));
		System.out.println("   Computer HW: " + System.getProperty("os.arch"));
		System.out.println("           O/S: " + System.getProperty("os.name"));
		System.out.println("User Directory: " + System.getProperty("user.dir"));
		
					
	}  // End of the method called main

}   // end of the class called Application
