package Level1;

import java.util.Scanner;

public class Class4 {
    public static void main(String[] args) {
        // 영수증
        Scanner sc = new Scanner(System.in);
        System.out.print("영수증 총 금액 : ");
        int total = sc.nextInt();

        System.out.print("총 구매한 물건의 종류 : ");
        int n = sc.nextInt();

        int sum = 0;

        for (int i = 0; i < n; i++) {
            System.out.print((i + 1) + "번 물품 가격 : ");
            int money = sc.nextInt();

            System.out.print((i + 1) + "번 물품 개수 : ");
            int count = sc.nextInt();

            sum += money * count;
        }

        if (sum == total) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
