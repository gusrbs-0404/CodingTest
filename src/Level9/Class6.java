package Level9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Class6 {
    public static void main(String[] args) throws IOException {
        // 24267번 알고르짐의 수행 시간 6

//        MenOfPassion(A[], n) {
//            sum <- 0;
//            for i <- 1 to n - 2
//              for j <- i + 1 to n - 1
//                  for k <- j + 1 to n
//                      sum <- sum + A[i] × A[j] × A[k]; # 코드1
//            return sum;
//        }

        // java로 바꾸면
//        for(int i  = 1; i <= n-2; i++){
//            for(int j = i+1; j <= n-1; j++){
//                for(int k = j+1; k <= n; k++){
//                    count++;
//                }
//            }
//        }

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        long n = Integer.parseInt(br.readLine());
        br.close();

        System.out.println((n*(n-1)*(n-2)/6));
        System.out.println(3);
    }
}
