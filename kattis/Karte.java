import java.util.*;

public class Karte {
    private static int cardsMissingSuitP = 13;
    private static int cardsMissingSuitK = 13;
    private static int cardsMissingSuitH = 13;
    private static int cardsMissingSuitT = 13;
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine(); sc.close();
        int suits = 4; // P, K, H, T
        // 1, 2, ..., 13
        int cardsPerSuit = 13;
        // P = 0; K = 1; H = 2; T = 3;
        boolean[][] cards = new boolean[4][13];
        for (int i = 0; i < input.length(); i += 3) {
            String card = input.substring(i, i+3);
            char suit = card.charAt(0);
            int number = Integer.parseInt(card.substring(1, 3))-1;
            int suitIndex = suitToIndex(suit);
            if (cards[suitIndex][number]) {
                System.out.println("GRESKA");
                return;
            } else {
                cards[suitIndex][number] = true;
            }
        }
        System.out.println(cardsMissingSuitP+" "+
                           cardsMissingSuitK+" "+
                           cardsMissingSuitH+" "+
                           cardsMissingSuitT);
    }

    private static int suitToIndex(char suit) {
        switch (suit) {
        case 'P':
            cardsMissingSuitP--;
            return 0;
        case 'K':
            cardsMissingSuitK--;
            return 1;
        case 'H':
            cardsMissingSuitH--;
            return 2;
        case 'T':
            cardsMissingSuitT--;
            return 3;
        default:
            return -1; // error in input
        }
    }
}
