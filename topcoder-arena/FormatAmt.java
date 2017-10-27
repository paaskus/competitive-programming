public class FormatAmt {
	
	public String amount(int dollars, int cents) {
		String result = "$";

		if (dollars > 999) {
			String dol = Integer.toString(dollars);

			int index = 0;

			for (int i = dol.length(); i > 0; i--) {
				if ((i - 1) % 3 == 0 && i != 1) {
					result += dol.charAt(index) + ",";
				} else {
					result += dol.charAt(index);
				}
				index++;
			}
		} else if (dollars == 0) {
			result += 0;
		} else {
			result += dollars;
		}

		result += ".";

		if (cents < 10) {
			result += 0;
			result += cents;
		} else {
			result += cents;
		}

		return result;
	}
}