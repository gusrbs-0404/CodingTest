package Level10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Class1 {
    public static void main(String[] args) throws IOException {
        // 2798문제 블랙잭

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()); // 3 ~100
        int M = Integer.parseInt(st.nextToken()); // 10 ~ 300,000


        // 랜덤 숫자 뽑기
        int[] arr = new int[N];
        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());  // 카드 값 입력
        }

        // 출력
        System.out.println(Arrays.toString(arr));


        // 세 장을 고르는 3중 반복문
        int best = 0;
        for (int i = 0; i < N - 2; i++) {
            for (int j = i + 1; j < N - 1; j++) {
                for (int k = j + 1; k < N; k++) {
                    int sum = arr[i] + arr[j] + arr[k];

                    if (sum == M) {
                        break;
                    }

                    if (sum < M && sum > best) {
                        best = sum;
                    }
                }
            }
        }

        // 정답 출력
        System.out.println(best);

    }
}
