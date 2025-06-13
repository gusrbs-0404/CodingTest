package Level4;

import java.util.Arrays;
import java.util.Scanner;

public class Class5 {
    public static void main(String[] args) {
        // 단어 공부
        Scanner sc = new Scanner(System.in);

        System.out.print("단어 입력 : ");
        String s = sc.nextLine();

        int[] abcd = new int[26];
        for (char c : s.toCharArray()) {
            // 대문자
            if (c >= 'A' && c <= 'Z') {
                abcd[c - 'A']++;
            }
            // 소문자
            if (c >= 'a' && c <= 'z') {
                abcd[c - 'a']++;
            }
        }

        int max = -1;
        char result = '?';
        boolean isCheck = false;

        for (int i = 0; i < abcd.length; i++) {
            if(abcd[i] > max) {
                max = abcd[i];
                result = (char)('A' + i);
                // 중복 X
                isCheck = false;
            } else if(abcd[i] == max) {
                // 중복 O
                isCheck = true;
            }
        }

        if(isCheck) {
            // 중복 O
            System.out.println("?");
        } else {
            // 중복 X
            System.out.println(result);
        }
        System.out.println(Arrays.toString(abcd));
    }
}
