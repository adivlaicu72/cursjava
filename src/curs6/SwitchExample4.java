package curs6;

import java.util.Scanner;

public class SwitchExample4 {
	
	/*
	 * Facem un program care verifica daca un student este eligibil
	 * de bursa 
	 * Conditiile sunt: 
	 * sa fie anul 3
	 * sa aiba un punctaj de 80 pentru bursa 1
	 * sa aiba un punctaj de 50 pentru bursa 1
	 * 
	 */

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Te rog introdu in ce an esti: ");
		int an = scan.nextInt();
		int punctaj;	
		
		switch(an) {
		case 3:
			System.out.println("Te rog introdu punctajul: ");
			punctaj = scan.nextInt();
			switch(punctaj) {
			case 80:
				System.out.println("Esti eligibil pentru bursa1");
				break;
			case 50:
				System.out.println("Esti eligibil pentru bursa2");
				break;
				default:
					System.out.println("Nu esti eligibil");	
			}
			break;
			default: 
				System.out.println("Nu esti eligibil");	
		}
		
		
	}

}
