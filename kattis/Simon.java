import java.util.*;

public class Simon {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int argsNum = sc.nextInt(); sc.nextLine();
        String[] ss = {"simon", "says"};
        for (int i = 0; i < argsNum; i++) {
            String[] words = sc.nextLine().split(" ");
            if (words.length < 2) {System.out.println(""); continue;} // ignore
            boolean simon =  words[0].equals(ss[0]);
            boolean says = words[1].equals(ss[1]);
            if (!(simon && says)) {System.out.println(""); continue;} // ignore
            for (int j = 2; j < words.length; j++)
                System.out.println(words[j]); // output
        }
        sc.close();
    }
    
}
