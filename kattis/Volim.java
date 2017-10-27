import java.util.*;

public class Volim {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int playerInTurn = sc.nextInt();
        int questionsAsked = sc.nextInt();
        int totalTimePassed = 0;
        for (int i = 0; i < questionsAsked; i++) {
            totalTimePassed += sc.nextInt();
            if (totalTimePassed > 3*60 + 30) { // explosion
                System.out.println(playerInTurn);
                return;
            }
            boolean correctAnswer = sc.next().charAt(0) == 'T';
            if (correctAnswer) {
                if (playerInTurn == 8)
                    playerInTurn = 1;
                else playerInTurn++;                    
            }
        }
    }
}
