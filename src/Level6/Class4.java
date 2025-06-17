package Level6;

import java.io.*;

public class Class4 {
    public static void main(String[] args) throws IOException {
        // 2903번 중앙 이동 알고리즘
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        br.close();

//        int A = 1;
//        for (int i = 0; i < n; i++) {
//            A *= 2;      // 2를 n번 곱함
//        }
//
//        int B = A + 1;
//        System.out.println(B * B);
        // -------------------------------------

        int a = (int) (Math.pow(2, n) + 1); // 2 - 3 - 5 - 9
        int b = (int) (Math.pow(a, 2));

        System.out.println(b);
    }
}
