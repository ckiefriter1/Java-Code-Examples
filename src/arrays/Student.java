package arrays;

public class Student { 
	
    private String fullName = ""; 
    private int[] grades; 

    /* 
     * Constructor for Student class with two parameters used to instantiate the class.
     */
    public Student(String fName,int[] grades) { 
    	this.fullName = fName; 
    	this.grades = grades; 
    }  
    
   
    /* 
     * publicly accessible method named describe, void means this method does not return and data.
     */
    public void describe() { 
    	
    	System.out.println("Student: " + this.fullName); 
    	System.out.println("Grades:"); 
    	
    	for (int grade : this.grades) { 
    		System.out.println("\t" + grade + " "); 
    	} 
    	
    	System.out.println(); 
    }
}