package Level3;

import java.util.Scanner;

public class Class4 {
    public static void main(String[] args) {
        // 아스키 코드
        Scanner sc = new Scanner(System.in);

        System.out.println("한 글자 입력 : ");
        char ch = sc.next().charAt(0);

        System.out.println((int) ch);
    }
}
