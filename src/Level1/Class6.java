package Level1;

import java.io.*;
import java.util.StringTokenizer;

public class Class6 {
    public static void main(String[] args) throws IOException {
        // 빠른 A + B
        // Scanner X
        // BufferedReader, BufferedWriter 사용

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        bw.write("총 개수 입력 : ");
        bw.flush();

        int count = Integer.parseInt(br.readLine());

        for (int i = 0; i < count; i++) {
            bw.write("A  B 입력하기 : ");
            bw.flush();

            StringTokenizer st = new StringTokenizer(br.readLine());

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int sum = a + b;

            bw.write("합 : " + sum + "\n");
        }

        bw.flush();

        br.close();
        bw.close();
    }
}
