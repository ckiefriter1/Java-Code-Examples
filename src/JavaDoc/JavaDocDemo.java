package JavaDoc;

/**
 * Represents a student enrolled in the school.
 * A student can be enrolled in many courses.
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
	   */
	  public void setName(String newName) {
	    name = newName;
	  }
	  
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
