package Level3;

import java.util.Scanner;

public class Class8 {
    public static void main(String[] args) {
        // 단어 개수
        Scanner sc = new Scanner(System.in);

        System.out.print("문장 입력 : ");
        String text = sc.nextLine();

        String[] words = text.split(" ");

        System.out.println("단어 개수 : " + words.length);
    }
}
