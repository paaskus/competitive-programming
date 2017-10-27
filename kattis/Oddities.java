import java.util.*;

public class Oddities {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inputLength = sc.nextInt();
        int numToCheck;
        for (int i = 0; i < inputLength; i++) {
            numToCheck = sc.nextInt();
            String result = (numToCheck % 2 == 0) ? " is even" : " is odd";
            System.out.println((numToCheck + result));
        }
    }
}
