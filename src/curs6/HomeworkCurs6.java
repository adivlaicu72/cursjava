package curs6;

import java.util.Scanner;

public class HomeworkCurs6 {
	/*
	Scriem un program care simuleaza un program de acordat bonusuri.
		Programul primeste input de la utilizator :
			Anul de vechime in firma
			Valoarea vanzarilor efectuate
			Luna in care a efectuat vanzarile
			
			Daca are un an vechime atunci primeste un bonus de 100
			Daca are 2 ani vechime atunci primeste un bonus de 200
			
			
			Daca are 3 ani vechime si valoarea vanzarilor este mai mica sau egala cu
				5000 atunci primeste bonus 600
			
			Daca are 3 ani si valoarea vanzarilor este mai mica sau egala cu 10000 si
				vanzarile au fost efectuate in oricare din lunile 1-6 primeste bonus 800
			
			Daca are 3 ani si valoarea vanzarilor este mai mica sau egala cu 10000 si
				vanzarile au fost efectuate in oricare din lunile 7-11 primeste bonus 1000
			
			Daca are 3 ani si valoarea vanzarilor este mai mica sau egala cu 10000 si
				vanzarile au fost efectuate in luna 12 primeste bonus 900 si mesajul : “In
				decembrie se vand singure!”
			
			Daca are 3 ani si valoarea vanzarilor este mai mare decat 10000 primeste
				bonus 1200
	 */

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Te rog introdu numarul de ani de vechime: ");
		int anVechime = scan.nextInt();
		int bonus;	
		int valoareVanzari = 0;
		int lunaVanzari = 0; 
		
		
		switch(anVechime) {
		case 1: 
			System.out.println("Primesti un bonus de 100 lei");
			break;
		case 2:
			System.out.println("Primesti un bonus de 200 lei");
			break;
		case 3:
			System.out.println("Te rog introdu valoarea vanzarilor: ");
			valoareVanzari = scan.nextInt();
			switch(valoareVanzari) {
			case 4:
				if (valoareVanzari <= 5000) {
					
				}
				System.out.println("Primesti un bonus de 600 lei");
				
//				if (an%4 == 0 && an%100 !=0 || an%400 == 0) {
//					days = 29;
//					
//				} else {
//					days = 28;
//				}
//				break;
//				
//				
//				else if (valoareVanzari <= 10000) {
//						System.out.println("Primesti un bonus de 800 lei");
//						}
				
			
			
				}

			}
	
		}

	}

