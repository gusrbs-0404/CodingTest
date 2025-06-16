package Level5;

import java.util.Scanner;

public class Class4 {
    public static void main(String[] args) {
        // 색종이
        Scanner sc = new Scanner(System.in);

        boolean arr[ ][ ] = new boolean[100][100];
        int total = 0;

        System.out.print("사각형 개수 : ");
        int n = sc.nextInt();

        int count = 1;
        while (n > 0) {
            // 값 입력
            System.out.println(count + " 번 사각형");
            System.out.print("가로 : ");
            int x = sc.nextInt();
            System.out.print("세로 : ");
            int y = sc.nextInt();

            // 예외
            if (x < 0 || y < 0 || x > 90 || y > 90) {
                System.out.println("범위 초과");
                continue;
            }

            // 사각형 넓이 체크
            for(int i = x; i < x+10; i++) {
                for(int j = y; j < y+10; j++) {
                    if(!arr[i][j]) {
                        arr[i][j] = true;
                        total++;
                    }
                }
            }

            count++;
            n--;
        }
        System.out.println("사각형 넓이 : " + total);
    }
}
