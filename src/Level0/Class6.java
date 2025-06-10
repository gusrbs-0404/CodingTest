package Level0;

import java.util.Scanner;

public class Class6 {
    public static void main(String[] args) {
        // 오븐시계

        Scanner sc = new Scanner(System.in);

        System.out.print("시간 : ");
        int h = sc.nextInt();

        System.out.print("분 : ");
        int m = sc.nextInt();

        System.out.print("타이머 설정 : ");
        int time = sc.nextInt();

        m += time;

        h += m / 60;
        m %= 60;

        h %= 24;

        System.out.println(h + " " + m);
    }
}
