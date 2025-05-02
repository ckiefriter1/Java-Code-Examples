package polymorphism;

public class PolymorphismExample {

   public static void main(String[] args) {
	    Animal myAnimal = new Animal();  // Create a Animal object
	    Animal myPig = new Pig();  // Create a Pig object
	    Animal myDog = new Dog();  // Create a Dog object
	    
	    // Uses Method Overriding 
	    System.out.println("-----------------------------\nUsing Method Overriding");
	    myAnimal.animalSound();
	    myPig.animalSound();
	    myDog.animalSound();
	    
	    
	    // Uses Method Overloading
	    Calculator calc = new Calculator();
	    System.out.println("\n\n-----------------------------\nUsing Method Overloading");
	    System.out.println(calc.add(5,5));
	    System.out.println(calc.add(5,5,5));
	    System.out.println(calc.add(5.4,5.3));
   }

}
