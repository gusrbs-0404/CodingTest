package Level3;

import java.util.Scanner;

public class Class6 {
    public static void main(String[] args) {
        // 알파벳 찾기
        Scanner sc = new Scanner(System.in);

        System.out.print("단어 입력 : ");
        String s = sc.nextLine();

        int[] text = new int[26];

        // -1로 채우기
        for (int i = 0; i < text.length; i++) {
            text[i] = -1;
        }

        // 단어 찾기
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            int index = ch - 'a';

            if (text[index] == -1) {
                text[index] = i;
            }
        }

        // 결과
        for (int i = 0; i < text.length; i++) {
            System.out.print(text[i] + " ");
        }


    }
}
