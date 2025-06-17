package Level6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Class6 {
    public static void main(String[] args) throws IOException {
        // 1193번 분수 찾지 @@@
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int X = Integer.parseInt(br.readLine());
        br.close();

        int count = 1;
        int sum = 0;

        while (true) {
            if(X <= sum + count) {
                if(count % 2 == 0) {
                    // 짝수 위로
                    System.out.println((X - sum) + "/" + (count - (X - sum -1)));
                    break;
                } else {
                    // 홀수 아래로
                    System.out.println((count - (X - sum -1)) + "/" + (X - sum));
                    break;
                }
            } else {
                sum += count;
                count++;
            }
        }
    }
}
