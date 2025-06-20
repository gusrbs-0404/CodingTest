package Level8;

import java.util.Scanner;

public class Class3 {
    public static void main(String[] args) {
        // 3009번 네번째 점
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt(); // x
        int b = sc.nextInt(); // y

        int c = sc.nextInt(); // x
        int d = sc.nextInt(); // y

        int e = sc.nextInt(); // x
        int f = sc.nextInt(); // y

        int x;
        int y;

        if (a == c) {
            x = e;
        } else if (a == e) {
            x = c;
        } else {
            x = a;
        }

        if (b == d) {
            y = f;
        } else if (b == f) {
            y = d;
        } else {
            y = b;
        }

        System.out.println(x + " " + y);
    }
}
