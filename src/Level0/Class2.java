package Level0;

import java.util.Scanner;

public class Class2 {
    public static void main(String[] args) {
        // 시험 성적
        Scanner sc = new Scanner(System.in);

        System.out.print("시험 점수 : ");
        int score = sc.nextInt();
        
        if (score >= 90 && score <= 100) {
            System.out.println("A");
        } else if (score >= 80 && score < 90) {
            System.out.println("B");
        } else if (score >= 70 && score < 80) {
            System.out.println("C");
        } else if (score >= 60 && score < 70) {
            System.out.println("D");
        } else if (score >= 0 && score < 60) {
            System.out.println("F");
        } else {
            System.out.println("점수 잘못 입력");
        }


        // switch
        switch (score / 10) {
            case 10:
            case 9:
                System.out.println("A");
                break;
            case 8:
                System.out.println("B");
                break;
            case 7:
                System.out.println("C");
                break;
            case 6:
                System.out.println("D");
                break;
            case 5: case 4: case 3: case 2: case 1: case 0:
                System.out.println("F");
                break;
            default:
                System.out.println("점수 잘못 입력");
        }
    }
}
