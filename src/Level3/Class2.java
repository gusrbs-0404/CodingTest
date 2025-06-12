package Level3;

import java.util.Scanner;

public class Class2 {
    public static void main(String[] args) {
        // 단어 길이 재기
        Scanner sc = new Scanner(System.in);

        System.out.print("단어 입력 : ");
        String text = sc.nextLine();

        System.out.println("단어 길이 : " + text.length());
    }
}
