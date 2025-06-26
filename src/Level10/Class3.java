package Level10;

import java.io.*;
import java.util.StringTokenizer;

public class Class3 {
    public static void main(String[] args) throws IOException {
        // 19532 수학은 비대면강의입니다.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());
        int e = Integer.parseInt(st.nextToken());
        int f = Integer.parseInt(st.nextToken());
        br.close();

        // 가감식 공식으로 풀기
        bw.write((c*e- b*f) / (a*e - b*d) + " "); // x축
        bw.write((c*d - a*f) / (b*d - a*e) +""); // y축
        bw.flush();
        bw.close();

    }
}
