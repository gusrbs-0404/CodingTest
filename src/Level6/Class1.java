package Level6;

import java.util.Scanner;

public class Class1 {
    public static void main(String[] args) {
        // 2745번 진법 변환
        Scanner sc = new Scanner(System.in);

        // N 입력받기
        System.out.print("N 입력 : ");
        String n = sc.nextLine();
        // B 입력받기
        System.out.print("B 입력 : ");
        int b = sc.nextInt();

        int value = 1;
        int result = 0;

        for (int i = n.length() -1; i >= 0; i--) {
            char c = n.charAt(i);

            if (c >= '0' && c <= '9') {
                // 숫자 문자 처리
                result += (c - '0') * value;
            } else {
                // 알파벳 문자 처리
                result += (c - 'A' + 10) * value;
            }
            value *= b;
        }
        // 결과 출력
        System.out.println(result);
    }
}
