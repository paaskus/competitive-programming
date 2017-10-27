import java.util.*;
import java.io.*;

public class DiceGame {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer input = new StringTokenizer(br.readLine()+" "+br.readLine());
            int p1d1start = Integer.parseInt(input.nextToken());
            int p1d1end = Integer.parseInt(input.nextToken());
            int p1d2start = Integer.parseInt(input.nextToken());
            int p1d2end = Integer.parseInt(input.nextToken());
            int p2d1start = Integer.parseInt(input.nextToken());
            int p2d1end = Integer.parseInt(input.nextToken());
            int p2d2start = Integer.parseInt(input.nextToken());
            int p2d2end = Integer.parseInt(input.nextToken());

            /*
              Formula for finding avg of integer interval [a, a+1, ..., b-1, b]:
              (b^2-a^2)/(2(b-a)),  where a = startOfInterval and b = endOfInterval
            */
            double p1d1avg = ((p1d1end * p1d1end -
                               p1d1start * p1d1start) / (double)
                              (2 * (p1d1end - p1d1start)));
            double p1d2avg = ((p1d2end * p1d2end -
                               p1d2start * p1d2start) / (double)
                              (2 * (p1d2end - p1d2start)));
            double p2d1avg = ((p2d1end * p2d1end -
                               p2d1start * p2d1start) / (double)
                              (2 * (p2d1end - p2d1start)));
            double p2d2avg = ((p2d2end * p2d2end -
                               p2d2start * p2d2start) / (double)
                              (2 * (p2d2end - p2d2start)));
            double p1avg = p1d1avg+p1d2avg;
            double p2avg = p2d1avg+p2d2avg;
       
            if (p1avg > p2avg)
                System.out.println("Gunnar");
            else if (p1avg < p2avg)
                System.out.println("Emma");
            else System.out.println("Tie");
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        
    }
}
