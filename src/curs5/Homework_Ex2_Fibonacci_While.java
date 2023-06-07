package curs5;

public class Homework_Ex2_Fibonacci_While {

	public static void main(String[] args) {
		 
		
		int n1=0,n2=1,n3,j=1,count=9;    
		 System.out.print("Seria Fibonacci pentru " +count+" numere: ");
		 
		 while (j<=9)
		 {      
		  System.out.print(n1+" ");
		  
          n3=n1+n2;
          n1=n2;
          n2=n3;
		  j++;
		  
	 }   
	}

}
