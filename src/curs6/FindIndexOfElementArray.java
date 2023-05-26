package curs6;

public class FindIndexOfElementArray {
	
	/*
	 *  avem un array si vrem sa aflam indexul unui element
	 *  Ex : index pentru element 8 este 3
	 *  rezolvam cu : 
	 *  
	 *  FOR
	 *  FOR EACH
	 *  WHILE
	 *  DO WHILE
	 */
	static int[] numbers = {3, 5, 7, 8, 9, 2, 12};
	public static void main(String[] args) {
		System.out.println("---FOR");
		rezolvareCuFor(8);
		
	}
	
	public static void rezolvareCuFor(int element) {
		for(int i=0 ; i< numbers.length; i++) {
			if ((numbers[i]) == element ) {
				System.out.println("Index pentru " + element + " este " +i);
			}
		}
	}
	
	

}
