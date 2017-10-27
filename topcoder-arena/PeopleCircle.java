public class PeopleCircle {
	int totalPeople = 0;
	int shifts = 0;
	int[] circle = new int[0];
	int currentPos = 0;

	public String order(int numMales, int numFemales, int k) {
		String result = "";
		totalPeople = numMales + numFemales;
		circle = new int[totalPeople];
		if (totalPeople > numFemales) {
			for (int f = 0; f < numFemales; f++) {
				shiftAndChange(k);
			}
		}

		String[] arrangement = new String[totalPeople];
		for (int a = 0; a < totalPeople; a++) {
			if (circle[a] == 0) {
				result += "M";
			} else {
				result += "F";
			}
		}
		return result;
	}

	private void shiftAndChange(int numOfShifts) {
		for (int i = 1; i < numOfShifts; i++) {
			do {
				currentPos++;
				if (currentPos >= totalPeople) {
					currentPos = currentPos % totalPeople;
				}
			} while (circle[currentPos] == 1);
		}
		changeValue(currentPos);
	}

	private void changeValue(int index) {
		circle[index] = 1;
		do {
			currentPos++;
			if (currentPos >= totalPeople) {
				currentPos = currentPos % totalPeople;
			}
		} while (circle[currentPos] == 1);
	}
}