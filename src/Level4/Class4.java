package Level4;

import java.util.Scanner;

public class Class4 {
    public static void main(String[] args) {
        // 팰린드롬인지 확인하기
        Scanner sc = new Scanner(System.in);

        System.out.print("단어 입력 : ");
        String text = sc.nextLine();

        int length = text.length();
        int check = 1;

        // 절반만 비교
        for (int i = 0; i < length/2; i++) {
            if (text.charAt(i) != text.charAt(length - i - 1)) {
                check = 0;
                break;
            }
        }
        System.out.println(check);
    }
}
