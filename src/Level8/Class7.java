package Level8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Class7 {
    public static void main(String[] args) throws IOException {
        // 5073번 삼각형과 세 변
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            if (a == 0 && b == 0 && c == 0) {
                break;
            }

            if (!isTriangle(a, b, c)) {
                System.out.println("Invalid");
            } else if (isEquilateral(a, b, c)) {
                System.out.println("Equilateral");
            } else if (isIsosceles(a, b, c)) {
                System.out.println("Isosceles");
            } else {
                System.out.println("Scalene");
            }
        }

        br.close();
    }

    private static boolean isTriangle(int a, int b, int c) {
        int max = Math.max(a, Math.max(b, c));
        int sum = (a + b + c) - max;

        return max < sum;
    }

    private static boolean isEquilateral(int a, int b, int c) {
        return a == b && b == c;
    }

    private static boolean isIsosceles(int a, int b, int c) {
        return a == b || b == c || c == a;
    }
}
