package curs3;

import java.util.Scanner;

public class Saptamana {
	int dayOfWeek;
	
public void askTheDayOfWeek() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Ce zi este astazi? :");
		System.out.println("Te rog introdu un numar in intervalul 1-7 :");
		dayOfWeek = scan.nextInt();
		
	}


public void checkDayOfWeek() {
		
		if ( dayOfWeek == 0) {
			Scanner scan = new Scanner(System.in);
			System.out.println("Te rog sa introduci un numar mai mare ca 0 !");
			dayOfWeek = scan.nextInt();
		
			}
		
		else if (dayOfWeek == 1) {
			Scanner scan = new Scanner(System.in);
			System.out.println("Astazi este luni");
			dayOfWeek = scan.nextInt();
	
			}
		else if (dayOfWeek == 2) {
			Scanner scan = new Scanner(System.in);
			System.out.println("Astazi este marti");
			dayOfWeek = scan.nextInt();
	
			}
		else if (dayOfWeek == 3) {
			Scanner scan = new Scanner(System.in);
			System.out.println("Astazi este miercuri");
			dayOfWeek = scan.nextInt();
	
			}
		else if (dayOfWeek == 4) {
			Scanner scan = new Scanner(System.in);
			System.out.println("Astazi este joi");
			dayOfWeek = scan.nextInt();
	
			}
		else if (dayOfWeek == 5) {
			Scanner scan = new Scanner(System.in);
			System.out.println("Astazi este vineri");
			dayOfWeek = scan.nextInt();
	
			}
		else if (dayOfWeek == 6) {
			Scanner scan = new Scanner(System.in);
			System.out.println("Astazi este sambata");
			dayOfWeek = scan.nextInt();
	
			}
		else if (dayOfWeek == 7) {
			Scanner scan = new Scanner(System.in);
			System.out.println("Astazi este duminica");
			dayOfWeek = scan.nextInt();
	
			}
		else if (dayOfWeek > 7) {
			Scanner scan = new Scanner(System.in);
			System.out.println("Saptamana are doar 7 zile te rog sa introduci un numar valid !");
			dayOfWeek = scan.nextInt();
	
			}
		
	}
}
