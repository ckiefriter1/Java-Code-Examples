package conditionals;

public class BooleanTest {

	public static void main(String[] args) {
		boolean a = false;
		boolean b = true;
		boolean c = false;
		
		boolean result;
		
		if ((a == true && b == true) || (c == true || (!(b == true)))) {
			result = true;
		} else {
			result = false;
		}
		
		System.out.println("Result of " + result);

	}

}
