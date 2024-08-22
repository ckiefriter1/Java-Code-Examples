package equality;

public class EqualityDemo {

	public static void main(String[] args) {
		
		/*
		 * Equality check between 2 primitives.  Checks that the values are equal.
		 */
		int age1 = 21;
		int age2 = 21;
		System.out.println("age1 == age2: " + (age1 == age2));

		/*
		 * Equality check for objects compares that both object variables are referencing (or pointing to) 
		 * the same object instance. Should compare false.
		 */
		int[] grades = { 100, 100, 100 };
		Student s1 = new Student("Chuck", grades);
		Student s2 = new Student("Chuck", grades);
		System.out.println("s1 == s2: " + (s1 == s2));
		
		/*
		 * Now s1 & s2 both point to the same object instance in memory that was created originally by s2.  The other 
		 * object that was created by s2 has nothing pointing to it (or referencing it) so the JVM has a Garbage Collection
		 * process that will clean up this object and deallocate the memory for other use.
		 */
		s1 = s2;   
		System.out.println("s1 == s2 after assigning s1 = s2: " + (s1 == s2));
		
		/*
		 * Comparison of fullName String property in both student objects s1 and s2.
		 */
		System.out.println("s1.fullName.equals(s2.fullName): " + (s1.fullName.equals(s2.fullName)));
		
		/*
		 * String class - the literal string "Chuck" is a String object itself and is immutable meaning both literals
		 * point to the same string object in memory.  So even though we create 2 different String variables and assign 
		 * them to what looks like two different literal strings, they both point to the same String object in memory.
		 */
		String name1 = "Chuck";
		String name2 = "Chuck";
		System.out.println("name1 == name2: " + (name1 == name2));

	}

}
