package conditionals;

public class BooleanOperatorsDemo {

	public static void main(String[] args) {
		
		boolean trueExpression = true;
		boolean falseExpression = false;
		
		// Boolean expression that evaluates true. 
		if (trueExpression) {
			System.out.println("Condition evaluated true");
		} else {
			System.out.println("Condition evaluated false");
		}
		
		// Boolean expression that evaluates false. 
		if (falseExpression) {
			System.out.println("Condition evaluated true");
		} else {
			System.out.println("Condition evaluated false");
		}
		
		System.out.println("-------------------------------------------------------------");
		
		// Boolean expression logical AND (&&) operator in expressions 
		System.out.println(trueExpression + " expression AND (&&) " + trueExpression + " expression evaluates " + (trueExpression && trueExpression));
		System.out.println(trueExpression + " expression AND (&&) " + falseExpression + " expression evaluates " + (trueExpression && falseExpression));
		
		System.out.println("-------------------------------------------------------------");
		
		// Boolean expression logical OR (||) operator in expressions 
		System.out.println(trueExpression + " expression OR (||) " + trueExpression + " expression evaluates " + (trueExpression || trueExpression));
		System.out.println(trueExpression + " expression OR (||) " + falseExpression + " expression evaluates " + (trueExpression || falseExpression));
		System.out.println(falseExpression + " expression OR (||) " + falseExpression + " expression evaluates " + (falseExpression || falseExpression));
		
	}

}
