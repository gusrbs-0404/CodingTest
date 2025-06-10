package Level0;

import java.util.Scanner;

public class Class4 {
    public static void main(String[] args) {
        // 사분면 고르기
        Scanner sc = new Scanner(System.in);

        System.out.print("X 좌표 입력 : ");
        int x = sc.nextInt();

        System.out.print("Y 좌표 입력 : ");
        int y = sc.nextInt();

        if (x > 0 && y > 0) 
            System.out.println("제1사분면");
        else if (x < 0 && y > 0) 
            System.out.println("제2사분면");
        else if (x < 0 && y < 0)
            System.out.println("제3사분면");
        else if (x > 0 && y < 0)
            System.out.println("제4사분면");
        
        // switch 문
        int quadrant = 0;

        if (x > 0 && y > 0) 
            quadrant = 1;
        else if (x < 0 && y > 0) 
            quadrant = 2;
        else if (x < 0 && y < 0) 
            quadrant = 3;
        else if (x > 0 && y < 0) 
            quadrant = 4;

        switch (quadrant) {
            case 1:
                System.out.println("제1사분면");
                break;
            case 2:
                System.out.println("제2사분면");
                break;
            case 3:
                System.out.println("제3사분면");
                break;
            case 4:
                System.out.println("제4사분면");
                break;
            default:
                System.out.println("축 위에 위치하거나 원점입니다.");
        }
    }
}
