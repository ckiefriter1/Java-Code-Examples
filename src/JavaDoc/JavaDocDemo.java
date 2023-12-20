package JavaDoc;

/**
 * Represents a student enrolled in the school.
 * A student can be enrolled in many courses.
 * 
 * @author Chuck Kiefriter
 * @version 1.0
 */
public class JavaDocDemo {

	  /**
	   * The first and last name of this student.
	   */
	  private String name;
	
	  /**
	   * Gets the first and last name of this Student.
	   * @return this Student's name.
	   */
	  public String getName() {
	    return name;
	  }
	
	  /**
	   * Changes the name of this Student.
	   * This may involve a lengthy legal process.
	   * @param newName This Student's new name.  
	   *                Should include both first
	   *                and last name.
	   * @return void (returns nothing)
	   * @since v1.0
	   */
	  public void setName(String newName) {
	    name = newName;
	  }
	  
	  /**
	   * Main method to execute this calss like a program.
	   * @param args Any parameters passed to the program that affect how it runs and is configured.
	   */
	  public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
