
package methods;

public class Calculator {

    /* 
     * Separate callable method to add 2 numbers together
     */
	public int add(int firstNumber, int secondNumber) {
		return firstNumber + secondNumber;
	}

	/* 
	 * Separate callable method to subtract 2 numbers from each other
	 */
	public int subtract(int firstNumber, int secondNumber) {
		return firstNumber - secondNumber;
	}

	/* 
	 * Separate callable method to multiply 2 numbers together
	 */
	public int multiply(int firstNumber, int secondNumber) {
		return firstNumber * secondNumber;
	}
	
	/*
	 * Calculate the annual interest rate.
	 *    1) Multiply your principal by your annual interest rate, or $10,000 × 0.05 = $500. 
	 *    2) Then, you'd multiply this value by the number of years on the loan, or $500 × 5 = $2,500.
	 */
	public double calculateAnnualInterest(double principal, float annualInterestRate, int numberOfLoanYears) {
		return (double)principal * annualInterestRate * numberOfLoanYears; 
	}
	
	/*
	 * Converts any decimal value to a percentage represented as aString.
	 */
	public String convertDecimaltoPercentage(float someDecimalValue) {
		return String.format("%.0f", (someDecimalValue * 100));
	}
}
