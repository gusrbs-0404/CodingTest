package Level8;

import java.util.Scanner;

public class Class1 {
    public static void main(String[] args) {
        // 27323번 직사각형
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();

        boolean checkA = A >= 1 && A <= 100;
        boolean checkB = B >= 1 && B <= 100;

        if (checkA && checkB) {
            System.out.println(A*B);
        } else {
            System.out.println("범위 잘못 입력");
        }
    }
}
