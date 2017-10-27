public class YahtzeeScore {
	
	public int maxPoints(int[] toss) {
		int max = 0;
		for (int i = 1; i <= 6; i++) {
			int sum = 0;
			for (int j = 0; j < toss.length; j++) {
				if (toss[j] == i) {
					sum += i;
				}
			}
			if (sum >= max) {
				max = sum;
			}
		}
		return max;
	}
}