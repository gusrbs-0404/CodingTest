package Level11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Class7 {
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

        // 정렬 x 좌표가 증가하는 순으로
        for (int i = 0; i < N - 1; i++) {
            for (int j = i+1; j < N; j++) {
                if (arr[i][0] > arr[j][0]) {
                    // X
                    int tempX = arr[i][0];
                    arr[i][0] = arr[j][0];
                    arr[j][0] = tempX;
                    // Y
                    int tempY = arr[i][1];
                    arr[i][1] = arr[j][1];
                    arr[j][1] = tempY;
                }
            }
        }

        // X같을때 Y정렬
        for (int i = 0; i < N - 1; i++) {
            for (int j = i+1; j < N; j++) {
                if (arr[i][0] == arr[j][0] && arr[i][1] > arr[j][1]) {
                    // X
                    int tempX = arr[i][0];
                    arr[i][0] = arr[j][0];
                    arr[j][0] = tempX;
                    // Y
                    int tempY = arr[i][1];
                    arr[i][1] = arr[j][1];
                    arr[j][1] = tempY;
                }
            }
        }

        // 출력
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
