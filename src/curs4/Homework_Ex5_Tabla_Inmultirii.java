package curs4;
import java.util.Scanner;

public class Homework_Ex5_Tabla_Inmultirii {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Please a number: ");
		int n = scan.nextInt();
		scan.close();
		
		for(int i=0; i<10; i+=1) {
			System.out.println(n + " * " + (i+1) + " = " + (n * (i+1)));
		}	

	}

}
