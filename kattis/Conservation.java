import java.util.*;
import java.io.*;

public class Conservation {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(InputStreamReader(System.in));
            int testCases = Integer.parseInt(br.readLine());
            for (int i = 0; i < testCases; i++) {
                StringTokenizer nm = new StringTokenizer(br.readLine());
                int conservationStages = Integer.parseInt(nm.nextToken());
                int dependencies = Integer.parseInt(nm.nextToken());
            }
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}
