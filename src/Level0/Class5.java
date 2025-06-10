package Level0;

import java.util.Scanner;

public class Class5 {
    public static void main(String[] args) {
        // 알람 시계
        Scanner sc = new Scanner(System.in);
        
        System.out.print("시간 : ");
        int h = sc.nextInt();

        System.out.print("분 : ");
        int m = sc.nextInt();

        if (m < 45) {
            m += 60;
            h -= 1;
            if (h < 0) {
                h = 23;
            }
        }
        m -= 45;

        System.out.println(h + "시 " + m + "분");
    }
}
