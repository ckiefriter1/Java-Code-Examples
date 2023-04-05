package classes;

public class GetterSetterExample {
	
	private String name;
	
	/*
	 * Getter method to get (retrieve) name property.
	 */
	public String getName() {
		return this.name;
	}

	/*
	 * Setter method to set (assign a value to) name property.
	 */
	public void setName(String name) {
		this.name = name;
	}

	public static void main(String[] args) {
		
		GetterSetterExample gs = new GetterSetterExample();
		gs.setName("Chuck Kiefriter");
		System.out.println("My name is: " + gs.getName());

	}

}
