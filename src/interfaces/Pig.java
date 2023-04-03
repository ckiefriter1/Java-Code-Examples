package interfaces;

/**
 * Pig class "implements" the Animal interface
 */
public class Pig implements Animal {
	public void makeSound() {
	 // The body of animalSound() is provided here
	 System.out.println("The pig says: wee wee");
	}
	
	public void run() {
		System.out.println("The pig runs on 4 legs.");
	}
	
	public void sleep() {
	 // The body of sleep() is provided here
	 System.out.println("The pig sleeps on it's side...Zzz");
	}
}
