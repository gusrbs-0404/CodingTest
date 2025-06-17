package Level6;

import java.io.*;

public class Class4 {
    public static void main(String[] args) throws IOException {
        // 2903번 중앙 이동 알고리즘
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        br.close();

        int a = (int) (Math.pow(2, n) + 1); // 2 - 3 - 5 - 9
        int b = (int) (Math.pow(a, 2));

        System.out.println(b);
    }
}
