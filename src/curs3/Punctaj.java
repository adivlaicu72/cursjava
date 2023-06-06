package curs3;

import java.util.Scanner;

public class Punctaj {
	
	int punctaj;
	
public void askTheNumberOfPoints() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Te rog introdu punctajul: ");
		punctaj = scan.nextInt();
		
	}


public void compareTheNumberOfPoints() {
		
		if ( punctaj> 0 && punctaj <= 65) {
			Scanner scan = new Scanner(System.in);
			System.out.println("Ai picat. Mai Incearca !");
			punctaj = scan.nextInt();
		
			}
		
		else if (punctaj >= 66) {
			Scanner scan = new Scanner(System.in);
			System.out.println("Felicitari, Ai trecut !");
			punctaj = scan.nextInt();
	
			}

	} 

}
