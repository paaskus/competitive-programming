import java.util.*;

public class GoblinGardenGuards {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double mapSize = 10000;
        int numOfGoblins = sc.nextInt();
        int goblinsLeft = numOfGoblins;
        int[][] arrayGoblins = new int[(int)mapSize+1][(int)mapSize+1];
        for (int i = 0; i < numOfGoblins; i++) {
            int xGoblin = sc.nextInt();
            int yGoblin = sc.nextInt();
            arrayGoblins[xGoblin][yGoblin]++;
        }
        int numOfSprinklers = sc.nextInt();
        for (int i = 0; i < numOfSprinklers; i++) {
            int sprinklerX = sc.nextInt();
            int sprinklerY = sc.nextInt();
            int radius = sc.nextInt();
            int xLeft = ((int) Math.max((sprinklerX - radius), 0));
            int xRight = ((int) Math.min((sprinklerX + radius), mapSize));
            int yLeft = ((int) Math.max((sprinklerY - radius), 0));
            int yRight = ((int) Math.min((sprinklerY + radius), mapSize));

            for (int x = xLeft; x <= xRight; x++) {
                for (int y = yLeft; y <= yRight; y++) {
                    int xDiff = x-sprinklerX;
                    int yDiff = y-sprinklerY;
                    if (xDiff*xDiff + yDiff*yDiff <= radius*radius) {
                        goblinsLeft -= arrayGoblins[x][y];
                        arrayGoblins[x][y] = 0; // goblins hit
                    }
                }
            }
        }
        System.out.println(goblinsLeft);
    }
}
