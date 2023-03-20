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
		
		System.out.println(a + " + " + b + " = " + result1);
		System.out.println(a + " - " + b + " = " + result2);
		System.out.println(a + " * " + b + " = " + result3);
		System.out.println("--------------------------------");
		
		/* 
		 * Method calls return the result of the calculation, which is used directly in the System.out.println output
		 */
		System.out.println(a + " + " + b + " = " + myCalc.add(a,b));
		System.out.println(a + " - " + b + " = " + myCalc.subtract(a,b));
		System.out.println(a + " * " + b + " = " + myCalc.multiply(a,b));
		

	}
	
}
