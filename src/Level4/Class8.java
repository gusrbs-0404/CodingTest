package Level4;

import java.util.Scanner;

public class Class8 {
    public static void main(String[] args) {
        // 너의 평점은
        Scanner sc = new Scanner(System.in);

        double totalScore = 0.0;   // (학점 × 평점)
        double totalCredits = 0.0; // (학점, P 과목 제외)

        for (int i = 0; i < 20; i++) {
            System.out.print("학점 : ");
            double  score = sc.nextDouble();
            System.out.print("등급 : ");
            String grade = sc.next();

            // P는 패스
            if(grade.equals("P")) {
                continue;
            }

            double value;
            switch (grade) {
                case "A+": value = 4.5; break;
                case "A0": value = 4.0; break;
                case "B+": value = 3.5; break;
                case "B0": value = 3.0; break;
                case "C+": value = 2.5; break;
                case "C0": value = 2.0; break;
                case "D+": value = 1.5; break;
                case "D0": value = 1.0; break;
                case "F":  value = 0.0; break;
                default:   value = 0.0;
            }

            totalScore += score * value;
            totalCredits += score;
        }

        double average = totalScore / totalCredits;
        System.out.printf("%.6f\n", average);
    }
}
