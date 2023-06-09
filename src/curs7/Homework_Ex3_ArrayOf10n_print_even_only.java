package curs7;

import java.util.Scanner;

public class Homework_Ex3_ArrayOf10n_print_even_only {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
	      System.out.println("Introdu cele zece numere:");
	      
	      int [] myArray = new int[10];   
	  
	     
	      for(int i=0; i<myArray.length; i++ ) {
	    	 System.out.print("Introdu elementul " +(i+1)+": ");
	    	 myArray[i] = scan.nextInt();
	      }
	      scan.close();
	      
	      System.out.println();
	      System.out.println("------FOR-------------------------");
	      System.out.print("Ten Even Numbers Array: ");
	     
	      for (int i = 0; i<myArray.length; i++) 
	      {  
	    	  if(myArray[i]%2==0)
	            System.out.print(myArray[i] + " ");  
	        }  
	      
	     
	      System.out.println();
	      System.out.println("------WHILE-----------------------");
	      System.out.print("Ten Even Numbers Array: ");
	      int j = 0;
	      while (j<=myArray.length-1)
			 {      
	    	  if(myArray[j]%2==0)
	    	  System.out.print(myArray[j] + " ");
	    	  j++;
			        
			 }   
		

	}

}
