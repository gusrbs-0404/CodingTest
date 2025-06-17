package Level6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Class5 {
    public static void main(String[] args) throws IOException {
        // 2292번 벌집
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        br.close();

        int temp = 6;
        int count = 1;
        int range = 2;

        while (range <= n) {
            range += count *temp;
            count++;
        }

        System.out.println(count);
    }
}
