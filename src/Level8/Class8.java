package Level8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Class8 {
    public static void main(String[] args) throws IOException {
        // 14215 세 막대
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        br.close();

        int max = Math.max(a, Math.max(b, c));
        int sum = a + b + c - max;

        if (sum > max) {
            System.out.println(max + sum);
        } else {
            System.out.println((sum - 1) + sum);
        }
    }
}
