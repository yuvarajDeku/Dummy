package yuvaraj.practice.utube;



public class IgnoreNumInString {

	// Method 1 using forloop

	static String RemString(String str) {
		String result = "";

		for (int i = 0; i < str.length(); i++) {
			if (!Character.isDigit(str.charAt(i))) {

				result = result + str.charAt(i);

			}

		}

		return result;
	}

	// Method2 Regex
	/*
	 * \d matches all digits \s matches spaces \w matches word characters
	 * Alternatively, a capital letter means the opposite:
	 * 
	 * \D matches non-digits \S matches non-spaces \W matches non-word characters
	 */

	static String REMString(String str) {
		return str.replaceAll("\\d", "");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "yuvaraj12loganathan09";
		System.out.println(RemString(str));
		System.out.println();
		System.out.println(REMString(str));
	}

}
