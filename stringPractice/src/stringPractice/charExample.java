package stringPractice;

public class charExample {
	public static void main(String[] args) {
		
		String s="GH J123 a123 ( * ) == ! lkl90904 l p";
		int alpha = 0, upper = 0, lower=0, digit=0, alphaNum=0,whiteSpace = 0, special=0;
		for(int i = 0; i <s.length(); i++) {
			char c = s.charAt(i);
			if(Character.isAlphabetic(c)) {
				alpha++;
			}
			if(Character.isUpperCase(c)) {
				upper++;
			}
			if(Character.isLowerCase(c)) {
				lower++;
			}
			if(Character.isDigit(c)) {
				digit++;
			}
			if(Character.isLetterOrDigit(c)) {
				alphaNum++;
			}
			if(Character.isWhitespace(c)) {
				whiteSpace++;
			}
			if(Character.isLetterOrDigit(c)) {
				special++;
			}
		}
		System.out.println("Total alphabet count: "+ alpha);
		System.out.println("Total upper alphabet count: "+ upper);
		System.out.println("Total lower alphabet count: "+ lower);
		System.out.println("Total digit count: "+ digit);
		System.out.println("Total alphabet numeric count: "+ alphaNum);
		System.out.println("Total white space count: "+ whiteSpace);
		System.out.println("Total white spacial count: "+ special);
		
	}
}
