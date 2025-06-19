package Level7;

import java.util.Scanner;

public class Class6 {
    public static void main(String[] args) {
        // 11653 소인수분해
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        for (int i = 2; i * i <= N; i++) {
            while (N % i == 0) {
                System.out.println(i);
                N /= i;
            }
        }
        if (N != 1) {
            System.out.println(N);
        }
    }
}
