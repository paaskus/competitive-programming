import java.util.Scanner;

public class Kemija08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();
        int length = sentence.length();
        sc.close();
        String result = "";
        for (int i = 0; i < length; i++) {
            char c1 = sentence.charAt(i);
            char c2 = (i+1 < length) ? sentence.charAt(i+1) : '_';
            char c3 = (i+2 < length) ? sentence.charAt(i+2) : '_';
            if (c2 == 'p' && c1 == c3 &&
                (c1 == 'a' ||
                 c1 == 'e' ||
                 c1 == 'i' ||
                 c1 == 'o' ||
                 c1 == 'u')) {
                result += c1;
                i += 2;
            } else {
                result += c1;
            }
        }
        System.out.println(result);
    }
}
