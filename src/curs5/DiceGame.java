package curs5;

import java.util.Scanner;

public class DiceGame {
	
	/*
	 * Facem un joc de zaruri care are urmatoarele reguli:
	 * daca userul da in total: 2, 6, 12 pierde jocul > ne oprim
	 * daca userul da in total: 3, 7 > castiga jocul > ne oprim
	 * daca userul da in total: 4, 11, 8 > repeta automat aruncarea
	 * daca da oricare dintre variantele care nu au fost enumerate mai sus
	 * atunci il intrebam daca vrea sa mai joace
	 * Raspunsul va fi un boolean: true sau false
	 */

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int dice1;
		int dice2;
		boolean startJoc = true;
		dice1 = (int) Math.random()*6+1;
		dice2 = (int) Math.random()*6+1;
		int total = dice1 + dice2;
		System.out.println("Ai dat :" + total);
		
		

		while((total == 4 || total == 8 ||total == 11) && startJoc) {
			
		}
	}

}
