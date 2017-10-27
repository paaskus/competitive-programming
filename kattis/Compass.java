import java.util.*;

public class Compass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int currentDirection = sc.nextInt();
        int targetDirection = sc.nextInt();
        int difference = currentDirection - targetDirection;
        int absDifference = Math.abs(difference);
        if (absDifference == 0 || absDifference == 180) { // trivial case
            System.out.println(absDifference); return;
        }
        int result = 0;
        if (difference > 0)
            if (absDifference > 180)
                result = 360-currentDirection+targetDirection;
            else
                result = -difference;
        else
            if (absDifference > 180)
                result = targetDirection-360-currentDirection;
            else
                result = absDifference;
        System.out.println(result);
    }
}
