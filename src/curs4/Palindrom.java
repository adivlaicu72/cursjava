package curs4;

public class Palindrom {

	public static void main(String[] args) {
		
		//radar
		checkPalindrom("radar");
	}
	
	//radar
	//01234
	//cuvant2 = "
	//"" = "" + r
	//"cuvant2 = "r"
	//"r" = "r" + "a"
	//"r" = "ra"
	//"ra " = "ra" + d
	
	
	public static void checkPalindrom(String cuvant) {
		String cuvant2 = "";
		
		for (int i=cuvant.length()-1; i>=0; i--) {
			
//			cuvant2 += cuvant.charAt(i);
			cuvant2 = cuvant2 + cuvant.charAt(i);
			
			String result =cuvant2.equals(cuvant) ? "Este palindrom" : "Nu este palindrom";
			System.out.println(result);
		}
		
	}
}
