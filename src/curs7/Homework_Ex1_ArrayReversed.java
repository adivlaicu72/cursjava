package curs7;

import java.util.Scanner;

public class Homework_Ex1_ArrayReversed {

	public static void main(String[] args) {

		      Scanner scan = new Scanner(System.in);
		      System.out.println("Cate elemente trebuie sa aiba array-ul:");
		      int length = scan.nextInt();
		      int [] myArray = new int[length];   
		  
		     
		      for(int i=0; i<myArray.length; i++ ) {
		    	 System.out.print("Introdu elementul " +(i+1)+": ");
		    	 myArray[i] = scan.nextInt();
		      }
		      scan.close();
		      System.out.println();
		      System.out.println("------FOR----------------");
		      System.out.print("Array reversed: ");
		      //Loop through the array in reverse order
		      for (int i = myArray.length-1; i >= 0; i--) 
		      {  
		            System.out.print(myArray[i] + " ");  
		        }  
		      
		      System.out.println();
		      System.out.println("------WHILE--------------");
		      System.out.print("Array reversed: ");
		      int j = myArray.length-1;
		      while (j>=0)
				 {      
		    	  System.out.print(myArray[j] + " ");
		    	  j--;
				        
				 }   
		}
}

