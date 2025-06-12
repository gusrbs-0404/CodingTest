package Level3;

import java.util.Scanner;

public class Class11 {
    public static void main(String[] args) {
        // 그대로 출력하기
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("문장 입력 : ");
            String text = sc.nextLine();

            System.out.println("다시출력 : " + text);
        }
    }
}
