package Level1;

import java.io.*;

public class Class7 {
    public static void main(String[] args) throws IOException {
        // A + B - 7
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        bw.write("총 개수 입력 : ");
        bw.flush();

        int count = Integer.parseInt(br.readLine());

        for (int i = 0; i < count; i++) {
            bw.write("A 입력하기 : ");
            bw.flush();
            int a = Integer.parseInt(br.readLine());

            bw.write("B 입력하기 : ");
            bw.flush();
            int b = Integer.parseInt(br.readLine());

            int sum = a + b;

            bw.write("Case #" + (i+1) + ": " + sum + "\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
