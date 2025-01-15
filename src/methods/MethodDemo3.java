package methods;

public class MethodDemo3 {

	public static void main(String[] arg) {
	
		//Variable Declarations — visible in main method ONLY!
		int firstNumber = 3;
		int secondNumber = 7;
		
		//Call to first Method — passing variables into this Method as Parameters!
		sumTwoNumsPrintResult(firstNumber,secondNumber);

		//Additional Variable Declarations — visible in main method ONLY!
		int result = 0;
		
		//Call to second Method
		result = sumTwoNumsReturnResult(firstNumber,secondNumber);
		System.out.println("The sum is: " + result);
	
	}  // End of main()


	public static void sumTwoNumsPrintResult (int number1, int number2) {
	
		int sum = 0;
		sum = number1 + number2;
		System.out.println("The sum is: " + sum);
		System.out.println("----------------");
		return;
		// No return statement, because the returnType is void!	
	
	}
	
	public static int sumTwoNumsReturnResult (int number1, int number2) {

		int sum = 0;
		sum = number1 + number2;
		return sum;

	}

}