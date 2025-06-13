package Level4;

import java.util.Scanner;

public class Class7 {
    public static void main(String[] args) {
        // 그룹 단어 체커
        Scanner sc = new Scanner(System.in);

        String[] alphabet = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
        int[] count = new int[alphabet.length];

        // 개수 입력 받기
        System.out.print("영어 단어 입력할 개수 : ");
        int n = sc.nextInt();

        int result = 0;             // 그룹 단어 개수

        while (n-- > 0) {
            System.out.print("단어 입력 : ");
            String word = sc.next();
            boolean[] seen = new boolean[26];
            char prev = 0;
            boolean isGroup = true;

            for (char c : word.toCharArray()) {
                if (c != prev) {
                    if (seen[c - 'a']) {
                        // 이전에 나왔던 문자가 다시 나타나면 그룹 단어가 아님!
                        isGroup = false;
                        break;
                    }
                    seen[c - 'a'] = true;
                    prev = c;
                }
            }

            if (isGroup) {
                result++;
            }
        }

        System.out.println(result);
        sc.close();
    }
}
