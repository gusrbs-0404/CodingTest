package Level10;

import java.util.Scanner;

public class Class6 {
    public static void main(String[] args) {
        // 2839번 설탕 배달
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        for(int i=0; i<=N/3; i++) {
            for(int j = 0; j<=N/5; j++) {
                if( i*3 + j* 5 == N) {
                    System.out.println(i+j);
                    return;
                }
            }
        }
        System.out.println("-1");
    }
}
