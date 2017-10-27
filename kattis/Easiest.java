import java.util.*;

public class Easiest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // read input
        while (sc.hasNextInt()) {
            // lowest initial value
            int p = 11;
            
            int nextInt = sc.nextInt();
            if (nextInt == 0) break; // end of input
            int inputDigitSum = sumOfDigits(nextInt);
            while (sumOfDigits(nextInt * p) != sumOfDigits(nextInt)) {
                p++;
            }
            System.out.println(p);
        }
    }

    private static int sumOfDigits(int n) {
        String intString = ""+n;
        int sum = 0;
        for (int i = 0; i < intString.length(); i++) {
            sum += Integer.parseInt(intString.charAt(i)+"");
        }
        return sum;
    }
}
