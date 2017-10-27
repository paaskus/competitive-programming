import java.util.*;

public class TwoStones {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numOfStones = sc.nextInt();
        sc.close();

        if (numOfStones % 2 == 0) System.out.println("Bob");
        else System.out.println("Alice");
    }

}
                       
