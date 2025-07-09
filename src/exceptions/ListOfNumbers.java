package exceptions;

import java.util.*;
import java.io.*;

public class ListOfNumbers {
	private List<Integer> list = new ArrayList<Integer>();
	private static final int SIZE = 10;

	public ListOfNumbers() {
		
		for (int i = 1; i <= SIZE; i++) {
			Integer num = (i * SIZE);
			list.add(num);
		}
		
	}
	
	public void writeList() {
	    PrintWriter out = null;

	    try {
	        System.out.println("Entering \"try\" statement");
	        
	        /*
	         * Would throw an IOException because of bad file name.
	         */
	        //out = new PrintWriter(new FileWriter("!@#$%^&*OutFile.txt"));  
	        
	        out = new PrintWriter(new FileWriter("OutFile.txt"));
	        
	        for (int i = 0; i < SIZE; i++) {
	        	out.println("Value at index: " + i + " = " + list.get(i));
	            System.out.println("Value at index: " + i + " = " + list.get(i));
	        }
	    } catch (IndexOutOfBoundsException e) {
	        System.err.println("Caught IndexOutOfBoundsException: " +  e.getMessage());
	                                 
	    } catch (IOException e) {
	        //System.err.println("Caught IOException: " +  e);
	        e.printStackTrace(System.err);
	                                 
	    } catch (Exception e) {
	    	System.err.println("Caught general exception: " +  e.getMessage());
	    
	    } finally {
	        if (out != null) {
	            System.out.println("*** Closing PrintWriter");
	            out.close();
	        } 
	        else {
	            System.out.println("*** PrintWriter not open");
	        }
	    }
	}

}
