package methods;

public class MethodDemo3 {

	public static void main(String[] args) {
		
		MethodDemo3 demo = new MethodDemo3();
		
		int a = 20;
		int b = 30;
		
		demo.displayNumbers(a, b);
		
		a = 25;
		b = 34;
		
		demo.displayNumbers(a, b);
		
		a = -31;
		b = -56;
				
		demo.displayNumbers(a, b);
		
		
	}
	
	public void displayNumbers(int a, int b) {
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		return;
	}
	

}
