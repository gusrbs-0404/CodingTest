package Level11;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Class3 {
    public static void main(String[] args) throws IOException {
        // 25305번 커트라인

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());


        // 점수 입력 받기
        int[] arr = new int[N];

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++) { // 점수 N개 받기
            arr[i] = Integer.parseInt(st.nextToken());
        }
        br.close();

        // 정렬하기
        Arrays.sort(arr);

        // 출력
        bw.write(arr[N-k]);
        bw.flush();
        bw.close();
    }
}
