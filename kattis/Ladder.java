import java.util.*;

public class Ladder {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int v = sc.nextInt();
        sc.close();

        double heightOfLadder = Math.PI/180*v;
        heightOfLadder = Math.sin(heightOfLadder);
        heightOfLadder = h/heightOfLadder;
        heightOfLadder = Math.ceil(heightOfLadder);
        System.out.println((int)heightOfLadder);
    }
    
}
