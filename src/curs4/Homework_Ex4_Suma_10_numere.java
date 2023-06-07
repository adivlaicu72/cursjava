package curs4;

import java.util.Scanner;

public class Homework_Ex4_Suma_10_numere {
	
	/*
	 * facem un program care ii cere userului 10 numere
	 * Dupa ce utilizatorul a introdus cele zece numere calculam suma lor si o
     * printam sub urmatoarea forma : The sum of the numbers is:
	 * 
	 */

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Te rog introdu cele zece numere: ");
		int sum = 0;
		for (int i = 0; i < 10; i+=1 ) {
			sum += scan.nextInt();
		}
		scan.close();	
		System.out.println("The sum of the numbers is: " + sum);
		
	}

}
