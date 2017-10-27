import java.util.*;

public class Modulo {
    // Test how many of the 10 input nums are distinct after mod 42
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int argsNum = 10;
        int[] mods = new int[argsNum];
        int distinctCount = argsNum;
        for (int i = 0; i < argsNum; ++i) {
            int num = sc.nextInt();
            int numMod42 = num % 42;
            boolean distinct = true;
            for (int j = 0; j < i; ++j) {
                if (mods[j] == numMod42) {
                    distinct = false;
                    --distinctCount;
                    break;
                }
            }
            mods[i] = (distinct) ? numMod42 : 42;
        }
        System.out.println(distinctCount);
    }
    
}
