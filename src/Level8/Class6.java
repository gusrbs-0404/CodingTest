package Level8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Class6 {
    public static void main(String[] args) throws IOException {
        // 10101 문제 삼각형 외우기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());

        br.close();

        boolean triangle = a + b + c == 180;

        if(triangle) {
            if (isEquilateral(a,b,c)) {
                System.out.println("Equilateral");
            } else if (isIsosceles(a,b,c)) {
                System.out.println("Isosceles");
            } else {
                System.out.println("Scalene");
            }
        } else {
            System.out.println("Error");
        }
    }

    private static boolean isEquilateral(int a, int b, int c) {
        return a == b && b == c;
    }

    private static boolean isIsosceles(int a, int b, int c) {
        return a == b || b == c || c == a;
    }
}
