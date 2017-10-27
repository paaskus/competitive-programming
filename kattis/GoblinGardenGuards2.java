import java.util.*;
import java.lang.*;

public class GoblinGardenGuards2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double mapSize = 10000;
		int numOfGoblins = sc.nextInt();
		int goblinsLeft = numOfGoblins;
		ArrayList<TreeSet<Goblin>> arrayGoblins = new ArrayList<TreeSet<Goblin>>(((int)mapSize+1));

                // initialize array
                for (int i = 0; i < mapSize+1; i++) {
                    arrayGoblins.add(new TreeSet<Goblin>());
                }
                    
                // insert goblins by their x coordinate
		for (int i = 0; i < numOfGoblins; i++) {
                    // create
                    int goblinX = sc.nextInt();
                    int goblinY = sc.nextInt();
                    Goblin g = new Goblin(goblinX, goblinY);
                    
                    // update sets by y coordinate
                    TreeSet<Goblin> goblinSet = arrayGoblins.get(goblinX);
                    if (goblinSet.contains(g)) {
                        goblinSet.ceiling(g).numOfGoblinsHere++; // increment
                    } else {
                        goblinSet.add(g); // insert
                    }
		}
                
		int numOfSprinklers = sc.nextInt();
		for (int i = 0; i < numOfSprinklers; i++) {
			double sprinklerX = sc.nextInt();
			double sprinklerY = sc.nextInt();
			double radius = sc.nextInt();
			int xLeft = ((int) Math.max((sprinklerX - radius), 0));
			int xRight = ((int) Math.min((sprinklerX + radius), mapSize));
			int yLeft = ((int) Math.max((sprinklerY - radius), 0));
			int yRight = ((int) Math.min((sprinklerY + radius), mapSize));
                        
			for (int x = xLeft; x <= xRight; x++) {
                            TreeSet<Goblin> goblins = arrayGoblins.get(x);
                            Goblin ceilingGoblin = goblins.ceiling(new Goblin(0, yLeft));
                            Goblin floorGoblin = goblins.floor(new Goblin(0, yRight));
                            if (ceilingGoblin == null || floorGoblin == null) continue;
                            while (ceilingGoblin.compareTo(floorGoblin) != 0) {
                                goblinsLeft -= ceilingGoblin.numOfGoblinsHere;
                                goblins.remove(ceilingGoblin);
                                ceilingGoblin = goblins.ceiling(ceilingGoblin);
                            }
                            goblinsLeft -= ceilingGoblin.numOfGoblinsHere;
                        }
                }
                System.out.println(goblinsLeft);
        }

    public static class Goblin implements Comparable<Goblin> {
        public double x;
        public double y;
        public int numOfGoblinsHere = 1;

        public Goblin(double x, double y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public int compareTo(Goblin g) {
            if (g.y < y) return -1;
            if (g.y > y) return 1;
            return 0;
        }
    }
}
