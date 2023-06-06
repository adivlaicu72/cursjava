package curs8;

import java.util.Scanner;

public class ExceptionExample4 {

	public static void main(String[] args) {	

	}
	
	public void division() {
		Scanner scan = new Scanner(System.in);
		int num1, num2, sum;
		
	//boolean flag = true;
		
		while(true) {
			
			try {
				System.out.println("Please enter num1 :");
				num1 = scan.nextInt();
				System.out.println("Please enter num2 :");
				num2 = scan.nextInt();
				
				
			} catch() {
				
			}
			if(num2 == 0) {
//				flag = false;
			}
		}
	}

}
