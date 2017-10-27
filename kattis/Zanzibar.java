import java.util.*;

public class Zanzibar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        for (int i = 0; i < testCases; i++) {
            int naturalPopulationMax = 1;
            int actualPopulation = -1; // dummy value
            int imported = 0;
            while ((actualPopulation = sc.nextInt()) != 0) {
                if (naturalPopulationMax < actualPopulation)
                    imported += actualPopulation - naturalPopulationMax;
                naturalPopulationMax = actualPopulation * 2;
            }
            System.out.println(imported);
        }
    }
}
