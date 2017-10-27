public class DivisorDigits {
	
	public int howMany(int number) {
		int result = 0;
		
		String n = Integer.toString(number);
		
		for (int i = 0; i < n.length(); i++) {
			int currentNum = Integer.parseInt("" + n.charAt(i));
			if (currentNum != 0 && number % currentNum == 0) {
				result++;
			}
		}
		return result;
	}
}