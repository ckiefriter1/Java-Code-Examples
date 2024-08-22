package user.input;

import java.util.*;  

public class UserInputDemo {  
	public static void main(String[] args)  {
		// System.in is a standard input stream  
		Scanner sc = new Scanner(System.in);    
		
		System.out.print("Enter username:  ");   
		String username = sc.nextLine();   
		
		System.out.print("Enter password: "); 
		String password = sc.nextLine();               
		
		if (username.equals("samy123") && password.equals("12345")) {
			System.out.println("Welcome back " + username);
		} else { 
			System.out.println("***Inaccurate credentials!"); 
		} // end of else 
		sc.close();
	}   // end of main() 
}  // end of UserInputDemo class
