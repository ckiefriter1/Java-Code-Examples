package classes;

public class Animal {
	
	/*
	 * Class properties (variables), the data that's stored in objects (instances) of 
	 * this class. 
	 */
	private String name;
	private String type;
	private double weight;
	private double height;
	private String location;
	
	/*
	 * No argument Constructor.
	 */
	public Animal() { }
	
	/*
	 * Constructor that utilized to pass all the object properties to it as part of 
	 * instantiating the object.
	 */
	public Animal(String name, String type, double weight, double height, String location ) {
		this.name = name;
		this.type = type;
		this.weight = weight;
		this.height = height;
		this.location = location;
	}
	
	/*
	 * Getters / Setters for access to all properties.
	 */
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public void describe() {
		System.out.println("Animal Description");
		System.out.println("------------------");
		System.out.println("\tName: " + name);
		System.out.println("\tType: " + type);
		System.out.println("\tWeight: " + weight + " lb.");
		System.out.println("\tHeight: " + height + " ft.");
		System.out.println("\tLocated at: " + location);
	}
}