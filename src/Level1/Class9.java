package Level1;

import java.io.*;

public class Class9 {
    public static void main(String[] args) throws IOException {
        // 별찍기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        bw.write("별 N번 줄 입력 : ");
        bw.flush();

        int n = Integer.parseInt(br.readLine());

        for(int i = 1; i <= n; i++) {
            bw.write("*".repeat(i));
            bw.write("\n");
        }

        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= i; j++) {
                bw.write("*");
            }
            bw.write("\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
