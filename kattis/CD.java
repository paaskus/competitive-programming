import java.io.*;
import java.util.*;

public class CD {
    public static void main(String[] args) {
        try {
            BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
            while (true) {
                StringTokenizer testCaseInfo = new StringTokenizer(sc.readLine());
                int cdNum1 = Integer.parseInt(testCaseInfo.nextToken());
                int cdNum2 = Integer.parseInt(testCaseInfo.nextToken());
                if (cdNum1 == 0 && cdNum2 == 0) break;
                int[] arr = new int[cdNum1];
                for (int i = 0; i < cdNum1; i++)
                    arr[i] = Integer.parseInt(sc.readLine());
                int matches = 0;
                int i = 0;
                int j = 0;
                int next = 0;
                boolean readNext = cdNum2 > 0;
                while (i < cdNum1 && j < cdNum2) {
                    if (readNext) {
                        next = Integer.parseInt(sc.readLine());
                        readNext = false;
                    }
                    if (arr[i] == next) {
                        matches++;
                        i++;
                        j++;
                        readNext = true;
                    } else if (arr[i] < next) {
                        i++;
                    } else {
                        j++;
                        readNext = true;
                    }
                }
                while (j+1 < cdNum2) {
                    sc.readLine();
                    j++;
                }
                System.out.println(matches);
            }
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}
