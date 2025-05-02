package polymorphism;

public class Dog extends Animal {
   public void animalSound() {
	   super.animalSound();
	   System.out.println("\nand the dog says: bow wow");
   }
}
