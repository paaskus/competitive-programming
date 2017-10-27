import java.util.*;

public class Pot {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int argsNum = sc.nextInt(); sc.nextLine();

        long result = 0;
        for (int i = 0; i < argsNum; i++) {
            String s = sc.nextLine();
            int num = Integer.parseInt(s.substring(0, s.length()-1));
            int pow = Integer.parseInt(""+s.charAt(s.length()-1));
            result += power(num, pow);
        }
        sc.close();
        System.out.println(result);
    }

    private static long power(int n, int pow) {
        long result = 1;
        for (int i = 0; i < pow; i++) {
            result = result * n;
        }
        return result;
    }
    
}
