package Level9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Class3 {
    public static void main(String[] args) throws IOException {
        // 24264번 알고르짐의 수행 시간 3

        // MenOfPassion  알고리즘
        // 이중 반복문
//        MenOfPassion(A[], n) {
//            sum <- 0;
//            for i <- 1 to n
//              for j <- 1 to n
//                  sum <- sum + A[i] × A[j]; # 코드1
//            return sum;
//        }
        // java로 바꾸면
//        for(int i = 1; i <= n; i++){
//            for(int j = 1;  j <= n; j++){
//                count++;
//            }
//        }

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        long n = Integer.parseInt(br.readLine());
        br.close();

        System.out.println(n*n);
        System.out.println(2);


    }
}
