package strings;

import java.util.GregorianCalendar;

public class StringTest {

	/*
	 * Compare run-times and memory usage for StringBuffer vs StringBuilder classes.
	 */
	public static void main(String[] args) {
		//testString();
		testStringBuilder();
	}
	
	public static void testString() {
		System.gc();
		long start=new GregorianCalendar().getTimeInMillis();
		long startMemory=Runtime.getRuntime().freeMemory();
		
		String s = ":";
		
		for(int i = 0; i<50000; i++){
			s += ":" + Integer.toString(i);
		}
		
		long end=new GregorianCalendar().getTimeInMillis();
		long endMemory=Runtime.getRuntime().freeMemory();
		
		System.out.println("*** String Stats***");
		System.out.println("# of Strings concatenated: 50,000");
		System.out.println("Time Taken: "+(end-start) + " milliseconds");
		System.out.println("Memory used: " + String.format("%,d",(startMemory-endMemory)));
		//System.out.println(s);
	}

	public static void testStringBuffer() {
		System.gc();
		long start=new GregorianCalendar().getTimeInMillis();
		long startMemory=Runtime.getRuntime().freeMemory();
		
		StringBuffer sb = new StringBuffer();
		
		for(int i = 0; i<10000000; i++){
			sb.append(":").append(i);
		}
		
		long end=new GregorianCalendar().getTimeInMillis();
		long endMemory=Runtime.getRuntime().freeMemory();
		
		System.out.println("*** StringBuffer Stats***");
		System.out.println("Time Taken: "+(end-start) + " milliseconds");
		System.out.println("Memory used: " + String.format("%,d",(startMemory-endMemory)));
	}

	public static void testStringBuilder() {
		System.gc();
		long start=new GregorianCalendar().getTimeInMillis();
		long startMemory=Runtime.getRuntime().freeMemory();
		
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i<10000000; i++){
			sb.append(":").append(i);
		}
		
		long end=new GregorianCalendar().getTimeInMillis();
		long endMemory=Runtime.getRuntime().freeMemory();
		
		System.out.println("*** StringBuilder Stats***");
		System.out.println("# of Strings concatenated: 10,000,000");
		System.out.println("Time Taken: "+(end-start) + " milliseconds");
		System.out.println("Memory used: " + String.format("%,d",(startMemory-endMemory)));
	
	}
}