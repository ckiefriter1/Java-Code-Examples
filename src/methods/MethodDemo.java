package methods;

public class MethodDemo {

    public static void main(String[] args) {
		
		int a = 25;
		int b = 10;
		
		/*
		 * Declare and instantiate Calculator class.  
		 * 
		 * -> Calculator is the class.  
		 * -> myCalc is an object that's an instance of Calculator.
		 */
		Calculator myCalc = new Calculator();    
		
		/* 
		 * Method calls return the result of the calculation,which is stored in the result variables.
		 */
		int result1 = myCalc.add(a,b);
		int result2 = myCalc.subtract(a,b);
		int result3 = myCalc.multiply(a,b);
		
		displayMathResults(a, b, result1, result2, result3);
		
		/* 
		 * Method calls return the result of the calculation, which is used directly in the System.out.println output
		 */
		displayMathResults(a, b, myCalc.add(a,b), myCalc.subtract(a,b), myCalc.multiply(a,b));
		
		/*
		 * Calculate and display the annual interest on a loan.
		 */
		double principal = 100000d;
		float  annualInterestRate = .05f;
		int    numberOfLoanYears = 10;
		System.out.println("Annual Interest on $" + (int)principal + 
				           " with a " + myCalc.convertDecimaltoPercentage(annualInterestRate) + "% interest rate " +
				           "over a period of " + numberOfLoanYears + " years " +
				           " is = $" + String.format("%.2f", myCalc.calculateAnnualInterest(principal, annualInterestRate, numberOfLoanYears)));

	}
    
    /*
     * Display results of math calculations.
     */
    public static void displayMathResults(int a, int b, int addResult, int subtractResult, int multiplyResult) {
    	System.out.println(a + " + " + b + " = " + addResult);
		System.out.println(a + " - " + b + " = " + subtractResult);
		System.out.println(a + " * " + b + " = " + multiplyResult);
		System.out.println("--------------------------------\n");
    }
	
}
