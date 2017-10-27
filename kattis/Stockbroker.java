import java.util.Scanner;
import java.io.*;

public class Stockbroker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int days = sc.nextInt();
        long money = 100;
        final int MAX_STOCKS = 100000;
        int prevPrice = Integer.MAX_VALUE;
        for (int i = 0; i < days; i++) {
            int price = sc.nextInt();
            if (prevPrice < price) {
                money += (Math.min(MAX_STOCKS, Math.floor(money/prevPrice))*(price-prevPrice));
            }
            prevPrice = price;
        }
        System.out.println(money);
    }
}
