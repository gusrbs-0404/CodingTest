package Level11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Class7_1 {
    public static void main(String[] args) throws IOException {
        // 11650번 좌표 정렬하기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // N개 입력 받기
        int N = Integer.parseInt(br.readLine());

        // X Y 배열 초기화
        int[][] arr = new int[N][2];
        // X Y 좌표 입력 받기
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int X = Integer.parseInt(st.nextToken());
            int Y = Integer.parseInt(st.nextToken());

            // 배열에 값넣기
            arr[i][0] = X;
            arr[i][1] = Y;
        }

        // 람다식 정렬
        Arrays.sort(arr, (e1, e2) -> {
            if(e1[0] == e2[0]) {
                return e1[1] - e2[1];
            } else {
                return e1[0] - e2[0];
            }
        });

        // 출력
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            sb.append(arr[i][0] + " " + arr[i][1]).append('\n');
        }
        System.out.println(sb);
    }
}
