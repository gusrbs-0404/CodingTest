package Level11;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Class5 {
    public static void main(String[] args) throws IOException {
        // 10989번 수 정렬하기 3
        // 모든 방법을 풀어도 시간초과가 발생한다.
        // Arrays.sort 을 했을때 출력시키는 부분에서 계속 시간초과가 발생했다.

        // 방법 1 : Arrays.sort
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];

        for(int i = 0; i < N; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(arr);

        for(int i = 0; i < N; i++){
            sb.append(arr[i]).append('\n');
        }

        System.out.println(sb);
    }
}
