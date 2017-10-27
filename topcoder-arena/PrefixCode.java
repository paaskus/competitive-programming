public class PrefixCode {
	
	public String isOne(String[] words) {
		int prefixIndex = words.length;
		boolean isPrefixCode = true;
		for (int i = 0; i < words.length; i++) {
			String currentWord = words[i];
			int currentWordLength = currentWord.length();
			for (int j = 0; j < words.length; j++) {
				if (j == i) {
					continue;
				} else {
					if (currentWordLength <= words[j].length() &&
						currentWord.equals(words[j].substring(0, currentWordLength))) {
						isPrefixCode = false;
						if (i < prefixIndex) {
							prefixIndex = i;
						}
					}
				}
			}
		}
		if (isPrefixCode) {
			return "Yes";
		} else {
			return ("No, " + prefixIndex);
		}
	}
}