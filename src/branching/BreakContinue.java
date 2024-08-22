package branching;

public class BreakContinue {

	public static void main(String[] args) {
		
		/*
		 *  Break example - used to jump out of a loop completely.
		 */
		System.out.println("*** Count loop with break");
		for (int i = 1; i <= 10; i++) {
			
			if (i == 4) {
				break;
			}
			System.out.println(i);
		}    // end of the for loop
		
		/*
		 *  Continue example - used to break one iteration in the loop.
		 */
		System.out.println("----------------------------------");
		System.out.println("*** Count loop with continue");
		for (int i = 1; i <= 10; i++) {
			if (i == 4) {
			    continue;
			}
			System.out.println(i);
		}    // end of the for loop
		
	}   // end of main method

}
