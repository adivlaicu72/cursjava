package curs6;

import java.util.Scanner;

public class Homework_Bonus_Vanzari_Ex_switch {
	/*
	Scriem un program care simuleaza un program de acordat bonusuri.
		Programul primeste input de la utilizator :
			=> Anul de vechime in firma
			=> Valoarea vanzarilor efectuate
			=> Luna in care a efectuat vanzarile
			
		=>	Daca are un an vechime atunci primeste un bonus de 100
		=> 	Daca are 2 ani vechime atunci primeste un bonus de 200
			
			
		=>	Daca are 3 ani vechime si valoarea vanzarilor este mai mica sau egala cu
				5000 atunci primeste bonus 600
			
		=>	Daca are 3 ani si valoarea vanzarilor este mai mica sau egala cu 10000 si
				vanzarile au fost efectuate in oricare din lunile 1-6 primeste bonus 800
			
		=>	Daca are 3 ani si valoarea vanzarilor este mai mica sau egala cu 10000 si
				vanzarile au fost efectuate in oricare din lunile 7-11 primeste bonus 1000
			
		=>	Daca are 3 ani si valoarea vanzarilor este mai mica sau egala cu 10000 si
				vanzarile au fost efectuate in luna 12 primeste bonus 900 si mesajul : “In
				decembrie se vand singure!”
			
		=>	Daca are 3 ani si valoarea vanzarilor este mai mare decat 10000 primeste
				bonus 1200
	 */

	public static void main(String[] args) {
		Scanner an = new Scanner(System.in);
		System.out.println("Te rog introdu numarul de ani de vechime: ");
		int anVechime = an.nextInt();
		an.close();
		
		switch(anVechime) {
		case 1: 
			System.out.println("Primesti un bonus de 100 lei");
			break;
		case 2:
			System.out.println("Primesti un bonus de 200 lei");
			break;
		
		case 3:
			
			Scanner luna = new Scanner(System.in);
			System.out.println("Te rog introdu luna vanzari: ");
			int lunaVanzari = luna.nextInt();
			luna.close();
			Scanner vanzari = new Scanner(System.in);
			System.out.println("Te rog introdu valoare vanzari: ");
			int valoareVanzari = vanzari.nextInt();
			vanzari.close();
			
			if (valoareVanzari <= 5000) {
				System.out.println("Primesti un bonus de 600 lei");
			}
			
			switch(lunaVanzari) {
			case 1:
			case 2:
			case 3:
			case 4:
			case 5:
			case 6:
			if (valoareVanzari <= 10000) {
					System.out.println("Primesti un bonus de 800 lei");
				}
			break;
			case 7:
			case 8:
			case 9:
			case 10:
			case 11:
			if (valoareVanzari <= 10000) {
					System.out.println("Primesti un bonus de 1000 lei");
				}
			break;
			case 12:
			if (valoareVanzari <= 10000) {
					System.out.println("Primesti un bonus de 900 lei");
					System.out.println("In decembrie se vand singure!");
				}
			break;	
		
			default: 	
			if (valoareVanzari > 10000) {
					System.out.println("Primesti un bonus de 1200 lei");


		}
	
		}
	}
}
}

