package Level9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Class5 {
    public static void main(String[] args) throws IOException {
        // 24266번 알고르짐의 수행 시간 5

//        MenOfPassion(A[], n) {
//            sum <- 0;
//            for i <- 1 to n
//              for j <- 1 to n
//                  for k <- 1 to n
//                      sum <- sum + A[i] × A[j] × A[k]; # 코드1
//            return sum;
//        }
        // java로 바꾸면
//        for(int i  = 1; i <= n; i++){
//            for(int j = 1; j <= n; j++){
//                for(int k = 1; k <= n; k++){
//                    count++;
//                }
//            }
//        }

        // 3중 for문
        // 실행 횟수 니깐 세제곱임

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        long n = Integer.parseInt(br.readLine());
        br.close();

        System.out.println(n*n*n);
        System.out.println(3);
    }
}
