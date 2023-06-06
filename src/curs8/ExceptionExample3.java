package curs8;

public class ExceptionExample3 {

	public static void main(String[] args) {
		
		try {
			
			String nume = null;
			System.out.println(nume.length());
			
		} catch(Exception e) {
			System.out.println("Exception occured");
			
			
		} finally {
			System.out.println("Finnaly block of code");
		}

	} 

}
