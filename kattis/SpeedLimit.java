import java.util.*;

public class SpeedLimit {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int endOfInput = -1;
        int logSize;
        while ((logSize = sc.nextInt()) != endOfInput) {
            int speed = 0;
            int timeAtSpeed = 0;
            int timeElapsed = 0;
            int timeElapsedPrev = 0;
            int distance = 0;
            for (int i = 0; i < logSize; i++) {
                speed = sc.nextInt();
                timeElapsedPrev = timeElapsed;
                timeElapsed = sc.nextInt();
                timeAtSpeed = timeElapsed - timeElapsedPrev;
                distance += speed * timeAtSpeed;
            }
            System.out.println(distance+" miles");
        }
    }
}
