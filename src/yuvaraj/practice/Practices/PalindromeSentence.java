package yuvaraj.practice.Practices;

public class PalindromeSentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		 String yuvi="Hannah is a tenet to loganathan have racecar and mom at home";
		String[] word=yuvi.split(" ");
		for(String word1: word) {
			if(isPalindrome(word1)) {
				System.out.println(word1 +" is a Palindrome");
			}
		}
	}

	private static boolean isPalindrome(String word) {
		// TODO Auto-generated method stub
		
		int i1=0;
		int i2=word.length()-1;
		
		while(i2>i1) {
			if(word.charAt(i2) ==word.charAt(i1)) {
				return true;
			}//i1++;
			//i2--;
			i1++;
			i2--;
		}
		return false;
	}

}
