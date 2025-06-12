package Level3;

import java.util.Scanner;

public class Class1 {
    public static void main(String[] args) {
        // 문자와 문자열
        Scanner sc = new Scanner(System.in);

        String text = "sprout";
//        String text = "shiftpsh";
//        String text = "Baekjoon";

        System.out.print("출력할 문자 번호 : ");
        int n = sc.nextInt();

        for (int i = 0; i < text.length(); i++) {
            if (i == (n-1)) {
                System.out.print(text.charAt(i));
            }
        }
    }
}
