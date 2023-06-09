package curs9;

import java.util.Scanner;

/*
 * Avem nevoie de o serie de coduri postale si orasele asociate
 * avem nevoie de aceste coduri inca de la initializare (6 orase)
 * Avem nevoie de o functionalitate in care sa caute baza unui cod postal
 * si care sa imi aduca orasul asociat
 * Daca codul introdus nu exista atunci vreau sa arunc PostalCodeException
 * Daca codul, exista printez orasul
 * Daca avem exceptia atunci vreau sa intreb din nou pana primesc codul valid
 * 
 */


public class SearchPostalCode {

	
	
	public static void main(String[] args) {
		CoduriPostale codPostal = new CoduriPostale();
		System.out.println(codPostal.cp);
		Scanner scan = new Scanner(System.in);
		
		
		
		while (true){
			System.out.println("Introdu un cod postal :");
			int codP = scan.nextInt();
			
			try {
				System.out.println(codPostal.gasesteOras(codP));
				break;
				
			} catch (PostalCodeException e) {
				e.printStackTrace();
			}
		}
		
	}

}
