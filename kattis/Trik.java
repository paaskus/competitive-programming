import java.util.*;

public class Trik {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String moves = sc.next();
        sc.close();

        // booleans tell if specific cup contains the ball
        boolean[] cups = {true, false, false};

        // apply moves
        for (int i = 0; i < moves.length(); i++) {
            char move = moves.charAt(i);
            switch (move) {
            case 'A': swap(cups, 0, 1);
                break;
            case 'B': swap(cups, 1, 2);
                break;
            case 'C': swap(cups, 0, 2);
                break;
            }
        }

        // output
        for (int i = 0; i < cups.length; i++) {
            if (cups[i]) {
                System.out.println((i+1));
                break;
            }
        }
    }

    /* swaps cups at index1 and index2 */
    public static void swap(boolean[] cups, int index1, int index2) {
        boolean tmp = cups[index1];
        cups[index1] = cups[index2];
        cups[index2] = tmp;
    }

}
