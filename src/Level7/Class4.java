package Level7;

import java.util.Scanner;

public class Class4 {
    public static void main(String[] args) {
        // 1978번 소수 찾기
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int count = 0;
        for (int i = 0; i < N; i++) {
            int isNum = sc.nextInt();
            for (int j = 2; j <= isNum; j++) {
                if (j == isNum) {
                    count++;
                }
                if (isNum % j == 0) {
                    break;
                }
            }
        }
        System.out.println(count);
    }
}
