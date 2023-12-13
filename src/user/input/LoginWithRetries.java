package user.input;

import java.util.Scanner;

public class LoginWithRetries {

	public static void main(String[] args) {
		
		boolean loggedIn = false;
		Scanner sc = new Scanner(System.in);
		Byte loginRetryLimit = 3;
		Byte loginRetryCount = 0;
		
		while (!loggedIn) {
			System.out.print("Enter username: ");   
			String username = sc.nextLine();   
			System.out.print("Enter password: ");  
			String password = sc.nextLine();   
			
			// Validate username and password
			if (username.equals("samy123") && password.equals("12345")) {
				System.out.println("*** Welcome back " + username);
				loggedIn = true;
			} else { 
				System.out.println("*** Inaccurate credentials!...try again. You have " + (loginRetryLimit - loginRetryCount) + " retries remaining.");
				loginRetryCount++;
			} // end of else 
			
			// If user has hit the retry limit, break out of the while loop and terminate the program.
			if (loginRetryCount > loginRetryLimit) {
				System.out.println("*** You have exceeded the login retry limit, you account has been locked out.");
				break;	// break out of while loop and terminate program.
			}
		} // end of while
		
		sc.close();
	}

}
