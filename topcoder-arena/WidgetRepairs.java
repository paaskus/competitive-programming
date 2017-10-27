public class WidgetRepairs {
	
	public int days(int[] arrivals, int numPerDay) {
		int currentDay = 0;
		int backlog = 0;
		int activeDays = 0;
		for (int i = 0; i < arrivals.length; i++) {
			currentDay = arrivals[i];
			backlog += currentDay;
			if (backlog > 0) {
				if (backlog <= numPerDay) {
					backlog = 0;
				} else if (i != arrivals.length - 1) {
					backlog -= numPerDay;
				} else {
					while (backlog > 0) {
						backlog -= numPerDay;
						activeDays++;
					}
					continue;
				}
				activeDays++;
			} else {
				continue;
			}
		}
		return activeDays;
	}
}