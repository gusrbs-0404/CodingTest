package Level4;

import java.util.Arrays;
import java.util.Scanner;

public class Class6 {
    public static void main(String[] args) {
        // 크로아티아 알파벳
        // 글자 수 마다 각각 검사 X
        // 한번에 돌면서 확인해야함
        // startsWith
        // 내부적으로 길이도 체해주고 문자도 찾음
        Scanner sc = new Scanner(System.in);

        System.out.print("입력 : ");
        String s = sc.nextLine();

        String[] croa = {"c=", "c-", "d-", "lj", "nj", "s=", "z="};


        int count = 0;

        for (int i = 0; i < s.length(); ) {
            // 세글자 검사
            if (s.startsWith("dz=", i)) {
                count++;
                i += 3;
            }
            // 두글자 검사
            else if (i + 1 < s.length()
                    && Arrays.asList(croa).contains(s.substring(i, i + 2))) {
                count++;
                i += 2;
            }
            // 나머진 한글자
            else {
                count++;
                i += 1;
            }
        }

        System.out.println(count);
    }
}
