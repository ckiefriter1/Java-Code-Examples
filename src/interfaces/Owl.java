package interfaces;

/**
 * Owl class "implements" the Animal interface
 */
public class Owl implements Animal {
	public void makeSound() {
	 // The body of animalSound() is provided here
	 System.out.println("The owl says: \"Whooo\" ");
	}
	
	public void run() {
		System.out.println("The owl doesn't run,it can walk on two feet.");
	}
	
	public void sleep() {
	 // The body of sleep() is provided here
	 System.out.println("The owl sleeps perched in a tree...Zzz");
	}
}
