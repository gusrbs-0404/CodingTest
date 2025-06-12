package excepion.ex0;

import java.util.Scanner;

public class MainV0 {

    public static void main(String[] args) {
        NentworkServiceV0 nentworkServiceV0 = new NentworkServiceV0();

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("전송할 문자 : ");
            String input = scanner.nextLine();
            if (input.equals("exit")) {
                break;
            }
            nentworkServiceV0.sendMessage(input);
            System.out.println();
        }
        System.out.println("프로그램 정상 종료.");
    }
}
