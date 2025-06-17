package Level6;

import java.io.*;

public class Class3 {
    public static void main(String[] args) throws IOException {
        // 2720번 세탁소 사장 동혁
        BufferedReader  br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter  bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 테스트 케이스 개수
        int T = Integer.parseInt(br.readLine());

        int quarter = 0;
        int dime = 0;
        int nickel = 0;
        int penny = 0;

        while (T-- > 0) {
            // 거스름돈
            int C = Integer.parseInt(br.readLine());

            // 25센트(¼달러)
            quarter = C / 25;
            C %= 25;
            // 10센트(⅒달러)
            dime    = C / 10;
            C %= 10;
            // 5센트(1/20달러)
            nickel  = C / 5;
            C %= 5;
            // 1센트
            penny   = C;

            System.out.println(quarter + " " + dime + " " + nickel + " " + penny);
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
