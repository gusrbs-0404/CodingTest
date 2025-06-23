package Level9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Class4 {
    public static void main(String[] args) throws IOException {
        // 24265번 알고르짐의 수행 시간 4

//        MenOfPassion(A[], n) {
//            sum <- 0;
//            for i <- 1 to n - 1
//              for j <- i + 1 to n
//                   sum <- sum + A[i] × A[j]; # 코드1
//            return sum;
//        }
        // java로 바꾸면
//        for(int i = 1; i <= n-1; i++){
//            for(int j = i+1;  j <= n; j++){
//                count++;
//            }
//        }

        // i 1부터 n-1 / j sms i+1부터 n
        // n=7 이라고하면
        // i = 1 / j = 2,3,4,5,6,7 = 6번
        // i = 2 / j = 3,4,5,6,7 => 5번
        // i = 3 / j = 4,5,6,7 => 4번
        // 이런식으로 진행됨
        // 즉, 1 ~ n까지 합을 구하는 공식은 n(n+1)/2의 공식 활용

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        long n = Integer.parseInt(br.readLine());
        br.close();

        System.out.println(n*(n-1)/2);
        System.out.println(2);
    }
}
