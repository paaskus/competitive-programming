public class TurretDefense {
    public int firstMiss(int[] xs, int[] ys, int[] times) {
        int[] currentAim = new int[2]; currentAim[0] = currentAim[1] = 0;
        int timeToBeat = 0;
        int timeUsed = 0;
        int timeNeeded = 0;
        int timeAvailable = 0;
        
        for (int i = 0; i < times.length; i++) {
            timeToBeat = times[i];
            timeAvailable = timeToBeat - timeUsed;
            int xDiff = Math.abs(currentAim[0] - xs[i]);
            int yDiff = Math.abs(currentAim[1] - ys[i]);
            timeNeeded = xDiff + yDiff;
            
            if (timeNeeded <= timeAvailable) {
                currentAim[0] = xs[i];
                currentAim[1] = ys[i];
                timeUsed = timeToBeat;
            } else {
                return i;
            }
        }
        
        return -1;
    }
}