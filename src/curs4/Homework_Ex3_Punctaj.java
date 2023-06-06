package curs4;

import java.util.Scanner;

public class Homework_Ex3_Punctaj {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Te rog introdu punctajul: ");
		int punctaj = scan.nextInt();
		scan.close();
		
		String calificativ = (punctaj >= 90)? "Foarte Bine" : (punctaj >= 80) ? "Bine" : "Suficient";
		System.out.println("Calificativul este: " +calificativ);
	}

}
