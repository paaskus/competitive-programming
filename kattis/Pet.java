import java.util.*;

public class Pet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int contestants = 5;
        int maxRating = 0;
        int winner = 0;
        for (int i = 0; i < contestants; i++) {
            int sum = sc.nextInt() + sc.nextInt() +
                      sc.nextInt() + sc.nextInt();
            if (sum > maxRating) {
                maxRating = sum; winner = (i+1);
            }
        }
        System.out.println(winner+" "+maxRating);
    }
}
