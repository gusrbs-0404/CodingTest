package Level1;

import java.util.Scanner;

public class Class5 {
    public static void main(String[] args) {
        // 코딩은 체육과목 입니다.
        Scanner sc = new Scanner(System.in);
        System.out.println("몇 바이트 입력(4 ~ 1000) : ");
        int x = sc.nextInt();

        if (x >= 4 || x <= 1000) {
            int n = x / 4;
            while (n > 0) {
                System.out.print("long ");
                n--;
            }
            System.out.print("int");
        } else {
            System.out.println("범위 잘목입력!");
        }
    }
}
