import java.util.*;

public class T9Spelling {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int argsNum = sc.nextInt(); sc.nextLine();

        for (int i = 0; i < argsNum; i++) {
            System.out.print("Case #"+(i+1)+": "); // case prefix
            String sentence = sc.nextLine();
            char prevChar = '-';
            for (int j = 0; j < sentence.length(); j++) {
                char c = sentence.charAt(j);

                // handle pause
                if ((""+charToT9(c)).charAt(0) == (""+charToT9(prevChar)).charAt(0))
                    System.out.print(" "); // pause cuz same button
                prevChar = c;
                // -----------
                
                System.out.print(charToT9(c));
            }
            System.out.print("\n");
        }
        
    }

    private static int charToT9(char c) {
        switch (c) {
        case 'a':
            return 2;
        case 'b':
            return 22;
        case 'c':
            return 222;
        case 'd':
            return 3;
        case 'e':
            return 33;
        case 'f':
            return 333;
        case 'g':
            return 4;
        case 'h':
            return 44;
        case 'i':
            return 444;
        case 'j':
            return 5;
        case 'k':
            return 55;
        case 'l':
            return 555;
        case 'm':
            return 6;
        case 'n':
            return 66;
        case 'o':
            return 666;
        case 'p':
            return 7;
        case 'q':
            return 77;
        case 'r':
            return 777;
        case 's':
            return 7777;
        case 't':
            return 8;
        case 'u':
            return 88;
        case 'v':
            return 888;
        case 'w':
            return 9;
        case 'x':
            return 99;
        case 'y':
            return 999;
        case 'z':
            return 9999;
        case ' ':
            return 0;
        default:
            return 1;
        }
    }
    
}
