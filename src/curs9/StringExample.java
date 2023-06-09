package curs9;

public class StringExample {

	public static void main(String[] args) {
	
		char ch = 'a';
		String chStr = Character.toString(ch);
		String chStr2 = String.valueOf(ch);
		
		boolean bol = true;
		String bolStr = Boolean.toString(bol);
		String bolStr2 = String.valueOf(bol);
		
		
		String str = null;
		// System.out.println(Str.toString()); se arunca exceptie
		System.out.println(String.valueOf(str)); // se printeaza null
		

	}

}
