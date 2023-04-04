package interfaces;

public class InterfaceExample {
	
	public static void main(String[] args) {
		Animal a1 = new Pig();
		Animal a2 = new Owl();
		
		/*
		 * Utilize same methods from Animal interface, but each class implement s differently.
		 */
		a1.makeSound();
		a1.run();
		a1.sleep();
		
		System.out.println("--------------------------------");
		
		a2.makeSound();
		a2.run();
		a2.sleep();
		
	}

}
