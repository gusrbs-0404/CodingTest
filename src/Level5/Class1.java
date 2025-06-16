package Level5;

import java.util.Random;
import java.util.Scanner;

public class Class1 {
    public static void main(String[] args) {
        // 행렬 덧셈
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        System.out.print("N 입력: ");
        int n = sc.nextInt();

        System.out.print("M 입력: ");
        int m = sc.nextInt();

        int a[ ][ ] = new int[n][m];
        int b[ ][ ] = new int[n][m];
        int sum[ ][ ] = new int[n][m];

        // a,b  2차원 배열에 숫자 넣기
        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                a[i][j] = rand.nextInt(100) + 1;
                b[i][j] = rand.nextInt(100) + 1;
            }
        }

        // 더하기
        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                sum[i][j] = a[i][j] + b[i][j];
            }
        }

        // 출력 a
        System.out.println("a : 2차원배열");
        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        // 출력 b
        System.out.println("b : 2차원배열");
        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                System.out.print(b[i][j] + " ");
            }
            System.out.println();
        }
        // 출력 sum
        System.out.println("sum : 2차원배열");
        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }
    }
}
