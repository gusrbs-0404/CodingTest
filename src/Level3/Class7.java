package Level3;

import java.util.Scanner;

public class Class7 {
    public static void main(String[] args) {
        // 문자열 반복
        Scanner sc = new Scanner(System.in);

        System.out.print("문자 입력 : ");
        String text = sc.nextLine();

        System.out.print("반복할 횟수 : ");
        int n = sc.nextInt();

        for (int i = 0; i < text.length(); i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(text.charAt(i));
            }
        }
    }
}
