package Level0;

import java.util.Scanner;

public class Class3 {
    public static void main(String[] args) {
        // 윤년 출력
        Scanner sc = new Scanner(System.in);

        System.out.print("연도 입력 : ");
        int year = sc.nextInt();

        if (year < 1 || year > 4000) {
            System.out.println("연도 잘못 입력");
        } else {
            if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                System.out.println("윤년 O");
            } else {
                System.out.println("윤년 X");
            }
        }
    }
}
