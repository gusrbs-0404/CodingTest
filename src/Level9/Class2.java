package Level9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Class2 {
    public static void main(String[] args) throws IOException {
        // 24263번 알고리즘의 수행 시간 2

        // MenOfPassion  알고리즘
//        MenOfPassion(A[], n) {
//            sum <- 0;
//            for i <- 1 to n
//            sum <- sum + A[i]; # 코드1
//            return sum;
//        }

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        br.close();

        System.out.println(n);
        System.out.println(1);
    }
}
