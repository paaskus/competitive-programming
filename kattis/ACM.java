import java.util.*;

public class ACM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // problem letters map to number of tries on that problem
        HashMap<Character, Integer> problems = new HashMap<>();
        int solvedCount = 0;
        int timePenalty = 0;
        while (sc.hasNext()) {
            int mins = sc.nextInt(); if (mins == -1) break;
            char letter = sc.next().charAt(0);
            boolean solved = sc.next().equals("right");
            if (solved) {
                solvedCount++;
                if (problems.containsKey(letter))
                    timePenalty += mins + problems.get(letter) * 20;
                else timePenalty += mins;
            } else {
                if (problems.containsKey(letter))
                    problems.put(letter, problems.get(letter)+1);
                else problems.put(letter, 1);
            }
        }
        System.out.println(solvedCount+" "+timePenalty);
    }
}
