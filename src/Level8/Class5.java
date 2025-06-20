package Level8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Class5 {
    public static void main(String[] args) throws IOException {
        // 9063번 대지
        //
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int[] X = new int[N];
        int[] Y = new int[N];

        for (int i = 0; i < N; i++) {
            StringTokenizer st2 = new StringTokenizer(br.readLine());

            int tempX = Integer.parseInt(st2.nextToken());
            int tempY = Integer.parseInt(st2.nextToken());

            X[i] = tempX;
            Y[i] = tempY;
        }
        br.close();

        Arrays.sort(X);
        Arrays.sort(Y);

        int x = X[N - 1] - X[0];
        int y = Y[N - 1] - Y[0];

        System.out.println(x * y);
    }
}
