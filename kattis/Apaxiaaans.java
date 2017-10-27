import java.util.*;

public class Apaxiaaans {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine(); sc.close();
        char currChar = '-';
        String resultName = "";
        for (int i = 0; i < name.length(); i++) {
            char c = name.charAt(i);
            if (c == currChar)
                continue;
            else resultName += c;
            currChar = c;
        }
        System.out.println(resultName);
    }
}
