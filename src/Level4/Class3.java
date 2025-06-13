package Level4;

import java.util.Scanner;

public class Class3 {
    public static void main(String[] args) {
        // 별 찍기 -7
        Scanner sc = new Scanner(System.in);

        System.out.print("별 : ");
        int N = sc.nextInt();

        // 증가 부분
        for (int i = 1; i <= N; i++) {
            // 공백
            for (int j = 0; j < N - i; j++) {
                System.out.print(" ");
            }
            // 별
            for (int j = 0; j < 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // 감소 부분
        for (int i = N - 1; i >= 1; i--) {
            // 공백
            for (int j = 0; j < N - i; j++) {
                System.out.print(" ");
            }
            // 별
            for (int j = 0; j < 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
