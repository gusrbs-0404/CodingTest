package Level3;

import java.util.Scanner;

public class Class3 {
    public static void main(String[] args) {
        // 문자열
        Scanner sc = new Scanner(System.in);

        System.out.print("영어 단어 입력 : ");
        String text = sc.nextLine();

        String first = text.substring(0, 1);
        String last = text.substring(text.length() - 1);

        System.out.println(first + " " + last);
    }
}
