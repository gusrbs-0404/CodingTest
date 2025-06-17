package Level6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Class7 {
    public static void main(String[] args) throws IOException {
        // 2869번 달팽이는 올라가고 싶다.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken()); // 낮에 올라가는 높이
        int B = Integer.parseInt(st.nextToken()); // 밤에 미끄러지는 높이
        int V = Integer.parseInt(st.nextToken()); // 나무 막대 높이
        br.close();

        int count = 0;

        while (true) {
            int temp = 0;

            if(V - A <= 0) {
                count++;
                break;
            }

            temp += A - B;
            V -= temp;
            count++;
        }
        System.out.println(count);


        // -----------------------------------------------

//        int day = (V -B) / (A - B);
//
//        // 나머지가 있을 경우
//        if ((V - B) % (A - B) != 0) {
//            day++;
//        }
//        System.out.println(day);


    }
}
