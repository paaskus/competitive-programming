import java.util.*;

public class Conundrum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next(); sc.close();
        String per = "PER";
        int numOfDays = 0;
        for (int i = 0; i < input.length(); ++i) {
            if (input.charAt(i) != per.charAt(i%3)) {
                ++numOfDays;
            }
        }
        System.out.println(numOfDays);
    }
}
