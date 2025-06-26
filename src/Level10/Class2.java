package Level10;

import java.util.Scanner;

public class Class2 {
    public static void main(String[] args) {
        // 2231 분해합
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int result = 0;

        for (int i = 1; i < N; i++) {
            int sum = i;
            int m = i;

            // i의 각 자리수를 더함
            while (m > 0) {
                sum += m % 10;
                m /= 10;
            }
            // 분해합이 N과 같으면 가장 작은 생성자를 찾은 것이므로 종료
            if (sum == N) {
                result = i;
                break;
            }
        }

        System.out.println(result);
    }
}
