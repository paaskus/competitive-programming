import java.util.*;

public class Cetvrta {
    public static void main(String[] agrs) {
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        int x3 = sc.nextInt();
        int y3 = sc.nextInt();

        int x4 = x1;
        if (x1 == x2) x4 = x3;
        if (x1 == x3) x4 = x2;
        if (x2 == x3) x4 = x1;

        int y4 = y1;
        if (y1 == y2) y4 = y3;
        if (y1 == y3) y4 = y2;
        if (y2 == y3) y4 = y1;

        System.out.printf("%d %d\n", x4, y4);
    }
}
