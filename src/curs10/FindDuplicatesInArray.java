package curs10;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicatesInArray {

	public static void main(String[] args) {
		
		String[] myStringArray = {"Oana", "Ion", "Bogdan", "Ion", "Maria", "Oana"};
		//							0		1		2		3		4		5
		// index
		// lenght = 6;
		// <=6 --> ArrayIndexOutBoundException
		
		for(int i = 0; i < myStringArray.length; i++) {
			
			for (int j=i+1; j< myStringArray.length; j++) {
				
				if(myStringArray[i].equals(myStringArray[j])) {
					
					System.out.println("Nume duplicat: " +myStringArray[i]);
					
				}
				
			}
			
		}
	}
	
	public static Set<String> gasesteDuplicat(String [] array) {
		
		Set<String> numeDuplicat = new HashSet<>();
		
		return numeDuplicat;
		
	}

}
