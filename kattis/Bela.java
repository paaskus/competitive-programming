import java.util.*;

public class Bela {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hands = sc.nextInt();
        char dominantSuit = sc.next().charAt(0);

        int points = 0;
        for (int i = 0; i < 4*hands; i++) {
            String card = sc.next();
            char number = card.charAt(0);
            char suit = card.charAt(1);
            switch (number) {
            case 'A':
                points += (suit == dominantSuit) ? 11 : 11;
                break;
            case 'K':
                points += (suit == dominantSuit) ?  4 :  4;
                break;
            case 'Q':
                points += (suit == dominantSuit) ?  3 :  3;
                break;
            case 'J':
                points += (suit == dominantSuit) ? 20 :  2;
                break;
            case 'T':
                points += (suit == dominantSuit) ? 10 : 10;
                break;
            case '9':
                points += (suit == dominantSuit) ? 14 :  0;
                break;
            case '8':
                points += (suit == dominantSuit) ?  0 :  0;
                break;
            case '7':
                points += (suit == dominantSuit) ?  0 :  0;
                break;
            }
        }
        System.out.println(points);
    }
}
