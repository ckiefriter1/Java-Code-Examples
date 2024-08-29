package classes;

public class AnimalMain {

 	public static void main(String[] args) {

	    // Use the Constructor to set the information upon 
	    //     creation of the Object.
		Animal elephant = new Animal("Dumbo", "Elephant", 8000, 15, "Disneyland");
		
		elephant.describe();
	
		System.out.println("\n\nLet's access individual fields:");
		System.out.println("-------------------------------");
		System.out.println("Our elephant is named: " + elephant.getName());
	
		/*
		 * EXAMPLE:  Create an Object with the Default Constructor
		 *           and use the Setters to store information
		 */
		System.out.println("\n\n\n");
		Animal kangaroo = new Animal();
	
		/*
		 * Use Setters of the object to set (or assign) values to all the properties (data) 
		 * in the object. 
		 */
		kangaroo.setName("Jack");
		kangaroo.setType("Kangaroo");
		kangaroo.setWeight(150);
		kangaroo.setHeight(6);
		kangaroo.setLocation("Taronga Zoo");
	
		kangaroo.describe();
	}
}