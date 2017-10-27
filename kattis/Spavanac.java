import java.util.*;

public class Spavanac {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int m = sc.nextInt();
        sc.close();
        if (m < 45) {
            h = (h-1 < 0) ? 23 : h-1;
            m = m + 15; // m + 60 - 45
        } else {
            m -= 45;
        }
        System.out.println(h + " " + m);
    }

    
}
