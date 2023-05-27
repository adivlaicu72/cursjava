package curs5;
import java.util.Scanner;

public class HomeWorkUserAuthentication {
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

	
	public static void main(String args[]){

		String username, password;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter username:");//username:TestUser
        username = s.nextLine();
        System.out.print("Enter password:");//password:1234
        password = s.nextLine();

	    int totalAttempts = 3;

	    while (totalAttempts != 0) {

	        if (username == "TestUser" && password == "1234") {


	            System.out.println("Login Successfull!");
	            return;

	        } else {


	            System.out.println("Login Error!");

	            totalAttempts--;
	            System.out.println(totalAttempts);

	        }

	    }

	    if (totalAttempts == 0) {

	        System.out.println("Maximum number attempts reached. User blocked");
	    }
	}
	

	
	
//		    public static void main(String args[])
//		    {
//		        
//		        
//		        
//		        
//		        if(username.equals("TestUser") && password.equals("1234"))
//		        {
//		            System.out.println("Login Successful");
//		        }
//		        else
//		        {
//		            System.out.println("Login Error");
//		        }
//		    }

	}

