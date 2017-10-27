import java.io.*;
import java.util.*;

public class Soylent {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int testCases = Integer.parseInt(br.readLine());
            final int SOYLENT_CALORIES = 400;
            for (int i = 0; i < testCases; i++) {
                int calorieTarget = Integer.parseInt(br.readLine());
                int bottlesToReachTarget = (int) Math.ceil((double) calorieTarget/SOYLENT_CALORIES);
                System.out.println(bottlesToReachTarget);
            }
        } catch (Exception e) {
            // do nothing
        }
    }
}
