import java.util.*;

public class BusNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numOfBuses = sc.nextInt();
        int[] buses = new int[1001];
        /* 
           represent buses as an array, each bus with its own index.
           0/1 value indicates whether the given bus stops here.
        */
        for (int i = 0; i < numOfBuses; i++) {
            buses[sc.nextInt()] = 1; // bus stops here
        }
        ArrayList<Integer> busStreak = new ArrayList<>();

        for (int i = 0; i < buses.length; i++) { // go through array for output
            if (buses[i] == 1) {
                busStreak.add(i);
                if (i == buses.length-1) handleBreakOfStreak(busStreak, i);
            } else {
                handleBreakOfStreak(busStreak, i);
                busStreak.clear();
            }
        }
        System.out.print("\n");
    }

    private static void handleBreakOfStreak(ArrayList<Integer> busStreak, int i) {
        if (busStreak.size() == 0) return;
        if (busStreak.size() <= 2) {
            for (int j = 0; j < busStreak.size(); j++)
                System.out.print(busStreak.get(j)+" ");
        } else {
            System.out.print(busStreak.get(0)+"-"+
                             busStreak.get(busStreak.size()-1)+" ");
        }
    }
}
