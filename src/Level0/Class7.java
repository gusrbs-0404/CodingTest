package Level0;

import java.util.Random;

public class Class7 {
    public static void main(String[] args) {
        Random rand = new Random();

        int a = rand.nextInt(6) + 1;
        int b = rand.nextInt(6) + 1;
        int c = rand.nextInt(6) + 1;

        int money = 0;

        if (a == b && a == c) {
            money = 10000 + (a * 1000);
        } else if (a == b || b == c || c == a) {
            int same = 0;

            if (a == b) {
                same = a;
            } else if (b == c) {
                same = b;
            } else {
                same = c;
            }
            money = 1000 + (same * 100);
        } else {
            int max = a;

            if (b > max) {
                max = b;
            }
            if (c > max) {
                max = c;
            }
            money = max * 100;
        }

        System.out.println("1번 주사위 : " + a);
        System.out.println("2번 주사위 : " + b);
        System.out.println("3번 주사위 : " + c);
        System.out.println("상급 : " + money + "원");

    }
}
