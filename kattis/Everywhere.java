import java.util.*;

public class Everywhere {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testcaseNum = sc.nextInt();
        
        for (int i = 0; i < testcaseNum; i++) {
            ArrayList<String> uniqueCities = new ArrayList<>();
            int citiesNum = sc.nextInt();
            for (int j = 0; j < citiesNum; j++) {
                String cityName = sc.next();
                boolean unique = true;
                for (int k = 0; k < uniqueCities.size(); k++) {
                    if (cityName.equals(uniqueCities.get(k))) {
                        unique = false; break;
                    }
                }
                if (unique) uniqueCities.add(cityName);
            }
            System.out.println(uniqueCities.size());
        }
    }
}
