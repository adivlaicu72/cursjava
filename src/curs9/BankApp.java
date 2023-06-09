package curs9;

import java.util.Scanner;

/*
 * Simulam un ATM
 * Informam userul operatiunile disponibile sub forma:
 * 1. Depozit
 * 2. WithDraw
 * 3. CheckBalance
 * 
 * Il intrebam ce operatiune vrea sa faca (1,2 sau 3)
 * si procesam operatiunea:
 * (Depozit inseamna balanta + suma depusa)
 * (Withdraw inseamna balanta - suma retrasa)
 * (Check balance - print balanta)
 * Daca incearca sa depuna mai putin sau egal cu 0 aruncam InvalidAmountException;
 * Daca incearca sa retraga mai mult decat balanta arunca InsufficientFundException;
 * Daca introduce alta operatiune printam operatiune invalida;
 * La finalul fiecarei operatiune il intrebam daca vrea sa continue
 * 
 * Plecam cu o balanta zero
 */


public class BankApp {

	public static void main(String[] args) {
		BankApp bank = new BankApp();
		bank.printeazaOperatiuni();
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the desired operation: ");
		int action = scan.nextInt();
		
		

	}
	
	
	public void printeazaOperatiuni() {
		System.out.println("Hi, Available operations are: ");
		System.out.println("1 Deposit");
		System.out.println("2 Withdraw");
		System.out.println("3 Check Balance");
	}

}
