package curs5;

import java.util.Scanner;

public class Homework_Ex1_User_Login_Validator {
	/*
	 *  Scriem un program care simuleaza un login.
		
		Programul primeste input de la utilizator un user si o parola.
		
		Are trei incercari de logare
		Atata timp cat incearca de trei ori si credentialele sunt gresite programul va
		printa : “Maximum attempts reached. User blocked”
		
		Pentru fiecare incercare gresita programul printeaza : “Login Error”
		
		Daca credentialele sunt valide programmul printeaza : “Login Sucessful”
	
	Note:
	Userul este String si valoarea valida este: “TestUser”
	Parola este int si valoarea valida este :1234
	 */

	
	public static void main(String args[]) {
		
		int totalAttempts = 3; //attempt counter
		boolean validCredentials = false;
	
		  try (Scanner scan = new Scanner(System.in)) {
			  
			  while (totalAttempts > 0 && !validCredentials) {
	            System.out.print("Enter the user name: ");
	            String username = scan.nextLine();

	            System.out.print("Enter the password: ");
	            String password = scan.nextLine();

	            	if ("TestUser".equals(username) && "1234".equals(password)) {
	                System.out.println("Login successful");
	                break;
	            	} else {
	            				totalAttempts--;
	            				System.out.println("Login error");
	            			}
	            				if (totalAttempts==0) {
	            				System.out.println("Maximum attempts reached. User blocked!");
			
	            					}
			  } 
	    }
	}
}
				
	
	






			

	   
	    

	
	


