import java.util.*;

public class Different {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLong()) {
            long n1 = sc.nextLong();
            long n2 = sc.nextLong();

            long result = n1-n2;
            String s = result+"";
            if (s.charAt(0) == '-') { // ensure absolute value
                result = Long.parseLong(s.substring(1, s.length()));
            }
            System.out.println(result);
        }
        sc.close();
    }
}
