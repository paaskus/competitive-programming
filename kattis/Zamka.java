import java.util.*;

public class Zamka {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int min = sc.nextInt();
        int max = sc.nextInt();
        int targetSum = sc.nextInt();
        sc.close();

        // find min num with target digit sum that satisfies boundaries
        int minNumWithTargetDigitSum = -1;
        for (int i = min; i <= max; i++) {
            if (digitSum(i) == targetSum) {
                minNumWithTargetDigitSum = i;
                break;
            }
        }
        // find max num with target digit sum that satisfies boundaries
        int maxNumWithTargetDigitSum = -1;
        for (int i = max; i >= min; i--) {
            if (digitSum(i) == targetSum) {
                maxNumWithTargetDigitSum = i;
                break;
            }
        }
        System.out.println(minNumWithTargetDigitSum);
        System.out.println(maxNumWithTargetDigitSum);
    }

    private static int digitSum(int n) {
        String num = ""+n;
        int sum = 0;
        for (int i = 0; i < num.length(); i++) {
            sum+= Integer.parseInt(""+num.charAt(i));
        }
        return sum;
    }
}
