public class CCipher {
	
	public String decode(String cipherText, int shift) {
		String result = "";
		for (int i = 0; i < cipherText.length(); i++) {
			char currentChar = cipherText.charAt(i);
			currentChar -= shift;
			if (currentChar < 'A') {
				int difference = (int) 'A' - currentChar;
				currentChar = (char) ('Z' - difference + 1);
			}
			result += currentChar;
		}
		return result;
	}
}