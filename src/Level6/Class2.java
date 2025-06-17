package Level6;

import java.io.*;
import java.util.StringTokenizer;

public class Class2 {
    public static void main(String[] args) throws IOException {
        // 11005번 진법 변환 2
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        // 값입력 받기
        int N = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        br.close();
        
        // 진법 변환
        while (N > 0) {
            long rem = N % B;
            if (rem < 10) {
                sb.append((char) ('0' + rem));
            } else {
                sb.append((char) ('A' + (rem - 10)));
            }
            N /= B;
        }
        
        // 뒤집어서 출력
        System.out.println(sb.reverse());
    }
}
