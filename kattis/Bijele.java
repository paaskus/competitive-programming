import java.util.*;

public class Bijele {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numOfArguments = 6;
        int[] piecesNeeded = {1, 1, 2, 2, 2, 8};
        int piecesFound;
        for (int i = 0; i < numOfArguments; i++) {
            piecesFound = sc.nextInt();
            System.out.print((piecesNeeded[i] - piecesFound)+ " ");
        }
    }
}
