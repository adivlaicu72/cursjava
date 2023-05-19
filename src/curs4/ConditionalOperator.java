package curs4;

import java.util.Scanner;

public class ConditionalOperator {
	/*
	 * program care citeste 2 nr de la tastatura
	 * daca fiecare nr este pozitiv
	 * daca ambele nr sunt pozitive
	 * care dintre cele 2 numere este cel mai mic sau daca sunt egale
	 */


	public static void main(String[] args) {
		
		int num1;
		int num2;
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the first number: ");
		num1 = scan.nextInt();
		System.out.println("Please enter the second number: ");
		num2 = scan.nextInt();
		
		if(num1 >= 0) {
			System.out.println("Num1 is positive");
		} else {
			System.out.println("Num1 is negative");
		}
		
		if(num2 >= 0) {
			System.out.println("Num2 is positive");
		} else {
			System.out.println("Num2 is negative");
		}
		
		if(num1 >=0 && num2 >= 0) {
			System.out.println("Numbers is positive");
		} else {
			System.out.println("Numbers is negative");
		}
		
		if(num1>num2) {
			System.out.println("Num1 is the greatest");

		}else if(num1 <num2) {
			System.out.println("Num2 is the greatest");

		}else {
			System.out.println("Numbers are equal");

		}
		
		
	}

}
