package objects;

public class ObjectDemo {

	public static void main(String[] args) {
		
		int age = 34;
		
		String name  = "Chuck Kiefriter";
		String name2 = "Chuck Kiefriter";
		
		/*
		 * Spec for String class:
		 * https://docs.oracle.com/javase/7/docs/api/java/lang/String.html
		 */
		System.out.println("Name length = " + name.length());
		System.out.println("Character at position 5 is " + name.charAt(4));
		
		System.out.println(name.equals(name2));
		System.out.println(name == name2);
		
		
	}

}
