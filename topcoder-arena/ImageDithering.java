public class ImageDithering {
	public int count(String dithered, String[] screen) {
		int result = 0;
		
		for (int i = 0; i < screen.length; i++) {
			if (dithered.length() > screen[i].length()) {
				continue;
			} else {
				for (int j = 0; j < screen[i].length(); j++) {
					for (int k = 0; k < dithered.length(); k++) {
						if (screen[i].charAt(j) == dithered.charAt(k)) {
							result++;
						}
					}
				}
			}
		}
		
		return result;
	}
}